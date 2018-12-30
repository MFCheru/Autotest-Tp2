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
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.lang.Object obj6 = defaultedMap2.remove((java.lang.Object) true);
        try {
            boolean b8 = fixedOrderComparator0.addAsEqual((java.lang.Object) true, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        try {
            boolean b45 = fixedOrderComparator42.addAsEqual((java.lang.Object) 2, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        int i11 = defaultedMap1.size();
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.isEmpty();
        java.lang.Object obj21 = defaultedMap13.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = defaultedMap13.remove((java.lang.Object) 0);
        java.lang.String str24 = defaultedMap13.toString();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap13.remove(obj25);
        try {
            int i27 = fixedOrderComparator10.compare((java.lang.Object) (-1), obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{0=100}" + "'", str24.equals("{0=100}"));
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        try {
            fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        defaultedMap1.clear();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        try {
            fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        java.util.Set set17 = defaultedMap13.keySet();
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) set17);
        int i19 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) predicateUtils29);
        int i31 = defaultedMap21.size();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        try {
            int i33 = fixedOrderComparator9.compare((java.lang.Object) defaultedMap21, (java.lang.Object) predicate32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap2.remove((java.lang.Object) 10.0d);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { b13, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) ' ');
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj30 = defaultedMap22.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = defaultedMap22.remove((java.lang.Object) 0);
        java.lang.String str33 = defaultedMap22.toString();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap22.remove(obj34);
        java.lang.Object obj36 = defaultedMap2.put((java.lang.Object) fixedOrderComparator16, obj35);
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{0=100}" + "'", str33.equals("{0=100}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap8.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        boolean b22 = defaultedMap8.equals((java.lang.Object) defaultedMap16);
        java.util.Set set23 = defaultedMap8.keySet();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) set23);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100.0d);
        java.lang.Object obj51 = defaultedMap47.remove((java.lang.Object) 10.0d);
        boolean b52 = defaultedMap47.isEmpty();
        java.lang.Object obj54 = defaultedMap47.get((java.lang.Object) (byte) 100);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        defaultedMap56.clear();
        defaultedMap56.clear();
        java.lang.Object obj60 = defaultedMap56.remove((java.lang.Object) true);
        defaultedMap47.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        defaultedMap64.clear();
        defaultedMap64.clear();
        java.util.Collection collection67 = defaultedMap64.values();
        java.util.Set set68 = defaultedMap64.keySet();
        java.lang.Object obj69 = defaultedMap47.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap64);
        java.lang.Object obj70 = null;
        try {
            boolean b71 = fixedOrderComparator42.addAsEqual((java.lang.Object) "{0=100}", obj70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        int i43 = fixedOrderComparator42.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(i43 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { b9, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        try {
            boolean b13 = fixedOrderComparator0.addAsEqual((java.lang.Object) (-1.0d), (java.lang.Object) obj_array11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) (short) 1);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        defaultedMap46.clear();
        defaultedMap46.clear();
        java.util.Collection collection49 = defaultedMap46.values();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        defaultedMap51.clear();
        defaultedMap46.putAll((java.util.Map) defaultedMap51);
        java.util.Set set55 = defaultedMap51.keySet();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        defaultedMap57.clear();
        defaultedMap57.clear();
        java.util.Collection collection60 = defaultedMap57.values();
        defaultedMap57.clear();
        int i62 = defaultedMap57.size();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 'a');
        try {
            boolean b65 = fixedOrderComparator42.addAsEqual((java.lang.Object) set55, (java.lang.Object) map64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        int i63 = fixedOrderComparator42.compare((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap59);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 100.0d);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) 10.0d);
        boolean b70 = defaultedMap65.isEmpty();
        java.lang.Object obj73 = defaultedMap65.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj75 = defaultedMap65.remove((java.lang.Object) 0);
        defaultedMap49.putAll((java.util.Map) defaultedMap65);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.String str3 = defaultedMap2.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) defaultedMap5);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) (short) 1);
        try {
            fixedOrderComparator42.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.String str3 = defaultedMap2.toString();
        java.lang.String str4 = defaultedMap2.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100.0d);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) 10.0d);
        boolean b11 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = defaultedMap2.put(obj14, (java.lang.Object) (short) 100);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator9.setUnknownObjectBehavior(1);
        int i16 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj22 = defaultedMap12.remove((java.lang.Object) 0);
        java.lang.String str23 = defaultedMap12.toString();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap12.remove(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap27.isEmpty();
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        defaultedMap36.clear();
        defaultedMap36.clear();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) true);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.util.Collection collection47 = defaultedMap44.values();
        java.util.Set set48 = defaultedMap44.keySet();
        java.lang.Object obj49 = defaultedMap27.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap44);
        defaultedMap12.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate51, predicate52);
        collections.Predicate predicate54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        try {
            boolean b58 = fixedOrderComparator10.addAsEqual((java.lang.Object) defaultedMap27, (java.lang.Object) predicate57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{0=100}" + "'", str23.equals("{0=100}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = defaultedMap5.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = defaultedMap1.put(obj13, (java.lang.Object) (short) 100);
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        defaultedMap11.clear();
        java.util.Collection collection14 = defaultedMap11.values();
        defaultedMap11.clear();
        int i16 = defaultedMap11.size();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 'a');
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap18.isEmpty();
        boolean b24 = defaultedMap10.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap10);
        java.util.Set set26 = defaultedMap10.entrySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        defaultedMap12.clear();
        defaultedMap12.clear();
        java.util.Collection collection15 = defaultedMap12.values();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap17.isEmpty();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { b22, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        defaultedMap31.clear();
        defaultedMap31.clear();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) true);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap31.get(obj36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 100.0d);
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) 10.0d);
        boolean b47 = defaultedMap42.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj50 = defaultedMap39.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { (byte) 10, collection15, obj_array24, defaultedMap28, obj36, obj50 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b54 = fixedOrderComparator52.add((java.lang.Object) '4');
        int i55 = fixedOrderComparator52.getUnknownObjectBehavior();
        fixedOrderComparator52.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        java.util.Collection collection62 = defaultedMap59.values();
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        defaultedMap64.clear();
        defaultedMap64.clear();
        java.util.Collection collection67 = defaultedMap64.values();
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        defaultedMap69.clear();
        defaultedMap69.clear();
        defaultedMap64.putAll((java.util.Map) defaultedMap69);
        int i73 = fixedOrderComparator52.compare((java.lang.Object) defaultedMap59, (java.lang.Object) defaultedMap69);
        boolean b74 = fixedOrderComparator9.add((java.lang.Object) i73);
        boolean b75 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 10.0d);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap19.isEmpty();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { b24, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) ' ');
        fixedOrderComparator27.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = defaultedMap33.remove((java.lang.Object) 0);
        java.lang.String str44 = defaultedMap33.toString();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap33.remove(obj45);
        java.lang.Object obj47 = defaultedMap13.put((java.lang.Object) fixedOrderComparator27, obj46);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        boolean b52 = defaultedMap49.containsKey((java.lang.Object) 1.0d);
        boolean b53 = fixedOrderComparator27.add((java.lang.Object) 1.0d);
        try {
            int i54 = fixedOrderComparator10.compare((java.lang.Object) 0L, (java.lang.Object) b53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{0=100}" + "'", str44.equals("{0=100}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        int i63 = fixedOrderComparator42.compare((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap59);
        boolean b64 = fixedOrderComparator42.isLocked();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { b10, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) ' ');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        defaultedMap17.clear();
        java.util.Collection collection20 = defaultedMap17.values();
        defaultedMap17.clear();
        try {
            int i22 = fixedOrderComparator0.compare((java.lang.Object) ' ', (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection23 = defaultedMap20.values();
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        try {
            int i15 = fixedOrderComparator10.compare((java.lang.Object) fixedOrderComparator11, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap17.isEmpty();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { b22, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) ' ');
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.isEmpty();
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap31.remove((java.lang.Object) 0);
        java.lang.String str42 = defaultedMap31.toString();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap31.remove(obj43);
        java.lang.Object obj45 = defaultedMap11.put((java.lang.Object) fixedOrderComparator25, obj44);
        boolean b46 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        defaultedMap11.clear();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 100.0d);
        java.lang.Object obj53 = defaultedMap49.remove((java.lang.Object) 10.0d);
        boolean b54 = defaultedMap49.isEmpty();
        java.lang.Object obj56 = defaultedMap49.get((java.lang.Object) (byte) 100);
        java.util.Collection collection57 = defaultedMap49.values();
        java.lang.Object obj58 = defaultedMap11.get((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{0=100}" + "'", str42.equals("{0=100}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate18 = null;
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.String str31 = defaultedMap20.toString();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap20.remove(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        defaultedMap52.clear();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Set set56 = defaultedMap52.keySet();
        java.lang.Object obj57 = defaultedMap35.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap52);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate60);
        java.util.Set set63 = defaultedMap1.keySet();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 100.0d);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) 10.0d);
        boolean b70 = defaultedMap65.isEmpty();
        java.lang.Object obj72 = defaultedMap65.get((java.lang.Object) (byte) 100);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        defaultedMap74.clear();
        defaultedMap74.clear();
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) true);
        defaultedMap65.putAll((java.util.Map) defaultedMap74);
        java.lang.Object obj80 = null;
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj80);
        java.lang.String str82 = defaultedMap81.toString();
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) 100.0d);
        java.lang.Object obj88 = defaultedMap84.remove((java.lang.Object) 10.0d);
        boolean b89 = defaultedMap84.isEmpty();
        defaultedMap81.putAll((java.util.Map) defaultedMap84);
        java.lang.Object obj92 = defaultedMap81.get((java.lang.Object) 100L);
        java.lang.Object obj93 = defaultedMap65.get(obj92);
        boolean b94 = defaultedMap1.equals((java.lang.Object) defaultedMap65);
        collections.Factory factory95 = null;
        try {
            java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, factory95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{0=100}" + "'", str31.equals("{0=100}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = defaultedMap5.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = defaultedMap1.put(obj13, (java.lang.Object) (short) 100);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate(map17, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        defaultedMap14.clear();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap14.get(obj19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Collection collection30 = defaultedMap22.values();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) collection30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap33.entrySet();
        java.lang.Object obj42 = defaultedMap12.put((java.lang.Object) map31, (java.lang.Object) defaultedMap33);
        java.lang.Object obj43 = defaultedMap4.remove(obj42);
        int i44 = defaultedMap4.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0d);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100.0d);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) 10.0d);
        boolean b59 = defaultedMap54.isEmpty();
        java.lang.Object obj61 = defaultedMap54.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array68 = new java.lang.Object[] { predicate43, 10.0f, (-1.0d), predicate62, defaultedMap67 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array68);
        fixedOrderComparator70.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(obj_array68);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        java.util.Set set17 = defaultedMap13.keySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) set17);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { b17, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) ' ');
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator20.setUnknownObjectBehavior(1);
        boolean b27 = defaultedMap6.containsValue((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap6.values();
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.isEmpty();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) (byte) 100);
        java.util.Set set32 = defaultedMap24.entrySet();
        java.util.Set set33 = defaultedMap24.entrySet();
        boolean b34 = defaultedMap12.containsValue((java.lang.Object) defaultedMap24);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        defaultedMap36.clear();
        defaultedMap36.clear();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) true);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap36.get(obj41);
        java.util.Collection collection43 = defaultedMap36.values();
        boolean b44 = defaultedMap24.equals((java.lang.Object) collection43);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate10);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        defaultedMap14.clear();
        java.util.Collection collection17 = defaultedMap14.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap19.isEmpty();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { b24, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap33.get(obj38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.String str42 = defaultedMap41.toString();
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100.0d);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap44.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj52 = defaultedMap41.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { (byte) 10, collection17, obj_array26, defaultedMap30, obj38, obj52 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b56 = fixedOrderComparator54.add((java.lang.Object) '4');
        int i57 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 100.0d);
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) 10.0d);
        boolean b67 = defaultedMap62.isEmpty();
        java.lang.Object obj69 = defaultedMap62.get((java.lang.Object) (byte) 100);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        defaultedMap71.clear();
        defaultedMap71.clear();
        java.lang.Object obj75 = defaultedMap71.remove((java.lang.Object) true);
        defaultedMap62.putAll((java.util.Map) defaultedMap71);
        defaultedMap62.clear();
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 100.0d);
        java.lang.Object obj83 = defaultedMap79.remove((java.lang.Object) 10.0d);
        boolean b84 = defaultedMap79.isEmpty();
        java.lang.Object[] obj_array86 = new java.lang.Object[] { b84, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array86);
        boolean b89 = fixedOrderComparator87.add((java.lang.Object) ' ');
        fixedOrderComparator87.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator87.setUnknownObjectBehavior(1);
        boolean b94 = fixedOrderComparator87.isLocked();
        java.lang.Object obj95 = defaultedMap1.put((java.lang.Object) defaultedMap62, (java.lang.Object) fixedOrderComparator87);
        java.lang.String str96 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(obj_array86);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        defaultedMap5.clear();
        defaultedMap5.clear();
        java.util.Collection collection8 = defaultedMap5.values();
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        defaultedMap14.clear();
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap19.isEmpty();
        java.lang.Object obj27 = defaultedMap19.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj29 = defaultedMap19.remove((java.lang.Object) 0);
        java.lang.String str30 = defaultedMap19.toString();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap19.remove(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) 10.0d);
        boolean b39 = defaultedMap34.isEmpty();
        java.lang.Object obj41 = defaultedMap34.get((java.lang.Object) (byte) 100);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        defaultedMap43.clear();
        java.lang.Object obj47 = defaultedMap43.remove((java.lang.Object) true);
        defaultedMap34.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        defaultedMap51.clear();
        java.util.Collection collection54 = defaultedMap51.values();
        java.util.Set set55 = defaultedMap51.keySet();
        java.lang.Object obj56 = defaultedMap34.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap51);
        defaultedMap19.putAll((java.util.Map) defaultedMap34);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate58, predicate59);
        java.lang.Object obj61 = defaultedMap5.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) predicate58);
        java.lang.Object obj62 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator11);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{0=100}" + "'", str30.equals("{0=100}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        defaultedMap11.clear();
        java.util.Collection collection14 = defaultedMap11.values();
        defaultedMap11.clear();
        int i16 = defaultedMap11.size();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 'a');
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        boolean b20 = defaultedMap1.isEmpty();
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection23 = defaultedMap12.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap15.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap23.isEmpty();
        boolean b29 = defaultedMap15.equals((java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.String str32 = defaultedMap31.toString();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { b40, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = fixedOrderComparator43.add((java.lang.Object) ' ');
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        defaultedMap47.clear();
        java.util.Collection collection50 = defaultedMap47.values();
        java.util.Set set51 = defaultedMap47.keySet();
        boolean b52 = fixedOrderComparator43.add((java.lang.Object) set51);
        int i53 = fixedOrderComparator43.getUnknownObjectBehavior();
        boolean b54 = defaultedMap31.equals((java.lang.Object) fixedOrderComparator43);
        java.lang.Object obj55 = defaultedMap4.get((java.lang.Object) fixedOrderComparator43);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap18.isEmpty();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { b23, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b28 = fixedOrderComparator26.add((java.lang.Object) ' ');
        fixedOrderComparator26.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator26.setUnknownObjectBehavior(1);
        boolean b33 = fixedOrderComparator26.isLocked();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = defaultedMap12.put((java.lang.Object) b33, obj42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        int i45 = fixedOrderComparator44.getUnknownObjectBehavior();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        defaultedMap47.clear();
        boolean b50 = fixedOrderComparator44.add((java.lang.Object) defaultedMap47);
        try {
            int i51 = fixedOrderComparator9.compare((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        defaultedMap11.clear();
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { b21, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        defaultedMap27.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        defaultedMap30.clear();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) true);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap30.get(obj35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.String str39 = defaultedMap38.toString();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 100.0d);
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) 10.0d);
        boolean b46 = defaultedMap41.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj49 = defaultedMap38.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (byte) 10, collection14, obj_array23, defaultedMap27, obj35, obj49 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b53 = fixedOrderComparator51.add((java.lang.Object) '4');
        int i54 = fixedOrderComparator51.getUnknownObjectBehavior();
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        int i57 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) i57);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap17.isEmpty();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { b22, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) ' ');
        fixedOrderComparator25.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.isEmpty();
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap31.remove((java.lang.Object) 0);
        java.lang.String str42 = defaultedMap31.toString();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap31.remove(obj43);
        java.lang.Object obj45 = defaultedMap11.put((java.lang.Object) fixedOrderComparator25, obj44);
        boolean b46 = defaultedMap6.containsValue((java.lang.Object) defaultedMap11);
        java.lang.String str47 = defaultedMap6.toString();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{0=100}" + "'", str42.equals("{0=100}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate19, predicate20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) predicate20, (java.lang.Object) defaultedMap23);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj26);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection40 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate18 = null;
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.String str31 = defaultedMap20.toString();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap20.remove(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        defaultedMap52.clear();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Set set56 = defaultedMap52.keySet();
        java.lang.Object obj57 = defaultedMap35.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap52);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate60);
        java.util.Set set63 = defaultedMap1.keySet();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 100.0d);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) 10.0d);
        boolean b70 = defaultedMap65.isEmpty();
        java.lang.Object obj72 = defaultedMap65.get((java.lang.Object) (byte) 100);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        defaultedMap74.clear();
        defaultedMap74.clear();
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) true);
        defaultedMap65.putAll((java.util.Map) defaultedMap74);
        java.lang.Object obj80 = null;
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj80);
        java.lang.String str82 = defaultedMap81.toString();
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) 100.0d);
        java.lang.Object obj88 = defaultedMap84.remove((java.lang.Object) 10.0d);
        boolean b89 = defaultedMap84.isEmpty();
        defaultedMap81.putAll((java.util.Map) defaultedMap84);
        java.lang.Object obj92 = defaultedMap81.get((java.lang.Object) 100L);
        java.lang.Object obj93 = defaultedMap65.get(obj92);
        boolean b94 = defaultedMap1.equals((java.lang.Object) defaultedMap65);
        java.util.Collection collection95 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{0=100}" + "'", str31.equals("{0=100}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNotNull(collection95);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.String str9 = defaultedMap7.toString();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap7.put(obj19, (java.lang.Object) (short) 100);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        defaultedMap26.clear();
        java.util.Collection collection29 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0d);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap36.isEmpty();
        java.lang.Object obj44 = defaultedMap36.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj46 = defaultedMap32.put(obj44, (java.lang.Object) (short) 100);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1L));
        java.lang.Object obj49 = defaultedMap30.get((java.lang.Object) (-1L));
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        defaultedMap51.clear();
        java.util.Collection collection54 = defaultedMap51.values();
        defaultedMap51.clear();
        int i56 = defaultedMap51.size();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 'a');
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        defaultedMap60.clear();
        java.lang.Object obj63 = defaultedMap51.get((java.lang.Object) defaultedMap60);
        java.lang.Object obj64 = defaultedMap5.put((java.lang.Object) defaultedMap30, obj63);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        defaultedMap66.clear();
        defaultedMap66.clear();
        java.util.Collection collection69 = defaultedMap66.values();
        java.lang.Object obj71 = defaultedMap66.get((java.lang.Object) (short) 10);
        java.util.Collection collection72 = defaultedMap66.values();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap66);
        java.lang.Object obj74 = defaultedMap30.get((java.lang.Object) defaultedMap66);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 100.0d);
        java.lang.Object obj80 = defaultedMap76.remove((java.lang.Object) 10.0d);
        boolean b81 = defaultedMap76.isEmpty();
        java.lang.Object obj83 = defaultedMap76.get((java.lang.Object) (byte) 100);
        java.util.Set set84 = defaultedMap76.entrySet();
        java.lang.Object obj85 = null;
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap(obj85);
        defaultedMap86.clear();
        defaultedMap86.clear();
        java.util.Collection collection89 = defaultedMap86.values();
        defaultedMap86.clear();
        int i91 = defaultedMap86.size();
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap86, (java.lang.Object) 'a');
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 'a');
        boolean b95 = defaultedMap66.containsKey((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        defaultedMap1.clear();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        defaultedMap13.clear();
        int i18 = defaultedMap13.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 'a');
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map20, (java.lang.Object) 0.0f);
        defaultedMap1.putAll(map20);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100.0d);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) 10.0d);
        boolean b33 = defaultedMap28.isEmpty();
        java.lang.Object obj35 = defaultedMap28.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate36, predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 100.0d);
        java.lang.Object obj43 = defaultedMap25.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap40);
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.isEmpty();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) (byte) 100);
        java.util.Set set32 = defaultedMap24.entrySet();
        java.util.Set set33 = defaultedMap24.entrySet();
        boolean b34 = defaultedMap12.containsValue((java.lang.Object) defaultedMap24);
        boolean b35 = defaultedMap24.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        defaultedMap19.clear();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        defaultedMap26.clear();
        java.util.Collection collection29 = defaultedMap26.values();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        defaultedMap31.clear();
        defaultedMap31.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap31);
        boolean b35 = defaultedMap19.containsKey((java.lang.Object) defaultedMap26);
        java.util.Set set36 = defaultedMap19.keySet();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.isEmpty();
        java.lang.Object obj18 = defaultedMap10.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.String str21 = defaultedMap10.toString();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap10.remove(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap25.isEmpty();
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        defaultedMap34.clear();
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) true);
        defaultedMap25.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        defaultedMap42.clear();
        java.util.Collection collection45 = defaultedMap42.values();
        java.util.Set set46 = defaultedMap42.keySet();
        java.lang.Object obj47 = defaultedMap25.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap42);
        defaultedMap10.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj51 = defaultedMap10.get((java.lang.Object) defaultedMap50);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{0=100}" + "'", str21.equals("{0=100}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        java.util.Set set33 = defaultedMap22.keySet();
        java.util.Set set34 = defaultedMap22.entrySet();
        int i35 = defaultedMap22.size();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) '#');
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0d);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100.0d);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) 10.0d);
        boolean b59 = defaultedMap54.isEmpty();
        java.lang.Object obj61 = defaultedMap54.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array68 = new java.lang.Object[] { predicate43, 10.0f, (-1.0d), predicate62, defaultedMap67 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.lang.String str75 = defaultedMap74.toString();
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) 100.0d);
        java.lang.Object obj81 = defaultedMap77.remove((java.lang.Object) 10.0d);
        boolean b82 = defaultedMap77.isEmpty();
        defaultedMap74.putAll((java.util.Map) defaultedMap77);
        boolean b84 = fixedOrderComparator72.add((java.lang.Object) defaultedMap77);
        java.lang.String str85 = defaultedMap77.toString();
        java.util.Collection collection86 = defaultedMap77.values();
        try {
            boolean b87 = fixedOrderComparator70.addAsEqual((java.lang.Object) '#', (java.lang.Object) collection86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNotNull(collection86);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.util.Set set18 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        int i63 = fixedOrderComparator42.compare((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap59);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.String str66 = defaultedMap65.toString();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 100.0d);
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) 10.0d);
        boolean b73 = defaultedMap68.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 100.0d);
        java.lang.Object obj80 = defaultedMap76.remove((java.lang.Object) 10.0d);
        boolean b81 = defaultedMap76.isEmpty();
        boolean b82 = defaultedMap68.equals((java.lang.Object) defaultedMap76);
        java.util.Set set83 = defaultedMap68.keySet();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap68);
        collections.Transformer transformer85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, transformer85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        int i63 = fixedOrderComparator42.compare((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap59);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.String str66 = defaultedMap65.toString();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 100.0d);
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) 10.0d);
        boolean b73 = defaultedMap68.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        try {
            boolean b75 = fixedOrderComparator42.add((java.lang.Object) defaultedMap65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.Object obj16 = defaultedMap8.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.String str19 = defaultedMap8.toString();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap8.remove(obj20);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap23.isEmpty();
        java.lang.Object obj30 = defaultedMap23.get((java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        defaultedMap32.clear();
        defaultedMap32.clear();
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) true);
        defaultedMap23.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        defaultedMap40.clear();
        defaultedMap40.clear();
        java.util.Collection collection43 = defaultedMap40.values();
        java.util.Set set44 = defaultedMap40.keySet();
        java.lang.Object obj45 = defaultedMap23.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap40);
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj49 = defaultedMap8.get((java.lang.Object) defaultedMap48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        boolean b53 = defaultedMap1.equals((java.lang.Object) predicate50);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{0=100}" + "'", str19.equals("{0=100}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        defaultedMap8.clear();
        int i13 = defaultedMap8.size();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 'a');
        java.lang.Object[] obj_array16 = new java.lang.Object[] { defaultedMap8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator18);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        java.lang.Object obj11 = defaultedMap4.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate13, (java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        boolean b38 = defaultedMap24.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap32.putAll((java.util.Map) defaultedMap40);
        java.util.Collection collection43 = defaultedMap40.values();
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        java.util.Set set45 = defaultedMap40.entrySet();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap27.isEmpty();
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100.0d);
        java.lang.Object obj42 = defaultedMap24.put((java.lang.Object) predicate36, (java.lang.Object) defaultedMap39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100.0d);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap44.isEmpty();
        java.lang.Object obj52 = defaultedMap44.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj54 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.String str55 = defaultedMap44.toString();
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap44.remove(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100.0d);
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) 10.0d);
        boolean b64 = defaultedMap59.isEmpty();
        java.lang.Object obj66 = defaultedMap59.get((java.lang.Object) (byte) 100);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        defaultedMap68.clear();
        defaultedMap68.clear();
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) true);
        defaultedMap59.putAll((java.util.Map) defaultedMap68);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        defaultedMap76.clear();
        defaultedMap76.clear();
        java.util.Collection collection79 = defaultedMap76.values();
        java.util.Set set80 = defaultedMap76.keySet();
        java.lang.Object obj81 = defaultedMap59.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap76);
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate36, predicate83);
        defaultedMap12.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{0=100}" + "'", str55.equals("{0=100}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate18 = null;
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.String str31 = defaultedMap20.toString();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap20.remove(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        defaultedMap52.clear();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Set set56 = defaultedMap52.keySet();
        java.lang.Object obj57 = defaultedMap35.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap52);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate60);
        int i63 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{0=100}" + "'", str31.equals("{0=100}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(i63 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { b17, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) ' ');
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator20.setUnknownObjectBehavior(1);
        boolean b27 = defaultedMap6.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 100.0d);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) 10.0d);
        boolean b35 = defaultedMap30.isEmpty();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { b35, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj40 = defaultedMap6.get((java.lang.Object) obj_array37);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap17.isEmpty();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { b22, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) ' ');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100.0d);
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) 10.0d);
        boolean b34 = defaultedMap29.isEmpty();
        java.lang.Object obj37 = defaultedMap29.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100.0d);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap39.isEmpty();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { b44, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b49 = fixedOrderComparator47.add((java.lang.Object) ' ');
        fixedOrderComparator47.setUnknownObjectBehavior((int) (byte) 0);
        boolean b52 = defaultedMap29.containsKey((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = defaultedMap10.put((java.lang.Object) ' ', (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) true);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap17.get(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap25.isEmpty();
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (byte) 100);
        java.util.Collection collection33 = defaultedMap25.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) collection33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0d);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap36.isEmpty();
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) (byte) 100);
        java.util.Set set44 = defaultedMap36.entrySet();
        java.lang.Object obj45 = defaultedMap15.put((java.lang.Object) map34, (java.lang.Object) defaultedMap36);
        defaultedMap36.clear();
        java.util.Set set47 = defaultedMap36.keySet();
        boolean b48 = fixedOrderComparator9.add((java.lang.Object) set47);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        java.util.Set set17 = defaultedMap13.keySet();
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) set17);
        boolean b19 = fixedOrderComparator9.isLocked();
        int i20 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.isEmpty();
        java.lang.Object obj18 = defaultedMap10.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.String str21 = defaultedMap10.toString();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap10.remove(obj22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap25.isEmpty();
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        defaultedMap34.clear();
        defaultedMap34.clear();
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) true);
        defaultedMap25.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        defaultedMap42.clear();
        defaultedMap42.clear();
        java.util.Collection collection45 = defaultedMap42.values();
        java.util.Set set46 = defaultedMap42.keySet();
        java.lang.Object obj47 = defaultedMap25.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap42);
        defaultedMap10.putAll((java.util.Map) defaultedMap25);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate49, predicate50);
        collections.Predicate predicate52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate52, predicate55);
        collections.Factory factory57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{0=100}" + "'", str21.equals("{0=100}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        defaultedMap17.clear();
        defaultedMap17.clear();
        java.util.Collection collection20 = defaultedMap17.values();
        defaultedMap17.clear();
        int i22 = defaultedMap17.size();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 'a');
        java.util.Map map26 = collections.map.DefaultedMap.decorate(map24, (java.lang.Object) 0.0f);
        defaultedMap10.putAll(map24);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        defaultedMap30.clear();
        java.util.Collection collection33 = defaultedMap30.values();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { b40, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        defaultedMap46.clear();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.lang.Object obj53 = defaultedMap49.remove((java.lang.Object) true);
        java.lang.Object obj54 = null;
        java.lang.Object obj55 = defaultedMap49.get(obj54);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.String str58 = defaultedMap57.toString();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 100.0d);
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) 10.0d);
        boolean b65 = defaultedMap60.isEmpty();
        defaultedMap57.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj68 = defaultedMap57.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { (byte) 10, collection33, obj_array42, defaultedMap46, obj54, obj68 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b72 = fixedOrderComparator70.add((java.lang.Object) '4');
        int i73 = fixedOrderComparator70.getUnknownObjectBehavior();
        fixedOrderComparator70.setUnknownObjectBehavior(0);
        boolean b76 = defaultedMap10.equals((java.lang.Object) fixedOrderComparator70);
        try {
            fixedOrderComparator70.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(i73 == 2);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        java.util.Set set33 = defaultedMap22.keySet();
        java.util.Set set34 = defaultedMap22.entrySet();
        java.lang.Object obj36 = defaultedMap22.get((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate40, predicate41);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate43, predicate44);
        boolean b46 = defaultedMap16.isEmpty();
        java.util.Set set47 = defaultedMap16.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) 1.0d);
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        defaultedMap23.clear();
        java.util.Collection collection26 = defaultedMap23.values();
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        defaultedMap28.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        boolean b32 = defaultedMap16.containsKey((java.lang.Object) defaultedMap23);
        collections.Predicate predicate33 = null;
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj45 = defaultedMap35.remove((java.lang.Object) 0);
        java.lang.String str46 = defaultedMap35.toString();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap35.remove(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100.0d);
        java.lang.Object obj54 = defaultedMap50.remove((java.lang.Object) 10.0d);
        boolean b55 = defaultedMap50.isEmpty();
        java.lang.Object obj57 = defaultedMap50.get((java.lang.Object) (byte) 100);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) true);
        defaultedMap50.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        defaultedMap67.clear();
        defaultedMap67.clear();
        java.util.Collection collection70 = defaultedMap67.values();
        java.util.Set set71 = defaultedMap67.keySet();
        java.lang.Object obj72 = defaultedMap50.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap67);
        defaultedMap35.putAll((java.util.Map) defaultedMap50);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate33, predicate75);
        java.util.Set set78 = defaultedMap16.keySet();
        java.lang.Object obj79 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{0=100}" + "'", str46.equals("{0=100}"));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        java.util.Set set33 = defaultedMap22.keySet();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj45 = defaultedMap35.remove((java.lang.Object) 0);
        java.lang.String str46 = defaultedMap35.toString();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap35.remove(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100.0d);
        java.lang.Object obj54 = defaultedMap50.remove((java.lang.Object) 10.0d);
        boolean b55 = defaultedMap50.isEmpty();
        java.lang.Object obj57 = defaultedMap50.get((java.lang.Object) (byte) 100);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) true);
        defaultedMap50.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        defaultedMap67.clear();
        defaultedMap67.clear();
        java.util.Collection collection70 = defaultedMap67.values();
        java.util.Set set71 = defaultedMap67.keySet();
        java.lang.Object obj72 = defaultedMap50.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap67);
        defaultedMap35.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj76 = defaultedMap35.get((java.lang.Object) defaultedMap75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate77, predicate78);
        boolean b80 = defaultedMap22.containsValue((java.lang.Object) defaultedMap75);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{0=100}" + "'", str46.equals("{0=100}"));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.String str9 = defaultedMap7.toString();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap7.put(obj19, (java.lang.Object) (short) 100);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        defaultedMap26.clear();
        java.util.Collection collection29 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0d);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap36.isEmpty();
        java.lang.Object obj44 = defaultedMap36.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj46 = defaultedMap32.put(obj44, (java.lang.Object) (short) 100);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1L));
        java.lang.Object obj49 = defaultedMap30.get((java.lang.Object) (-1L));
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        defaultedMap51.clear();
        java.util.Collection collection54 = defaultedMap51.values();
        defaultedMap51.clear();
        int i56 = defaultedMap51.size();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 'a');
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        defaultedMap60.clear();
        java.lang.Object obj63 = defaultedMap51.get((java.lang.Object) defaultedMap60);
        java.lang.Object obj64 = defaultedMap5.put((java.lang.Object) defaultedMap30, obj63);
        java.lang.Object obj65 = null;
        boolean b66 = defaultedMap30.containsKey(obj65);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate18 = null;
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.String str31 = defaultedMap20.toString();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap20.remove(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        defaultedMap52.clear();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Set set56 = defaultedMap52.keySet();
        java.lang.Object obj57 = defaultedMap35.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap52);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate60);
        java.util.Set set63 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{0=100}" + "'", str31.equals("{0=100}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.util.Set set19 = defaultedMap4.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj30 = defaultedMap22.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = defaultedMap22.remove((java.lang.Object) 0);
        java.lang.String str33 = defaultedMap22.toString();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap22.remove(obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap37.isEmpty();
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) (byte) 100);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        defaultedMap46.clear();
        defaultedMap46.clear();
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) true);
        defaultedMap37.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.util.Set set58 = defaultedMap54.keySet();
        java.lang.Object obj59 = defaultedMap37.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap54);
        defaultedMap22.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj63 = defaultedMap22.get((java.lang.Object) defaultedMap62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate20, predicate64);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{0=100}" + "'", str33.equals("{0=100}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        java.util.Set set14 = defaultedMap1.keySet();
        java.util.Set set15 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate18 = null;
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.String str31 = defaultedMap20.toString();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap20.remove(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        defaultedMap52.clear();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Set set56 = defaultedMap52.keySet();
        java.lang.Object obj57 = defaultedMap35.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap52);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate60);
        java.util.Set set63 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{0=100}" + "'", str31.equals("{0=100}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        try {
            fixedOrderComparator42.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        defaultedMap18.clear();
        java.util.Collection collection21 = defaultedMap18.values();
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap18);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) 1.0d);
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.util.Set set15 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        defaultedMap13.clear();
        int i18 = defaultedMap13.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 'a');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) defaultedMap22);
        java.util.Set set26 = defaultedMap13.keySet();
        int i27 = defaultedMap13.size();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 1.0d);
        int i33 = defaultedMap29.size();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0d);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap38.isEmpty();
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100.0d);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap46.isEmpty();
        boolean b52 = defaultedMap38.equals((java.lang.Object) defaultedMap46);
        java.lang.Object obj53 = defaultedMap29.remove((java.lang.Object) defaultedMap38);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.String str56 = defaultedMap55.toString();
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 100.0d);
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) 10.0d);
        boolean b63 = defaultedMap58.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 100.0d);
        java.lang.Object obj70 = defaultedMap66.remove((java.lang.Object) 10.0d);
        boolean b71 = defaultedMap66.isEmpty();
        boolean b72 = defaultedMap58.equals((java.lang.Object) defaultedMap66);
        java.util.Set set73 = defaultedMap58.keySet();
        java.lang.Object obj74 = defaultedMap38.get((java.lang.Object) defaultedMap58);
        boolean b75 = fixedOrderComparator11.addAsEqual((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap58);
        java.util.Set set76 = defaultedMap13.keySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate10);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        defaultedMap14.clear();
        java.util.Collection collection17 = defaultedMap14.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap19.isEmpty();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { b24, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap33.get(obj38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.String str42 = defaultedMap41.toString();
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100.0d);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap44.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj52 = defaultedMap41.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { (byte) 10, collection17, obj_array26, defaultedMap30, obj38, obj52 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b56 = fixedOrderComparator54.add((java.lang.Object) '4');
        int i57 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 100.0d);
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) 10.0d);
        boolean b67 = defaultedMap62.isEmpty();
        java.lang.Object obj69 = defaultedMap62.get((java.lang.Object) (byte) 100);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        defaultedMap71.clear();
        defaultedMap71.clear();
        java.lang.Object obj75 = defaultedMap71.remove((java.lang.Object) true);
        defaultedMap62.putAll((java.util.Map) defaultedMap71);
        defaultedMap62.clear();
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 100.0d);
        java.lang.Object obj83 = defaultedMap79.remove((java.lang.Object) 10.0d);
        boolean b84 = defaultedMap79.isEmpty();
        java.lang.Object[] obj_array86 = new java.lang.Object[] { b84, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array86);
        boolean b89 = fixedOrderComparator87.add((java.lang.Object) ' ');
        fixedOrderComparator87.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator87.setUnknownObjectBehavior(1);
        boolean b94 = fixedOrderComparator87.isLocked();
        java.lang.Object obj95 = defaultedMap1.put((java.lang.Object) defaultedMap62, (java.lang.Object) fixedOrderComparator87);
        collections.Transformer transformer96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, transformer96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(obj_array86);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) ' ');
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = defaultedMap21.remove((java.lang.Object) 0);
        java.lang.String str32 = defaultedMap21.toString();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap21.remove(obj33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) fixedOrderComparator15, obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj47 = defaultedMap37.remove((java.lang.Object) 0);
        java.lang.String str48 = defaultedMap37.toString();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap37.remove(obj49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 100.0d);
        java.lang.Object obj56 = defaultedMap52.remove((java.lang.Object) 10.0d);
        boolean b57 = defaultedMap52.isEmpty();
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) (byte) 100);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        defaultedMap61.clear();
        defaultedMap61.clear();
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) true);
        defaultedMap52.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        defaultedMap69.clear();
        defaultedMap69.clear();
        java.util.Collection collection72 = defaultedMap69.values();
        java.util.Set set73 = defaultedMap69.keySet();
        java.lang.Object obj74 = defaultedMap52.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap69);
        defaultedMap37.putAll((java.util.Map) defaultedMap52);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate76, predicate77);
        boolean b79 = fixedOrderComparator15.add((java.lang.Object) predicate76);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{0=100}" + "'", str32.equals("{0=100}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{0=100}" + "'", str48.equals("{0=100}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { b21, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) ' ');
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        boolean b29 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.isEmpty();
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap31.remove((java.lang.Object) 0);
        java.lang.String str42 = defaultedMap31.toString();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap31.remove(obj43);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100.0d);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap46.isEmpty();
        java.lang.Object obj53 = defaultedMap46.get((java.lang.Object) (byte) 100);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        defaultedMap55.clear();
        defaultedMap55.clear();
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) true);
        defaultedMap46.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        defaultedMap63.clear();
        defaultedMap63.clear();
        java.util.Collection collection66 = defaultedMap63.values();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = defaultedMap46.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap63);
        defaultedMap31.putAll((java.util.Map) defaultedMap46);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate70, predicate71);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) defaultedMap46);
        int i74 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{0=100}" + "'", str42.equals("{0=100}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i74 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap27.isEmpty();
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100.0d);
        java.lang.Object obj42 = defaultedMap24.put((java.lang.Object) predicate36, (java.lang.Object) defaultedMap39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100.0d);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap44.isEmpty();
        java.lang.Object obj52 = defaultedMap44.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj54 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.String str55 = defaultedMap44.toString();
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap44.remove(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100.0d);
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) 10.0d);
        boolean b64 = defaultedMap59.isEmpty();
        java.lang.Object obj66 = defaultedMap59.get((java.lang.Object) (byte) 100);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        defaultedMap68.clear();
        defaultedMap68.clear();
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) true);
        defaultedMap59.putAll((java.util.Map) defaultedMap68);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        defaultedMap76.clear();
        defaultedMap76.clear();
        java.util.Collection collection79 = defaultedMap76.values();
        java.util.Set set80 = defaultedMap76.keySet();
        java.lang.Object obj81 = defaultedMap59.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap76);
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate36, predicate83);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{0=100}" + "'", str55.equals("{0=100}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        java.util.Set set7 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        defaultedMap20.clear();
        defaultedMap20.clear();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) true);
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 10.0d);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { b38, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) ' ');
        fixedOrderComparator41.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100.0d);
        java.lang.Object obj51 = defaultedMap47.remove((java.lang.Object) 10.0d);
        boolean b52 = defaultedMap47.isEmpty();
        java.lang.Object obj55 = defaultedMap47.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = defaultedMap47.remove((java.lang.Object) 0);
        java.lang.String str58 = defaultedMap47.toString();
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap47.remove(obj59);
        java.lang.Object obj61 = defaultedMap27.put((java.lang.Object) fixedOrderComparator41, obj60);
        java.lang.Object obj62 = defaultedMap11.get(obj61);
        defaultedMap11.clear();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        defaultedMap65.clear();
        defaultedMap65.clear();
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) true);
        defaultedMap11.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        defaultedMap72.clear();
        defaultedMap72.clear();
        java.lang.Object obj76 = defaultedMap72.remove((java.lang.Object) true);
        defaultedMap11.putAll((java.util.Map) defaultedMap72);
        boolean b78 = fixedOrderComparator9.add((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{0=100}" + "'", str58.equals("{0=100}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.isEmpty();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) (byte) 100);
        java.util.Set set32 = defaultedMap24.entrySet();
        java.util.Set set33 = defaultedMap24.entrySet();
        boolean b34 = defaultedMap12.containsValue((java.lang.Object) defaultedMap24);
        java.util.Collection collection35 = defaultedMap12.values();
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj47 = defaultedMap37.remove((java.lang.Object) 0);
        java.lang.String str48 = defaultedMap37.toString();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap37.remove(obj49);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 100.0d);
        java.lang.Object obj56 = defaultedMap52.remove((java.lang.Object) 10.0d);
        boolean b57 = defaultedMap52.isEmpty();
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) (byte) 100);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        defaultedMap61.clear();
        defaultedMap61.clear();
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) true);
        defaultedMap52.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        defaultedMap69.clear();
        defaultedMap69.clear();
        java.util.Collection collection72 = defaultedMap69.values();
        java.util.Set set73 = defaultedMap69.keySet();
        java.lang.Object obj74 = defaultedMap52.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap69);
        defaultedMap37.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj78 = defaultedMap37.get((java.lang.Object) defaultedMap77);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate79, predicate80);
        java.lang.Object obj82 = defaultedMap12.get((java.lang.Object) predicate80);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{0=100}" + "'", str48.equals("{0=100}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) ' ');
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = defaultedMap21.remove((java.lang.Object) 0);
        java.lang.String str32 = defaultedMap21.toString();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap21.remove(obj33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) fixedOrderComparator15, obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 1.0d);
        boolean b41 = fixedOrderComparator15.add((java.lang.Object) 1.0d);
        try {
            fixedOrderComparator15.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{0=100}" + "'", str32.equals("{0=100}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.String str3 = defaultedMap2.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) defaultedMap5);
        java.lang.String str13 = defaultedMap5.toString();
        java.util.Collection collection14 = defaultedMap5.values();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        defaultedMap16.clear();
        java.util.Collection collection19 = defaultedMap16.values();
        defaultedMap16.clear();
        int i21 = defaultedMap16.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 'a');
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj27 = defaultedMap5.get((java.lang.Object) fixedOrderComparator26);
        boolean b28 = fixedOrderComparator26.isLocked();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate18 = null;
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.String str31 = defaultedMap20.toString();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap20.remove(obj32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        defaultedMap44.clear();
        defaultedMap44.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        defaultedMap52.clear();
        defaultedMap52.clear();
        java.util.Collection collection55 = defaultedMap52.values();
        java.util.Set set56 = defaultedMap52.keySet();
        java.lang.Object obj57 = defaultedMap35.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap52);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate60);
        java.util.Set set63 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) set63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{0=100}" + "'", str31.equals("{0=100}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        defaultedMap13.clear();
        int i18 = defaultedMap13.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 'a');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) defaultedMap22);
        java.util.Set set26 = defaultedMap13.keySet();
        int i27 = defaultedMap13.size();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 1.0d);
        int i33 = defaultedMap29.size();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0d);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap38.isEmpty();
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100.0d);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap46.isEmpty();
        boolean b52 = defaultedMap38.equals((java.lang.Object) defaultedMap46);
        java.lang.Object obj53 = defaultedMap29.remove((java.lang.Object) defaultedMap38);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.String str56 = defaultedMap55.toString();
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 100.0d);
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) 10.0d);
        boolean b63 = defaultedMap58.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 100.0d);
        java.lang.Object obj70 = defaultedMap66.remove((java.lang.Object) 10.0d);
        boolean b71 = defaultedMap66.isEmpty();
        boolean b72 = defaultedMap58.equals((java.lang.Object) defaultedMap66);
        java.util.Set set73 = defaultedMap58.keySet();
        java.lang.Object obj74 = defaultedMap38.get((java.lang.Object) defaultedMap58);
        boolean b75 = fixedOrderComparator11.addAsEqual((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap58);
        collections.Factory factory76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, factory76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap3.remove(obj7);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap1.containsValue(obj43);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.String str3 = defaultedMap2.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) defaultedMap5);
        java.lang.String str13 = defaultedMap5.toString();
        java.util.Collection collection14 = defaultedMap5.values();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        defaultedMap16.clear();
        defaultedMap16.clear();
        java.util.Collection collection19 = defaultedMap16.values();
        defaultedMap16.clear();
        int i21 = defaultedMap16.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 'a');
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj27 = defaultedMap5.get((java.lang.Object) fixedOrderComparator26);
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object[] obj_array9 = new java.lang.Object[] { defaultedMap1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        int i14 = fixedOrderComparator12.getUnknownObjectBehavior();
        java.lang.Object obj15 = null;
        try {
            boolean b16 = fixedOrderComparator11.addAsEqual((java.lang.Object) fixedOrderComparator12, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator9.setUnknownObjectBehavior(1);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        defaultedMap18.clear();
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        defaultedMap23.clear();
        defaultedMap18.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100.0d);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) 10.0d);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) 10.0d);
        boolean b39 = defaultedMap34.isEmpty();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { b39, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) ' ');
        fixedOrderComparator42.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0d);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) 10.0d);
        boolean b53 = defaultedMap48.isEmpty();
        java.lang.Object obj56 = defaultedMap48.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj58 = defaultedMap48.remove((java.lang.Object) 0);
        java.lang.String str59 = defaultedMap48.toString();
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = defaultedMap48.remove(obj60);
        java.lang.Object obj62 = defaultedMap28.put((java.lang.Object) fixedOrderComparator42, obj61);
        boolean b63 = defaultedMap23.containsValue((java.lang.Object) defaultedMap28);
        defaultedMap28.clear();
        java.lang.Object obj66 = defaultedMap28.get((java.lang.Object) '4');
        int i67 = fixedOrderComparator9.compare(obj16, (java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{0=100}" + "'", str59.equals("{0=100}"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(i67 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        defaultedMap24.clear();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap27.isEmpty();
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100.0d);
        java.lang.Object obj42 = defaultedMap24.put((java.lang.Object) predicate36, (java.lang.Object) defaultedMap39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100.0d);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap44.isEmpty();
        java.lang.Object obj52 = defaultedMap44.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj54 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.String str55 = defaultedMap44.toString();
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap44.remove(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100.0d);
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) 10.0d);
        boolean b64 = defaultedMap59.isEmpty();
        java.lang.Object obj66 = defaultedMap59.get((java.lang.Object) (byte) 100);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        defaultedMap68.clear();
        defaultedMap68.clear();
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) true);
        defaultedMap59.putAll((java.util.Map) defaultedMap68);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        defaultedMap76.clear();
        defaultedMap76.clear();
        java.util.Collection collection79 = defaultedMap76.values();
        java.util.Set set80 = defaultedMap76.keySet();
        java.lang.Object obj81 = defaultedMap59.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap76);
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate36, predicate83);
        collections.Transformer transformer87 = null;
        try {
            java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{0=100}" + "'", str55.equals("{0=100}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate41, predicate42);
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate42, predicate44);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap18.isEmpty();
        boolean b24 = defaultedMap10.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 100.0d);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) 10.0d);
        boolean b35 = defaultedMap30.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0d);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap38.isEmpty();
        boolean b44 = defaultedMap30.equals((java.lang.Object) defaultedMap38);
        java.util.Set set45 = defaultedMap30.keySet();
        java.lang.Object obj46 = defaultedMap10.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0d);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) 10.0d);
        boolean b53 = defaultedMap48.isEmpty();
        java.lang.Object obj55 = defaultedMap48.get((java.lang.Object) (byte) 100);
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        defaultedMap57.clear();
        defaultedMap57.clear();
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) true);
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        defaultedMap48.clear();
        java.lang.Object obj64 = defaultedMap30.remove((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        boolean b45 = fixedOrderComparator42.isLocked();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Set set40 = defaultedMap16.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        defaultedMap1.clear();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        defaultedMap13.clear();
        int i18 = defaultedMap13.size();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 'a');
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map20, (java.lang.Object) 0.0f);
        defaultedMap1.putAll(map20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) map20);
        defaultedMap24.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { b21, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) ' ');
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        boolean b29 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.isEmpty();
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) (byte) 100);
        boolean b39 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        int i40 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        defaultedMap18.clear();
        java.util.Collection collection21 = defaultedMap18.values();
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap18);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap25.isEmpty();
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) predicateUtils33);
        defaultedMap25.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        defaultedMap38.clear();
        defaultedMap38.clear();
        java.util.Collection collection41 = defaultedMap38.values();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        defaultedMap43.clear();
        defaultedMap38.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0d);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) 10.0d);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100.0d);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) 10.0d);
        boolean b59 = defaultedMap54.isEmpty();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { b59, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b64 = fixedOrderComparator62.add((java.lang.Object) ' ');
        fixedOrderComparator62.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 100.0d);
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) 10.0d);
        boolean b73 = defaultedMap68.isEmpty();
        java.lang.Object obj76 = defaultedMap68.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj78 = defaultedMap68.remove((java.lang.Object) 0);
        java.lang.String str79 = defaultedMap68.toString();
        java.lang.Object obj80 = null;
        java.lang.Object obj81 = defaultedMap68.remove(obj80);
        java.lang.Object obj82 = defaultedMap48.put((java.lang.Object) fixedOrderComparator62, obj81);
        boolean b83 = defaultedMap43.containsValue((java.lang.Object) defaultedMap48);
        defaultedMap48.clear();
        boolean b85 = defaultedMap25.containsKey((java.lang.Object) defaultedMap48);
        int i86 = defaultedMap25.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{0=100}" + "'", str79.equals("{0=100}"));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        int i48 = fixedOrderComparator42.getUnknownObjectBehavior();
        int i49 = fixedOrderComparator42.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b23 = fixedOrderComparator11.add((java.lang.Object) defaultedMap16);
        java.lang.String str24 = defaultedMap16.toString();
        java.util.Set set25 = defaultedMap16.keySet();
        boolean b26 = defaultedMap6.containsValue((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        defaultedMap1.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap33.entrySet();
        java.util.Set set42 = defaultedMap33.entrySet();
        boolean b43 = defaultedMap21.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        defaultedMap45.clear();
        defaultedMap45.clear();
        java.util.Collection collection48 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap21.get((java.lang.Object) defaultedMap49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap21);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 100.0d);
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) 10.0d);
        boolean b58 = defaultedMap53.isEmpty();
        java.lang.Object obj60 = defaultedMap53.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils61 = new collections.PredicateUtils();
        java.lang.Object obj62 = defaultedMap53.get((java.lang.Object) predicateUtils61);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        defaultedMap64.clear();
        defaultedMap64.clear();
        java.util.Collection collection67 = defaultedMap64.values();
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        defaultedMap69.clear();
        defaultedMap69.clear();
        defaultedMap64.putAll((java.util.Map) defaultedMap69);
        java.util.Set set73 = defaultedMap69.keySet();
        java.lang.Object obj74 = defaultedMap1.put((java.lang.Object) defaultedMap53, (java.lang.Object) defaultedMap69);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        java.util.Set set14 = defaultedMap1.keySet();
        java.util.Set set15 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        defaultedMap14.clear();
        defaultedMap14.clear();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap14.get(obj19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Collection collection30 = defaultedMap22.values();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) collection30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap33.entrySet();
        java.lang.Object obj42 = defaultedMap12.put((java.lang.Object) map31, (java.lang.Object) defaultedMap33);
        java.lang.Object obj43 = defaultedMap4.remove(obj42);
        java.util.Collection collection44 = defaultedMap4.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        defaultedMap1.clear();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap33.entrySet();
        java.util.Set set42 = defaultedMap33.entrySet();
        boolean b43 = defaultedMap21.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        defaultedMap45.clear();
        defaultedMap45.clear();
        java.util.Collection collection48 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap21.get((java.lang.Object) defaultedMap49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap21);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.String str54 = defaultedMap53.toString();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) 100.0d);
        java.lang.Object obj60 = defaultedMap56.remove((java.lang.Object) 10.0d);
        boolean b61 = defaultedMap56.isEmpty();
        defaultedMap53.putAll((java.util.Map) defaultedMap56);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        defaultedMap66.clear();
        defaultedMap66.clear();
        java.lang.Object obj70 = defaultedMap66.remove((java.lang.Object) true);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap66.get(obj71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) 100.0d);
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) 10.0d);
        boolean b79 = defaultedMap74.isEmpty();
        java.lang.Object obj81 = defaultedMap74.get((java.lang.Object) (byte) 100);
        java.util.Collection collection82 = defaultedMap74.values();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) collection82);
        java.lang.Object obj84 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap(obj84);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap85, (java.lang.Object) 100.0d);
        java.lang.Object obj89 = defaultedMap85.remove((java.lang.Object) 10.0d);
        boolean b90 = defaultedMap85.isEmpty();
        java.lang.Object obj92 = defaultedMap85.get((java.lang.Object) (byte) 100);
        java.util.Set set93 = defaultedMap85.entrySet();
        java.lang.Object obj94 = defaultedMap64.put((java.lang.Object) map83, (java.lang.Object) defaultedMap85);
        java.lang.Object obj95 = defaultedMap56.remove(obj94);
        defaultedMap56.clear();
        boolean b97 = defaultedMap21.equals((java.lang.Object) defaultedMap56);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue(b97 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) ' ');
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = defaultedMap21.remove((java.lang.Object) 0);
        java.lang.String str32 = defaultedMap21.toString();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap21.remove(obj33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) fixedOrderComparator15, obj34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) 1.0d);
        boolean b41 = fixedOrderComparator15.add((java.lang.Object) 1.0d);
        int i42 = fixedOrderComparator15.getUnknownObjectBehavior();
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{0=100}" + "'", str32.equals("{0=100}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        java.util.Set set43 = defaultedMap41.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        java.lang.Object obj11 = defaultedMap4.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate13, (java.lang.Object) defaultedMap16);
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) ' ');
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        defaultedMap23.clear();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 100.0d);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0d);
        java.lang.Object obj41 = defaultedMap23.put((java.lang.Object) predicate35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.String str44 = defaultedMap43.toString();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100.0d);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap46.isEmpty();
        defaultedMap43.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100.0d);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) 10.0d);
        boolean b59 = defaultedMap54.isEmpty();
        boolean b60 = defaultedMap46.equals((java.lang.Object) defaultedMap54);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.String str63 = defaultedMap62.toString();
        defaultedMap54.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection65 = defaultedMap62.values();
        boolean b66 = defaultedMap23.equals((java.lang.Object) defaultedMap62);
        boolean b67 = defaultedMap16.containsKey((java.lang.Object) defaultedMap23);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        java.lang.String str72 = defaultedMap71.toString();
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) 100.0d);
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) 10.0d);
        boolean b79 = defaultedMap74.isEmpty();
        defaultedMap71.putAll((java.util.Map) defaultedMap74);
        boolean b81 = fixedOrderComparator69.add((java.lang.Object) defaultedMap74);
        java.lang.String str82 = defaultedMap74.toString();
        java.util.Collection collection83 = defaultedMap74.values();
        java.lang.Object obj84 = defaultedMap23.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap74);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        int i63 = fixedOrderComparator42.compare((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap59);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.String str66 = defaultedMap65.toString();
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 100.0d);
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) 10.0d);
        boolean b73 = defaultedMap68.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap68);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 100.0d);
        java.lang.Object obj80 = defaultedMap76.remove((java.lang.Object) 10.0d);
        boolean b81 = defaultedMap76.isEmpty();
        boolean b82 = defaultedMap68.equals((java.lang.Object) defaultedMap76);
        java.util.Set set83 = defaultedMap68.keySet();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap68);
        defaultedMap68.clear();
        int i86 = defaultedMap68.size();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(i86 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Collection collection16 = defaultedMap13.values();
        java.util.Set set17 = defaultedMap13.keySet();
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) set17);
        int i19 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        java.lang.Object obj11 = defaultedMap4.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate13, (java.lang.Object) defaultedMap16);
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) ' ');
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        defaultedMap27.clear();
        defaultedMap27.clear();
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { b37, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        defaultedMap43.clear();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        defaultedMap46.clear();
        defaultedMap46.clear();
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) true);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap46.get(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.String str55 = defaultedMap54.toString();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 100.0d);
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) 10.0d);
        boolean b62 = defaultedMap57.isEmpty();
        defaultedMap54.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj65 = defaultedMap54.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { (byte) 10, collection30, obj_array39, defaultedMap43, obj51, obj65 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b69 = fixedOrderComparator67.add((java.lang.Object) '4');
        int i70 = fixedOrderComparator67.getUnknownObjectBehavior();
        fixedOrderComparator67.setUnknownObjectBehavior(0);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        defaultedMap74.clear();
        defaultedMap74.clear();
        java.util.Collection collection77 = defaultedMap74.values();
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        defaultedMap79.clear();
        defaultedMap79.clear();
        java.util.Collection collection82 = defaultedMap79.values();
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        defaultedMap84.clear();
        defaultedMap84.clear();
        defaultedMap79.putAll((java.util.Map) defaultedMap84);
        int i88 = fixedOrderComparator67.compare((java.lang.Object) defaultedMap74, (java.lang.Object) defaultedMap84);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap84);
        java.lang.Object obj90 = defaultedMap16.put((java.lang.Object) str24, (java.lang.Object) defaultedMap84);
        java.util.Set set91 = defaultedMap84.entrySet();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(set91);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap9.isEmpty();
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) predicateUtils17);
        int i19 = defaultedMap9.size();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        java.util.Set set11 = defaultedMap1.keySet();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.isEmpty();
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        defaultedMap22.clear();
        defaultedMap22.clear();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) true);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        defaultedMap29.clear();
        defaultedMap29.clear();
        java.util.Collection collection32 = defaultedMap29.values();
        defaultedMap29.clear();
        int i34 = defaultedMap29.size();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 'a');
        java.util.Map map38 = collections.map.DefaultedMap.decorate(map36, (java.lang.Object) 0.0f);
        defaultedMap22.putAll(map36);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.String str3 = defaultedMap2.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) defaultedMap5);
        boolean b14 = fixedOrderComparator0.add((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.util.Set set9 = defaultedMap1.entrySet();
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) ' ');
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = defaultedMap21.remove((java.lang.Object) 0);
        java.lang.String str32 = defaultedMap21.toString();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap21.remove(obj33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) fixedOrderComparator15, obj34);
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{0=100}" + "'", str32.equals("{0=100}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 10.0d);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap23.isEmpty();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { b28, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) ' ');
        fixedOrderComparator31.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj47 = defaultedMap37.remove((java.lang.Object) 0);
        java.lang.String str48 = defaultedMap37.toString();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap37.remove(obj49);
        java.lang.Object obj51 = defaultedMap17.put((java.lang.Object) fixedOrderComparator31, obj50);
        java.lang.Object obj52 = defaultedMap1.get(obj51);
        defaultedMap1.clear();
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        defaultedMap55.clear();
        defaultedMap55.clear();
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        defaultedMap62.clear();
        defaultedMap62.clear();
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection68 = defaultedMap62.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{0=100}" + "'", str48.equals("{0=100}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.lang.String str46 = defaultedMap45.toString();
        java.lang.String str47 = defaultedMap45.toString();
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 100.0d);
        java.lang.Object obj53 = defaultedMap49.remove((java.lang.Object) 10.0d);
        boolean b54 = defaultedMap49.isEmpty();
        java.lang.Object obj57 = defaultedMap49.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj59 = defaultedMap45.put(obj57, (java.lang.Object) (short) 100);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (-1L));
        boolean b62 = fixedOrderComparator43.add((java.lang.Object) map61);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) 1.0d);
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap9.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { b21, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) ' ');
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        defaultedMap28.clear();
        defaultedMap28.clear();
        java.util.Collection collection31 = defaultedMap28.values();
        java.util.Set set32 = defaultedMap28.keySet();
        boolean b33 = fixedOrderComparator24.add((java.lang.Object) set32);
        java.lang.Object obj34 = defaultedMap9.get((java.lang.Object) fixedOrderComparator24);
        try {
            boolean b35 = fixedOrderComparator0.addAsEqual((java.lang.Object) str7, (java.lang.Object) defaultedMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.String str7 = defaultedMap6.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.isEmpty();
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        boolean b20 = fixedOrderComparator8.add((java.lang.Object) defaultedMap13);
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) str7, (java.lang.Object) b20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap27.isEmpty();
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        boolean b34 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        java.lang.String str35 = defaultedMap27.toString();
        java.util.Collection collection36 = defaultedMap27.values();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        defaultedMap38.clear();
        defaultedMap38.clear();
        java.util.Collection collection41 = defaultedMap38.values();
        defaultedMap38.clear();
        int i43 = defaultedMap38.size();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 'a');
        java.lang.Object[] obj_array46 = new java.lang.Object[] { defaultedMap38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj49 = defaultedMap27.get((java.lang.Object) fixedOrderComparator48);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        java.util.Collection collection32 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.String str3 = defaultedMap2.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap5.isEmpty();
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) defaultedMap5);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        defaultedMap11.clear();
        defaultedMap11.clear();
        defaultedMap6.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { b27, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) ' ');
        fixedOrderComparator30.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0d);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap36.isEmpty();
        java.lang.Object obj44 = defaultedMap36.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj46 = defaultedMap36.remove((java.lang.Object) 0);
        java.lang.String str47 = defaultedMap36.toString();
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap36.remove(obj48);
        java.lang.Object obj50 = defaultedMap16.put((java.lang.Object) fixedOrderComparator30, obj49);
        boolean b51 = defaultedMap11.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{0=100}" + "'", str47.equals("{0=100}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { b21, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) ' ');
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        boolean b29 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.isEmpty();
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap31.remove((java.lang.Object) 0);
        java.lang.String str42 = defaultedMap31.toString();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap31.remove(obj43);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100.0d);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap46.isEmpty();
        java.lang.Object obj53 = defaultedMap46.get((java.lang.Object) (byte) 100);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        defaultedMap55.clear();
        defaultedMap55.clear();
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) true);
        defaultedMap46.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        defaultedMap63.clear();
        defaultedMap63.clear();
        java.util.Collection collection66 = defaultedMap63.values();
        java.util.Set set67 = defaultedMap63.keySet();
        java.lang.Object obj68 = defaultedMap46.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap63);
        defaultedMap31.putAll((java.util.Map) defaultedMap46);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate70, predicate71);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{0=100}" + "'", str42.equals("{0=100}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.util.Set set18 = defaultedMap1.keySet();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.util.Collection collection24 = defaultedMap21.values();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 100.0d);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { b31, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        defaultedMap37.clear();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        defaultedMap40.clear();
        defaultedMap40.clear();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) true);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap40.get(obj45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.String str49 = defaultedMap48.toString();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 100.0d);
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) 10.0d);
        boolean b56 = defaultedMap51.isEmpty();
        defaultedMap48.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj59 = defaultedMap48.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { (byte) 10, collection24, obj_array33, defaultedMap37, obj45, obj59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b63 = fixedOrderComparator61.add((java.lang.Object) (short) 1);
        boolean b64 = fixedOrderComparator61.isLocked();
        int i65 = fixedOrderComparator61.getUnknownObjectBehavior();
        boolean b66 = defaultedMap1.containsKey((java.lang.Object) i65);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        defaultedMap15.clear();
        defaultedMap15.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        java.util.Set set19 = defaultedMap15.keySet();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap21.isEmpty();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { b26, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) ' ');
        fixedOrderComparator29.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator29.setUnknownObjectBehavior(1);
        boolean b36 = defaultedMap15.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) 10.0d);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap23.isEmpty();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { b28, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) ' ');
        fixedOrderComparator31.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) 10.0d);
        boolean b42 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj47 = defaultedMap37.remove((java.lang.Object) 0);
        java.lang.String str48 = defaultedMap37.toString();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap37.remove(obj49);
        java.lang.Object obj51 = defaultedMap17.put((java.lang.Object) fixedOrderComparator31, obj50);
        java.lang.Object obj52 = defaultedMap1.get(obj51);
        defaultedMap1.clear();
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        defaultedMap55.clear();
        defaultedMap55.clear();
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        defaultedMap62.clear();
        defaultedMap62.clear();
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap62);
        int i68 = defaultedMap62.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{0=100}" + "'", str48.equals("{0=100}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        defaultedMap8.clear();
        defaultedMap8.clear();
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 'a');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        collections.Predicate predicate14 = null;
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap16.remove((java.lang.Object) 0);
        java.lang.String str27 = defaultedMap16.toString();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap16.remove(obj28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap31.isEmpty();
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) (byte) 100);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        defaultedMap40.clear();
        defaultedMap40.clear();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) true);
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        defaultedMap48.clear();
        defaultedMap48.clear();
        java.util.Collection collection51 = defaultedMap48.values();
        java.util.Set set52 = defaultedMap48.keySet();
        java.lang.Object obj53 = defaultedMap31.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap48);
        defaultedMap16.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj57 = defaultedMap16.get((java.lang.Object) defaultedMap56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate58);
        java.util.Collection collection62 = defaultedMap1.values();
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{0=100}" + "'", str27.equals("{0=100}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.remove(obj13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) (byte) 100);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        defaultedMap25.clear();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        defaultedMap33.clear();
        defaultedMap33.clear();
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0d);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100.0d);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) 10.0d);
        boolean b59 = defaultedMap54.isEmpty();
        java.lang.Object obj61 = defaultedMap54.get((java.lang.Object) (byte) 100);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array68 = new java.lang.Object[] { predicate43, 10.0f, (-1.0d), predicate62, defaultedMap67 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array68);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{0=100}" + "'", str12.equals("{0=100}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(obj_array68);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap24.isEmpty();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) (byte) 100);
        java.util.Set set32 = defaultedMap24.entrySet();
        java.util.Set set33 = defaultedMap24.entrySet();
        boolean b34 = defaultedMap12.containsValue((java.lang.Object) defaultedMap24);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        defaultedMap36.clear();
        defaultedMap36.clear();
        java.util.Collection collection39 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj41 = defaultedMap12.get((java.lang.Object) defaultedMap40);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        java.util.Set set33 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.lang.Object obj36 = defaultedMap22.remove((java.lang.Object) (-1));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.String str9 = defaultedMap7.toString();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap7.put(obj19, (java.lang.Object) (short) 100);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1L));
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        defaultedMap26.clear();
        defaultedMap26.clear();
        java.util.Collection collection29 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0d);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap36.isEmpty();
        java.lang.Object obj44 = defaultedMap36.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj46 = defaultedMap32.put(obj44, (java.lang.Object) (short) 100);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1L));
        java.lang.Object obj49 = defaultedMap30.get((java.lang.Object) (-1L));
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        defaultedMap51.clear();
        defaultedMap51.clear();
        java.util.Collection collection54 = defaultedMap51.values();
        defaultedMap51.clear();
        int i56 = defaultedMap51.size();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 'a');
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        defaultedMap60.clear();
        defaultedMap60.clear();
        java.lang.Object obj63 = defaultedMap51.get((java.lang.Object) defaultedMap60);
        java.lang.Object obj64 = defaultedMap5.put((java.lang.Object) defaultedMap30, obj63);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        defaultedMap66.clear();
        defaultedMap66.clear();
        java.util.Collection collection69 = defaultedMap66.values();
        java.lang.Object obj71 = defaultedMap66.get((java.lang.Object) (short) 10);
        java.util.Collection collection72 = defaultedMap66.values();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap66);
        java.lang.Object obj74 = defaultedMap30.get((java.lang.Object) defaultedMap66);
        java.util.Set set75 = defaultedMap66.keySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        defaultedMap2.clear();
        defaultedMap2.clear();
        java.util.Collection collection5 = defaultedMap2.values();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { b12, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        defaultedMap18.clear();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        defaultedMap21.clear();
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) true);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap21.get(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap32.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj40 = defaultedMap29.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) 10, collection5, obj_array14, defaultedMap18, obj26, obj40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) '4');
        int i45 = fixedOrderComparator42.getUnknownObjectBehavior();
        fixedOrderComparator42.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        defaultedMap49.clear();
        defaultedMap49.clear();
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        defaultedMap54.clear();
        defaultedMap54.clear();
        java.util.Collection collection57 = defaultedMap54.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        defaultedMap59.clear();
        defaultedMap59.clear();
        defaultedMap54.putAll((java.util.Map) defaultedMap59);
        int i63 = fixedOrderComparator42.compare((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap59);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) 100.0d);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) 10.0d);
        boolean b70 = defaultedMap65.isEmpty();
        java.lang.Object obj72 = defaultedMap65.get((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils73 = new collections.PredicateUtils();
        java.lang.Object obj74 = defaultedMap65.get((java.lang.Object) predicateUtils73);
        java.lang.Object obj75 = defaultedMap59.get((java.lang.Object) predicateUtils73);
        java.util.Collection collection76 = defaultedMap59.values();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection76);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        defaultedMap3.clear();
        defaultedMap3.clear();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) true);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.get(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.util.Collection collection19 = defaultedMap11.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap22.isEmpty();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) (byte) 100);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) map20, (java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        java.util.Set set33 = defaultedMap22.keySet();
        int i34 = defaultedMap22.size();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        defaultedMap6.clear();
        defaultedMap6.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { b17, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) ' ');
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator20.setUnknownObjectBehavior(1);
        boolean b27 = defaultedMap6.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        defaultedMap30.clear();
        defaultedMap30.clear();
        java.util.Collection collection33 = defaultedMap30.values();
        defaultedMap30.clear();
        int i35 = defaultedMap30.size();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 'a');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        defaultedMap39.clear();
        defaultedMap39.clear();
        java.lang.Object obj42 = defaultedMap30.get((java.lang.Object) defaultedMap39);
        java.util.Set set43 = defaultedMap30.keySet();
        boolean b44 = defaultedMap28.containsKey((java.lang.Object) set43);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { b6, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) ' ');
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator9.setUnknownObjectBehavior(1);
        boolean b16 = fixedOrderComparator9.isLocked();
        try {
            fixedOrderComparator9.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap10.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) 10.0d);
        boolean b23 = defaultedMap18.isEmpty();
        boolean b24 = defaultedMap10.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap10);
        int i26 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        defaultedMap10.clear();
        defaultedMap10.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap10);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0d);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap15.isEmpty();
        java.lang.Object obj23 = defaultedMap15.put((java.lang.Object) 0L, (java.lang.Object) (byte) 100);
        java.lang.Object obj25 = defaultedMap15.remove((java.lang.Object) 0);
        java.lang.String str26 = defaultedMap15.toString();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap15.remove(obj27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 100.0d);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) 10.0d);
        boolean b35 = defaultedMap30.isEmpty();
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) (byte) 100);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        defaultedMap39.clear();
        defaultedMap39.clear();
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) true);
        defaultedMap30.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        defaultedMap47.clear();
        defaultedMap47.clear();
        java.util.Collection collection50 = defaultedMap47.values();
        java.util.Set set51 = defaultedMap47.keySet();
        java.lang.Object obj52 = defaultedMap30.put((java.lang.Object) "{0=100}", (java.lang.Object) defaultedMap47);
        defaultedMap15.putAll((java.util.Map) defaultedMap30);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap1.put((java.lang.Object) fixedOrderComparator7, (java.lang.Object) predicate54);
        int i58 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{0=100}" + "'", str26.equals("{0=100}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertTrue(b59 == false);
    }
}

