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
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str3 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        int i15 = defaultedMap11.size();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        java.util.Collection collection23 = defaultedMap19.values();
        try {
            boolean b24 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        try {
            boolean b10 = fixedOrderComparator0.addAsEqual((java.lang.Object) collection8, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str3 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        int i15 = defaultedMap11.size();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) 1.0d);
        boolean b22 = fixedOrderComparator18.add((java.lang.Object) "{}");
        boolean b23 = fixedOrderComparator18.isLocked();
        fixedOrderComparator18.setUnknownObjectBehavior(1);
        try {
            boolean b26 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap2, (java.lang.Object) fixedOrderComparator18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str26 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 1.0f);
        int i32 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 1.0f);
        int i38 = defaultedMap34.size();
        boolean b39 = defaultedMap28.containsValue((java.lang.Object) defaultedMap34);
        defaultedMap25.putAll((java.util.Map) defaultedMap28);
        java.util.Set set41 = defaultedMap25.keySet();
        try {
            int i42 = fixedOrderComparator21.compare((java.lang.Object) '4', (java.lang.Object) defaultedMap25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate15);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str14 = defaultedMap6.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        java.lang.Object obj15 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) i14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap6.remove((java.lang.Object) map23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) map23);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        int i5 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.util.Collection collection11 = defaultedMap7.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) '4');
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate21);
        try {
            boolean b25 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.remove(obj7);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        java.lang.Object obj23 = defaultedMap4.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 1.0f);
        java.util.Collection collection33 = defaultedMap29.values();
        boolean b34 = defaultedMap26.containsValue((java.lang.Object) collection33);
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) 1.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) 1.0f);
        int i54 = defaultedMap50.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 1.0f);
        int i60 = defaultedMap56.size();
        boolean b61 = defaultedMap50.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection66 = defaultedMap65.values();
        java.lang.Object obj68 = defaultedMap65.remove((java.lang.Object) 1.0f);
        java.lang.Object obj69 = defaultedMap50.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection73 = defaultedMap72.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection76 = defaultedMap75.values();
        java.lang.Object obj78 = defaultedMap75.remove((java.lang.Object) 1.0f);
        java.util.Collection collection79 = defaultedMap75.values();
        boolean b80 = defaultedMap72.containsValue((java.lang.Object) collection79);
        java.lang.Object obj81 = defaultedMap50.put((java.lang.Object) (-1), (java.lang.Object) b80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str84 = defaultedMap83.toString();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection87 = defaultedMap86.values();
        java.lang.Object obj89 = defaultedMap86.remove((java.lang.Object) 1.0f);
        java.lang.Object obj90 = defaultedMap83.get((java.lang.Object) 1.0f);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) defaultedMap83);
        defaultedMap4.putAll((java.util.Map) defaultedMap50);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 1 + "'", obj90.equals(1));
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map18, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) i9);
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Collection collection12 = defaultedMap1.values();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap1.equals(obj28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (-1.0d));
        boolean b3 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set17 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) set17);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) predicate8);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        try {
            int i16 = fixedOrderComparator0.compare((java.lang.Object) obj_array13, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertNotNull(obj_array13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate15);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 1.0f);
        int i38 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        int i44 = defaultedMap40.size();
        boolean b45 = defaultedMap34.containsValue((java.lang.Object) defaultedMap40);
        defaultedMap31.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection50 = defaultedMap49.values();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) 1.0f);
        java.lang.Object obj53 = defaultedMap34.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection60 = defaultedMap59.values();
        java.lang.Object obj62 = defaultedMap59.remove((java.lang.Object) 1.0f);
        java.util.Collection collection63 = defaultedMap59.values();
        boolean b64 = defaultedMap56.containsValue((java.lang.Object) collection63);
        java.lang.Object obj65 = defaultedMap34.put((java.lang.Object) (-1), (java.lang.Object) b64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str68 = defaultedMap67.toString();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection71 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) 1.0f);
        java.lang.Object obj74 = defaultedMap67.get((java.lang.Object) 1.0f);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap67);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection78 = defaultedMap77.values();
        java.lang.Object obj80 = defaultedMap77.remove((java.lang.Object) 1.0f);
        java.util.Collection collection81 = defaultedMap77.values();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) '4');
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection87 = defaultedMap86.values();
        java.lang.Object obj89 = defaultedMap86.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate90, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate84, predicate91);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate84, predicate94);
        java.lang.Object obj97 = defaultedMap1.remove((java.lang.Object) predicate84);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1 + "'", obj74.equals(1));
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator1.add((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        boolean b14 = fixedOrderComparator3.add((java.lang.Object) predicate11);
        boolean b16 = fixedOrderComparator3.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) b16);
        java.util.Set set18 = defaultedMap1.keySet();
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        boolean b8 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str3 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        int i15 = defaultedMap11.size();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 1.0f);
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        try {
            boolean b27 = fixedOrderComparator0.addAsEqual(obj24, (java.lang.Object) defaultedMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        defaultedMap4.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) predicate8);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        int i22 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 1.0f);
        int i28 = defaultedMap24.size();
        boolean b29 = defaultedMap18.containsValue((java.lang.Object) defaultedMap24);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 1.0f);
        java.lang.Object obj37 = defaultedMap18.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection44 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap43.remove((java.lang.Object) 1.0f);
        java.util.Collection collection47 = defaultedMap43.values();
        boolean b48 = defaultedMap40.containsValue((java.lang.Object) collection47);
        java.lang.Object obj49 = defaultedMap18.put((java.lang.Object) (-1), (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str52 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection55 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap54.remove((java.lang.Object) 1.0f);
        java.lang.Object obj58 = defaultedMap51.get((java.lang.Object) 1.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap51);
        java.util.Collection collection60 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str63 = defaultedMap62.toString();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection68 = defaultedMap67.values();
        java.lang.Object obj70 = defaultedMap67.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.lang.Object obj74 = defaultedMap62.get((java.lang.Object) defaultedMap67);
        java.util.Set set75 = defaultedMap62.entrySet();
        java.util.Collection collection76 = defaultedMap62.values();
        try {
            int i77 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap51, (java.lang.Object) collection76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1 + "'", obj58.equals(1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1 + "'", obj74.equals(1));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection76);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        java.lang.Object obj23 = defaultedMap4.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 1.0f);
        java.util.Collection collection33 = defaultedMap29.values();
        boolean b34 = defaultedMap26.containsValue((java.lang.Object) collection33);
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) 1.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap47.remove((java.lang.Object) 1.0f);
        java.util.Collection collection51 = defaultedMap47.values();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) '4');
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate54, predicate61);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate54, predicate64);
        java.lang.String str67 = defaultedMap37.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 1);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 1.0f);
        int i26 = defaultedMap22.size();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) 10.0d);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap29);
        int i34 = defaultedMap22.size();
        java.lang.Object[] obj_array35 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = defaultedMap22.equals((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 1.0f);
        int i43 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap45.remove((java.lang.Object) 1.0f);
        java.util.Collection collection49 = defaultedMap45.values();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) '4');
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection55 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap54.remove((java.lang.Object) 1.0f);
        int i58 = defaultedMap54.size();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap54);
        java.lang.Object obj60 = defaultedMap22.get((java.lang.Object) defaultedMap54);
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1 + "'", obj60.equals(1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        java.util.Collection collection15 = defaultedMap11.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '4');
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) b22);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap16.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 1.0f);
        int i29 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        int i35 = defaultedMap31.size();
        boolean b36 = defaultedMap25.containsValue((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap38);
        try {
            boolean b43 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) 1.0f);
        boolean b26 = defaultedMap1.containsValue(obj25);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) 1.0f);
        java.util.Collection collection17 = defaultedMap13.values();
        boolean b18 = defaultedMap10.containsValue((java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 1.0f);
        int i24 = defaultedMap20.size();
        java.util.Collection collection25 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 1.0f);
        int i34 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) 1.0f);
        int i40 = defaultedMap36.size();
        boolean b41 = defaultedMap30.containsValue((java.lang.Object) defaultedMap36);
        defaultedMap27.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap45.remove((java.lang.Object) 1.0f);
        java.lang.Object obj49 = defaultedMap30.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str52 = defaultedMap51.toString();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        java.lang.Object obj63 = defaultedMap51.get((java.lang.Object) defaultedMap56);
        java.util.Set set64 = defaultedMap51.entrySet();
        java.util.Collection collection65 = defaultedMap51.values();
        boolean b67 = defaultedMap51.containsValue((java.lang.Object) 100L);
        java.lang.Object obj68 = defaultedMap20.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap51);
        try {
            boolean b69 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1 + "'", obj63.equals(1));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (-1.0d));
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.String str19 = defaultedMap7.toString();
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.clear();
        defaultedMap9.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        java.lang.Object obj23 = defaultedMap4.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 1.0f);
        java.util.Collection collection33 = defaultedMap29.values();
        boolean b34 = defaultedMap26.containsValue((java.lang.Object) collection33);
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) 1.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap47.remove((java.lang.Object) 1.0f);
        int i51 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection54 = defaultedMap53.values();
        java.lang.Object obj56 = defaultedMap53.remove((java.lang.Object) 1.0f);
        java.util.Collection collection57 = defaultedMap53.values();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) '4');
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection63 = defaultedMap62.values();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) 1.0f);
        int i66 = defaultedMap62.size();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap62);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection70 = defaultedMap69.values();
        java.lang.Object obj72 = defaultedMap69.remove((java.lang.Object) 1.0f);
        java.util.Collection collection73 = defaultedMap69.values();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) '4');
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection79 = defaultedMap78.values();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate82, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate83);
        java.lang.Object obj86 = defaultedMap53.remove((java.lang.Object) predicate76);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator();
        boolean b89 = fixedOrderComparator87.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection92 = defaultedMap91.values();
        java.lang.Object obj94 = defaultedMap91.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate96 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate95, predicate96);
        boolean b98 = fixedOrderComparator87.add((java.lang.Object) predicate95);
        java.util.Map map99 = collections.map.PredicatedMap.decorate(map45, predicate76, predicate95);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.keySet();
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        java.util.Collection collection15 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 1.0f);
        java.util.Collection collection24 = defaultedMap20.values();
        boolean b25 = defaultedMap17.containsValue((java.lang.Object) collection24);
        java.util.Set set26 = defaultedMap17.keySet();
        try {
            boolean b27 = fixedOrderComparator0.addAsEqual((java.lang.Object) collection15, (java.lang.Object) set26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 1.0f);
        int i28 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 1.0f);
        java.util.Collection collection34 = defaultedMap30.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '4');
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 1.0f);
        int i43 = defaultedMap39.size();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap39);
        java.lang.Object obj45 = defaultedMap7.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj48 = defaultedMap7.put((java.lang.Object) 100L, (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1 + "'", obj45.equals(1));
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        int i27 = defaultedMap23.size();
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate35, predicate38);
        java.lang.String str40 = defaultedMap14.toString();
        java.lang.Object obj42 = defaultedMap14.get((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap45.remove((java.lang.Object) 1.0f);
        int i49 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) 1.0f);
        int i55 = defaultedMap51.size();
        boolean b56 = defaultedMap45.containsValue((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection59 = defaultedMap58.values();
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) 10.0d);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) defaultedMap58);
        java.lang.String str63 = defaultedMap51.toString();
        java.lang.Object obj64 = defaultedMap14.remove((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection67 = defaultedMap66.values();
        java.lang.Object obj69 = defaultedMap66.remove((java.lang.Object) 1.0f);
        java.util.Collection collection70 = defaultedMap66.values();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) '4');
        java.util.Set set73 = defaultedMap66.keySet();
        boolean b74 = defaultedMap51.equals((java.lang.Object) defaultedMap66);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str9 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 1.0f);
        int i28 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 1.0f);
        java.util.Collection collection34 = defaultedMap30.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '4');
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 1.0f);
        int i43 = defaultedMap39.size();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap39);
        java.lang.Object obj45 = defaultedMap7.get((java.lang.Object) defaultedMap39);
        int i46 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1 + "'", obj45.equals(1));
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        int i27 = defaultedMap23.size();
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate35, predicate38);
        java.lang.String str40 = defaultedMap14.toString();
        java.lang.Object obj42 = defaultedMap14.get((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.util.Set set44 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        int i15 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        boolean b22 = defaultedMap11.containsValue((java.lang.Object) defaultedMap17);
        defaultedMap8.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 1.0f);
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) 1.0f);
        java.util.Collection collection40 = defaultedMap36.values();
        boolean b41 = defaultedMap33.containsValue((java.lang.Object) collection40);
        java.lang.Object obj42 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) b41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str45 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap47.remove((java.lang.Object) 1.0f);
        java.lang.Object obj51 = defaultedMap44.get((java.lang.Object) 1.0f);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection55 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap54.remove((java.lang.Object) 1.0f);
        java.util.Collection collection58 = defaultedMap54.values();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) '4');
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection64 = defaultedMap63.values();
        java.lang.Object obj66 = defaultedMap63.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate61, predicate68);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate61, predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection76 = defaultedMap75.values();
        java.lang.Object obj78 = defaultedMap75.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate61, predicate79);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1 + "'", obj51.equals(1));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.util.Collection collection11 = defaultedMap7.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set15 = defaultedMap1.entrySet();
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) predicate8);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        int i27 = defaultedMap23.size();
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate35, predicate38);
        java.lang.String str40 = defaultedMap14.toString();
        java.lang.Object obj42 = defaultedMap14.get((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap45.remove((java.lang.Object) 1.0f);
        java.util.Collection collection49 = defaultedMap45.values();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) '4');
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection55 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap54.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate52, predicate59);
        defaultedMap1.putAll((java.util.Map) defaultedMap45);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        try {
            int i9 = fixedOrderComparator1.compare((java.lang.Object) defaultedMap3, (java.lang.Object) defaultedMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.String str19 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) defaultedMap26);
        java.util.Set set34 = defaultedMap21.entrySet();
        boolean b35 = defaultedMap7.containsKey((java.lang.Object) set34);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1 + "'", obj33.equals(1));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Collection collection30 = defaultedMap1.values();
        boolean b31 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) obj_array13);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str11 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) 1.0f);
        int i17 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        int i23 = defaultedMap19.size();
        boolean b24 = defaultedMap13.containsValue((java.lang.Object) defaultedMap19);
        defaultedMap10.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 1.0f);
        java.lang.Object obj32 = defaultedMap13.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection36 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) 1.0f);
        java.util.Collection collection42 = defaultedMap38.values();
        boolean b43 = defaultedMap35.containsValue((java.lang.Object) collection42);
        java.lang.Object obj44 = defaultedMap13.put((java.lang.Object) (-1), (java.lang.Object) b43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str47 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection50 = defaultedMap49.values();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) 1.0f);
        java.lang.Object obj53 = defaultedMap46.get((java.lang.Object) 1.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap46);
        boolean b55 = defaultedMap1.containsValue((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1 + "'", obj53.equals(1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) 1.0f);
        int i12 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 1.0f);
        int i18 = defaultedMap14.size();
        boolean b19 = defaultedMap8.containsValue((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        int i26 = defaultedMap14.size();
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = defaultedMap14.equals((java.lang.Object) fixedOrderComparator28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b29);
        boolean b31 = defaultedMap1.isEmpty();
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.util.Collection collection11 = defaultedMap7.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        java.util.Collection collection27 = defaultedMap23.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) '4');
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate37);
        java.lang.Object obj40 = defaultedMap7.remove((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 1.0f);
        java.util.Collection collection46 = defaultedMap42.values();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b49 = defaultedMap42.containsKey((java.lang.Object) 1);
        java.lang.Object obj50 = defaultedMap7.get((java.lang.Object) defaultedMap42);
        boolean b52 = defaultedMap7.containsKey((java.lang.Object) 100);
        java.util.Set set53 = defaultedMap7.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1 + "'", obj50.equals(1));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.util.Collection collection11 = defaultedMap7.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        java.util.Collection collection27 = defaultedMap23.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) '4');
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate37);
        java.lang.Object obj40 = defaultedMap7.remove((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 1.0f);
        int i46 = defaultedMap42.size();
        defaultedMap42.clear();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 100L);
        java.lang.Object obj50 = defaultedMap7.remove((java.lang.Object) map49);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Set set30 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        boolean b14 = fixedOrderComparator3.add((java.lang.Object) predicate11);
        boolean b16 = fixedOrderComparator3.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) b16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 1.0f);
        int i29 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        int i35 = defaultedMap31.size();
        boolean b36 = defaultedMap25.containsValue((java.lang.Object) defaultedMap31);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 1.0f);
        int i46 = defaultedMap42.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection49 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap48.remove((java.lang.Object) 1.0f);
        int i52 = defaultedMap48.size();
        boolean b53 = defaultedMap42.containsValue((java.lang.Object) defaultedMap48);
        defaultedMap39.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap42.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection65 = defaultedMap64.values();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection68 = defaultedMap67.values();
        java.lang.Object obj70 = defaultedMap67.remove((java.lang.Object) 1.0f);
        java.util.Collection collection71 = defaultedMap67.values();
        boolean b72 = defaultedMap64.containsValue((java.lang.Object) collection71);
        java.lang.Object obj73 = defaultedMap42.put((java.lang.Object) (-1), (java.lang.Object) b72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str76 = defaultedMap75.toString();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection79 = defaultedMap78.values();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) 1.0f);
        java.lang.Object obj82 = defaultedMap75.get((java.lang.Object) 1.0f);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) defaultedMap75);
        defaultedMap22.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj86 = defaultedMap42.get((java.lang.Object) true);
        java.lang.Object obj87 = defaultedMap1.put((java.lang.Object) defaultedMap19, (java.lang.Object) true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 1 + "'", obj82.equals(1));
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 1 + "'", obj86.equals(1));
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        java.lang.String str27 = defaultedMap1.toString();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Collection collection30 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 1.0f);
        int i36 = defaultedMap32.size();
        java.util.Collection collection37 = defaultedMap32.values();
        boolean b38 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap40.clear();
        defaultedMap40.clear();
        defaultedMap32.putAll((java.util.Map) defaultedMap40);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1 + "'", obj29.equals(1));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str10 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) 1.0f);
        int i16 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 1.0f);
        int i22 = defaultedMap18.size();
        boolean b23 = defaultedMap12.containsValue((java.lang.Object) defaultedMap18);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        java.lang.Object obj31 = defaultedMap12.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection38 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) 1.0f);
        java.util.Collection collection41 = defaultedMap37.values();
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) collection41);
        java.lang.Object obj43 = defaultedMap12.put((java.lang.Object) (-1), (java.lang.Object) b42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str46 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection49 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap48.remove((java.lang.Object) 1.0f);
        java.lang.Object obj52 = defaultedMap45.get((java.lang.Object) 1.0f);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection56 = defaultedMap55.values();
        java.lang.Object obj58 = defaultedMap55.remove((java.lang.Object) 1.0f);
        java.util.Collection collection59 = defaultedMap55.values();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) '4');
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate69);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate62, predicate72);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection77 = defaultedMap76.values();
        java.lang.Object obj79 = defaultedMap76.remove((java.lang.Object) 1.0f);
        int i80 = defaultedMap76.size();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection83 = defaultedMap82.values();
        java.lang.Object obj85 = defaultedMap82.remove((java.lang.Object) 1.0f);
        int i86 = defaultedMap82.size();
        boolean b87 = defaultedMap76.containsValue((java.lang.Object) defaultedMap82);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection90 = defaultedMap89.values();
        boolean b92 = defaultedMap89.containsKey((java.lang.Object) 10.0d);
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) defaultedMap89);
        java.lang.Object obj94 = defaultedMap1.put((java.lang.Object) map74, (java.lang.Object) defaultedMap82);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1 + "'", obj52.equals(1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = null;
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 1.0f);
        int i28 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 1.0f);
        java.util.Collection collection34 = defaultedMap30.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '4');
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 1.0f);
        int i43 = defaultedMap39.size();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap39);
        java.lang.Object obj45 = defaultedMap7.get((java.lang.Object) defaultedMap39);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1 + "'", obj45.equals(1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) 1.0d);
        boolean b17 = fixedOrderComparator13.add((java.lang.Object) "{}");
        boolean b18 = fixedOrderComparator13.isLocked();
        fixedOrderComparator13.setUnknownObjectBehavior(1);
        int i21 = fixedOrderComparator13.getUnknownObjectBehavior();
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) fixedOrderComparator13);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap16.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Set set24 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str24 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 1.0f);
        int i30 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 1.0f);
        int i36 = defaultedMap32.size();
        boolean b37 = defaultedMap26.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap23.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap14.put((java.lang.Object) defaultedMap26, obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 1.0f);
        int i46 = defaultedMap42.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection49 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap48.remove((java.lang.Object) 1.0f);
        int i52 = defaultedMap48.size();
        boolean b53 = defaultedMap42.containsValue((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection56 = defaultedMap55.values();
        boolean b58 = defaultedMap55.containsKey((java.lang.Object) 10.0d);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap55);
        int i60 = defaultedMap48.size();
        java.lang.Object[] obj_array61 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b63 = defaultedMap48.equals((java.lang.Object) fixedOrderComparator62);
        java.lang.Object obj64 = new java.lang.Object();
        boolean b65 = fixedOrderComparator62.add(obj64);
        boolean b66 = defaultedMap26.containsKey((java.lang.Object) b65);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        java.util.Collection collection8 = defaultedMap4.values();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) collection8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        int i15 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        boolean b22 = defaultedMap11.containsValue((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap24);
        int i29 = defaultedMap17.size();
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 1.0f);
        int i38 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        int i44 = defaultedMap40.size();
        boolean b45 = defaultedMap34.containsValue((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) 1.0f);
        int i54 = defaultedMap50.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 1.0f);
        int i60 = defaultedMap56.size();
        boolean b61 = defaultedMap50.containsValue((java.lang.Object) defaultedMap56);
        defaultedMap47.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate68, predicate69);
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate68, predicate71);
        java.lang.String str73 = defaultedMap47.toString();
        java.lang.Object obj75 = defaultedMap47.get((java.lang.Object) 'a');
        defaultedMap34.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection79 = defaultedMap78.values();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) 1.0f);
        int i82 = defaultedMap78.size();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection85 = defaultedMap84.values();
        java.lang.Object obj87 = defaultedMap84.remove((java.lang.Object) 1.0f);
        int i88 = defaultedMap84.size();
        boolean b89 = defaultedMap78.containsValue((java.lang.Object) defaultedMap84);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection92 = defaultedMap91.values();
        boolean b94 = defaultedMap91.containsKey((java.lang.Object) 10.0d);
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) defaultedMap91);
        java.lang.String str96 = defaultedMap84.toString();
        java.lang.Object obj97 = defaultedMap47.remove((java.lang.Object) defaultedMap84);
        defaultedMap17.putAll((java.util.Map) defaultedMap84);
        boolean b99 = defaultedMap1.containsKey((java.lang.Object) defaultedMap84);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 1 + "'", obj75.equals(1));
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "{}" + "'", str96.equals("{}"));
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        int i5 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        java.util.Collection collection14 = defaultedMap10.values();
        boolean b15 = defaultedMap7.containsValue((java.lang.Object) collection14);
        boolean b16 = fixedOrderComparator0.add((java.lang.Object) b15);
        boolean b17 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 1.0f);
        int i25 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        int i31 = defaultedMap27.size();
        boolean b32 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) 1.0f);
        java.lang.Object obj40 = defaultedMap21.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection44 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 1.0f);
        java.util.Collection collection50 = defaultedMap46.values();
        boolean b51 = defaultedMap43.containsValue((java.lang.Object) collection50);
        java.lang.Object obj52 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) b51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str55 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap54.get((java.lang.Object) 1.0f);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap54);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.Factory factory64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, factory64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1 + "'", obj61.equals(1));
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) 1.0f);
        java.util.Collection collection13 = defaultedMap9.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap21.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        boolean b34 = fixedOrderComparator23.add((java.lang.Object) predicate31);
        boolean b36 = fixedOrderComparator23.add((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) b36);
        java.util.Collection collection38 = defaultedMap21.values();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 1, map19, collection38, 10.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(obj_array40);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str5 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) 1.0f);
        int i17 = defaultedMap13.size();
        boolean b18 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        defaultedMap4.putAll((java.util.Map) defaultedMap7);
        java.util.Set set20 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 1.0f);
        int i29 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        int i35 = defaultedMap31.size();
        boolean b36 = defaultedMap25.containsValue((java.lang.Object) defaultedMap31);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate43, predicate46);
        java.lang.Object obj48 = defaultedMap4.get((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap50.clear();
        defaultedMap50.clear();
        try {
            int i53 = fixedOrderComparator0.compare(obj48, (java.lang.Object) defaultedMap50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1 + "'", obj48.equals(1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) i9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 1.0f);
        int i26 = defaultedMap22.size();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap22);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) 1.0f);
        int i39 = defaultedMap35.size();
        java.lang.Object obj40 = defaultedMap31.put((java.lang.Object) (-1.0d), (java.lang.Object) i39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) predicate41);
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) predicate8);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) i9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 1.0f);
        int i26 = defaultedMap22.size();
        boolean b27 = defaultedMap16.containsValue((java.lang.Object) defaultedMap22);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap16);
        boolean b31 = defaultedMap16.containsValue((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 1.0f);
        int i25 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        int i31 = defaultedMap27.size();
        boolean b32 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) 1.0f);
        java.lang.Object obj40 = defaultedMap21.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection44 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 1.0f);
        java.util.Collection collection50 = defaultedMap46.values();
        boolean b51 = defaultedMap43.containsValue((java.lang.Object) collection50);
        java.lang.Object obj52 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) b51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str55 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap54.get((java.lang.Object) 1.0f);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap54);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        java.lang.String str64 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1 + "'", obj61.equals(1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{-1=false, 100=1.0}" + "'", str64.equals("{-1=false, 100=1.0}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) i9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection13 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) (-1.0d), (java.lang.Object) i20);
        java.util.Collection collection22 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        int i31 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 1.0f);
        int i37 = defaultedMap33.size();
        boolean b38 = defaultedMap27.containsValue((java.lang.Object) defaultedMap33);
        defaultedMap24.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj40 = defaultedMap12.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj41 = defaultedMap1.get(obj40);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 1.0f);
        int i28 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 1.0f);
        int i34 = defaultedMap30.size();
        boolean b35 = defaultedMap24.containsValue((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        int i44 = defaultedMap40.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 1.0f);
        int i50 = defaultedMap46.size();
        boolean b51 = defaultedMap40.containsValue((java.lang.Object) defaultedMap46);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection55 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap54.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        collections.Predicate predicate61 = null;
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate58, predicate61);
        java.lang.String str63 = defaultedMap37.toString();
        java.lang.Object obj65 = defaultedMap37.get((java.lang.Object) 'a');
        defaultedMap24.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection69 = defaultedMap68.values();
        java.lang.Object obj71 = defaultedMap68.remove((java.lang.Object) 1.0f);
        int i72 = defaultedMap68.size();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection75 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap74.remove((java.lang.Object) 1.0f);
        int i78 = defaultedMap74.size();
        boolean b79 = defaultedMap68.containsValue((java.lang.Object) defaultedMap74);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection82 = defaultedMap81.values();
        boolean b84 = defaultedMap81.containsKey((java.lang.Object) 10.0d);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) defaultedMap81);
        java.lang.String str86 = defaultedMap74.toString();
        java.lang.Object obj87 = defaultedMap37.remove((java.lang.Object) defaultedMap74);
        defaultedMap7.putAll((java.util.Map) defaultedMap74);
        boolean b89 = defaultedMap74.isEmpty();
        boolean b90 = defaultedMap74.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1 + "'", obj65.equals(1));
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        java.lang.Object obj23 = defaultedMap4.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 1.0f);
        java.util.Collection collection33 = defaultedMap29.values();
        boolean b34 = defaultedMap26.containsValue((java.lang.Object) collection33);
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) 1.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap47.remove((java.lang.Object) 1.0f);
        java.util.Collection collection51 = defaultedMap47.values();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) '4');
        java.util.Set set54 = defaultedMap47.keySet();
        boolean b55 = defaultedMap4.equals((java.lang.Object) set54);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        java.lang.Object obj23 = defaultedMap4.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 1.0f);
        java.util.Collection collection33 = defaultedMap29.values();
        boolean b34 = defaultedMap26.containsValue((java.lang.Object) collection33);
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) 1.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap37);
        int i46 = defaultedMap4.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator47.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate56);
        boolean b58 = fixedOrderComparator47.add((java.lang.Object) predicate55);
        int i59 = fixedOrderComparator47.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection62 = defaultedMap61.values();
        java.lang.Object obj64 = defaultedMap61.remove((java.lang.Object) 1.0f);
        int i65 = defaultedMap61.size();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection68 = defaultedMap67.values();
        java.lang.Object obj70 = defaultedMap67.remove((java.lang.Object) 1.0f);
        int i71 = defaultedMap67.size();
        boolean b72 = defaultedMap61.containsValue((java.lang.Object) defaultedMap67);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection75 = defaultedMap74.values();
        boolean b77 = defaultedMap74.containsKey((java.lang.Object) 10.0d);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) defaultedMap74);
        boolean b79 = fixedOrderComparator47.add((java.lang.Object) defaultedMap74);
        int i80 = fixedOrderComparator47.getUnknownObjectBehavior();
        boolean b81 = fixedOrderComparator47.isLocked();
        boolean b82 = defaultedMap4.containsKey((java.lang.Object) fixedOrderComparator47);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(i80 == 2);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 1.0f);
        int i15 = defaultedMap11.size();
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) 10.0d);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap18);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        boolean b34 = fixedOrderComparator23.add((java.lang.Object) predicate31);
        java.lang.Object obj35 = defaultedMap18.get((java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection38 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) 1.0f);
        int i41 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection44 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap43.remove((java.lang.Object) 1.0f);
        java.util.Collection collection47 = defaultedMap43.values();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) '4');
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection53 = defaultedMap52.values();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) 1.0f);
        int i56 = defaultedMap52.size();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection60 = defaultedMap59.values();
        java.lang.Object obj62 = defaultedMap59.remove((java.lang.Object) 1.0f);
        java.util.Collection collection63 = defaultedMap59.values();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) '4');
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection69 = defaultedMap68.values();
        java.lang.Object obj71 = defaultedMap68.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate66, predicate73);
        java.lang.Object obj76 = defaultedMap43.remove((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection79 = defaultedMap78.values();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) 1.0f);
        java.util.Collection collection82 = defaultedMap78.values();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b85 = defaultedMap78.containsKey((java.lang.Object) 1);
        java.lang.Object obj86 = defaultedMap43.get((java.lang.Object) defaultedMap78);
        try {
            boolean b87 = fixedOrderComparator3.addAsEqual((java.lang.Object) defaultedMap18, obj86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 1 + "'", obj86.equals(1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        boolean b14 = fixedOrderComparator3.add((java.lang.Object) predicate11);
        boolean b16 = fixedOrderComparator3.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) b16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 1.0f);
        int i23 = defaultedMap19.size();
        defaultedMap19.clear();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100L);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) map26);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set14 = defaultedMap1.entrySet();
        java.util.Set set15 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate12);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) 1.0f);
        int i12 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 1.0f);
        int i18 = defaultedMap14.size();
        boolean b19 = defaultedMap8.containsValue((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        int i26 = defaultedMap14.size();
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = defaultedMap14.equals((java.lang.Object) fixedOrderComparator28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b29);
        boolean b31 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 1.0f);
        int i37 = defaultedMap33.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 1.0f);
        int i43 = defaultedMap39.size();
        boolean b44 = defaultedMap33.containsValue((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) 10.0d);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap46);
        java.lang.String str51 = defaultedMap46.toString();
        java.lang.Object obj53 = defaultedMap46.get((java.lang.Object) (byte) 100);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj53);
        boolean b55 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1 + "'", obj53.equals(1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) 1.0f);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap9.clear();
        defaultedMap9.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        boolean b34 = fixedOrderComparator23.add((java.lang.Object) predicate31);
        boolean b35 = fixedOrderComparator21.add((java.lang.Object) b34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 1.0f);
        int i44 = defaultedMap40.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 1.0f);
        int i50 = defaultedMap46.size();
        boolean b51 = defaultedMap40.containsValue((java.lang.Object) defaultedMap46);
        defaultedMap37.putAll((java.util.Map) defaultedMap40);
        java.util.Set set53 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str56 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 1.0f);
        int i62 = defaultedMap58.size();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 1.0f);
        int i68 = defaultedMap64.size();
        boolean b69 = defaultedMap58.containsValue((java.lang.Object) defaultedMap64);
        defaultedMap55.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection73 = defaultedMap72.values();
        java.lang.Object obj75 = defaultedMap72.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate76, predicate77);
        collections.Predicate predicate79 = null;
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate76, predicate79);
        java.lang.Object obj81 = defaultedMap37.get((java.lang.Object) predicate76);
        try {
            int i83 = fixedOrderComparator21.compare((java.lang.Object) predicate76, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 1 + "'", obj81.equals(1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        java.util.Collection collection11 = defaultedMap7.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 1.0f);
        int i20 = defaultedMap16.size();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap16);
        java.util.Set set22 = defaultedMap16.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        boolean b24 = fixedOrderComparator21.add((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 1.0f);
        int i30 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 1.0f);
        java.util.Collection collection36 = defaultedMap32.values();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) 1.0f);
        int i45 = defaultedMap41.size();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str49 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) 1.0f);
        int i55 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 1.0f);
        int i61 = defaultedMap57.size();
        boolean b62 = defaultedMap51.containsValue((java.lang.Object) defaultedMap57);
        defaultedMap48.putAll((java.util.Map) defaultedMap51);
        defaultedMap32.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str67 = defaultedMap66.toString();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection72 = defaultedMap71.values();
        java.lang.Object obj74 = defaultedMap71.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate75, predicate76);
        java.lang.Object obj78 = defaultedMap66.get((java.lang.Object) defaultedMap71);
        java.util.Set set79 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str82 = defaultedMap81.toString();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection87 = defaultedMap86.values();
        java.lang.Object obj89 = defaultedMap86.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate90, predicate91);
        java.lang.Object obj93 = defaultedMap81.get((java.lang.Object) defaultedMap86);
        java.util.Set set94 = defaultedMap81.entrySet();
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) defaultedMap81);
        try {
            boolean b96 = fixedOrderComparator21.addAsEqual((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 1 + "'", obj78.equals(1));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 1 + "'", obj93.equals(1));
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap16.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        java.util.Set set29 = defaultedMap16.entrySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) 1.0f);
        int i39 = defaultedMap35.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) 1.0f);
        int i45 = defaultedMap41.size();
        boolean b46 = defaultedMap35.containsValue((java.lang.Object) defaultedMap41);
        defaultedMap32.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection50 = defaultedMap49.values();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate53, predicate54);
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate53, predicate56);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate53);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate11, predicate12);
        boolean b14 = fixedOrderComparator3.add((java.lang.Object) predicate11);
        boolean b16 = fixedOrderComparator3.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) b16);
        java.util.Collection collection18 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 1.0f);
        int i24 = defaultedMap20.size();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        int i31 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 1.0f);
        int i37 = defaultedMap33.size();
        boolean b38 = defaultedMap27.containsValue((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection41 = defaultedMap40.values();
        boolean b43 = defaultedMap40.containsKey((java.lang.Object) 10.0d);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap40);
        int i45 = defaultedMap33.size();
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b48 = defaultedMap33.equals((java.lang.Object) fixedOrderComparator47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) b48);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) map49);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1 + "'", obj50.equals(1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        defaultedMap1.clear();
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        java.util.Collection collection10 = defaultedMap5.values();
        boolean b11 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap13.clear();
        defaultedMap13.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        boolean b34 = fixedOrderComparator23.add((java.lang.Object) predicate31);
        boolean b35 = fixedOrderComparator21.add((java.lang.Object) b34);
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator21.add((java.lang.Object) obj_array36);
        int i39 = fixedOrderComparator21.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str42 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj47 = defaultedMap44.remove((java.lang.Object) 1.0f);
        int i48 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) 1.0f);
        int i54 = defaultedMap50.size();
        boolean b55 = defaultedMap44.containsValue((java.lang.Object) defaultedMap50);
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate62, predicate63);
        collections.Predicate predicate65 = null;
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate62, predicate65);
        java.lang.String str67 = defaultedMap41.toString();
        java.lang.Object obj69 = defaultedMap41.get((java.lang.Object) 'a');
        java.util.Collection collection70 = defaultedMap41.values();
        boolean b71 = fixedOrderComparator21.add((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1 + "'", obj69.equals(1));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) predicate8);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) 1.0f);
        int i19 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 1.0f);
        int i25 = defaultedMap21.size();
        boolean b26 = defaultedMap15.containsValue((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection29 = defaultedMap28.values();
        boolean b31 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap28);
        try {
            boolean b33 = fixedOrderComparator0.addAsEqual((java.lang.Object) 10, (java.lang.Object) defaultedMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        int i27 = defaultedMap23.size();
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        java.util.Set set30 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 1.0f);
        java.util.Collection collection37 = defaultedMap33.values();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) '4');
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate47);
        java.lang.Object obj50 = defaultedMap31.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj51 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        int i8 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 1.0f);
        int i14 = defaultedMap10.size();
        boolean b15 = defaultedMap4.containsValue((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str19 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 1.0f);
        int i25 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        int i31 = defaultedMap27.size();
        boolean b32 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap18.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) 1.0f);
        java.lang.Object obj40 = defaultedMap21.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection44 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 1.0f);
        java.util.Collection collection50 = defaultedMap46.values();
        boolean b51 = defaultedMap43.containsValue((java.lang.Object) collection50);
        java.lang.Object obj52 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) b51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str55 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 1.0f);
        java.lang.Object obj61 = defaultedMap54.get((java.lang.Object) 1.0f);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap54);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        boolean b64 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1 + "'", obj61.equals(1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        boolean b4 = fixedOrderComparator2.isLocked();
        int i5 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i19 = defaultedMap7.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        boolean b34 = fixedOrderComparator23.add((java.lang.Object) predicate31);
        boolean b35 = fixedOrderComparator21.add((java.lang.Object) b34);
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator21.add((java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array36);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate9);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) predicate8);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 1.0f);
        int i18 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 1.0f);
        int i24 = defaultedMap20.size();
        boolean b25 = defaultedMap14.containsValue((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection28 = defaultedMap27.values();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) 10.0d);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap27);
        boolean b32 = fixedOrderComparator0.add((java.lang.Object) defaultedMap27);
        int i33 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b34 = fixedOrderComparator0.isLocked();
        int i35 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 1.0f);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 1.0f);
        int i11 = defaultedMap7.size();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 1.0f);
        int i21 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        int i27 = defaultedMap23.size();
        boolean b28 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        defaultedMap14.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate35, predicate38);
        java.lang.String str40 = defaultedMap14.toString();
        java.lang.Object obj42 = defaultedMap14.get((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) 1.0d);
        boolean b48 = fixedOrderComparator44.add((java.lang.Object) "{}");
        boolean b49 = fixedOrderComparator44.isLocked();
        fixedOrderComparator44.setUnknownObjectBehavior(1);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) fixedOrderComparator44);
        boolean b53 = fixedOrderComparator44.isLocked();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection56 = defaultedMap55.values();
        java.lang.Object obj58 = defaultedMap55.remove((java.lang.Object) 1.0f);
        java.util.Collection collection59 = defaultedMap55.values();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) '4');
        java.util.Set set62 = defaultedMap55.keySet();
        java.util.Set set63 = defaultedMap55.keySet();
        java.util.Collection collection64 = defaultedMap55.values();
        boolean b65 = fixedOrderComparator44.add((java.lang.Object) collection64);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 1.0d);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) "{}");
        boolean b5 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object obj8 = defaultedMap5.remove((java.lang.Object) 1.0f);
        int i9 = defaultedMap5.size();
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) i9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) 1.0f);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection20 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 1.0f);
        int i27 = defaultedMap23.size();
        java.lang.Object obj28 = defaultedMap19.put((java.lang.Object) (-1.0d), (java.lang.Object) i27);
        java.util.Collection collection29 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 1.0f);
        boolean b35 = defaultedMap19.containsValue((java.lang.Object) defaultedMap31);
        java.util.Set set36 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.String str42 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj47 = defaultedMap44.remove((java.lang.Object) 1.0f);
        int i48 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) 1.0f);
        int i54 = defaultedMap50.size();
        boolean b55 = defaultedMap44.containsValue((java.lang.Object) defaultedMap50);
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 1.0f);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate62, predicate63);
        collections.Predicate predicate65 = null;
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate62, predicate65);
        java.lang.Object obj67 = defaultedMap38.remove((java.lang.Object) map66);
        defaultedMap19.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap70.clear();
        defaultedMap70.clear();
        boolean b73 = defaultedMap19.equals((java.lang.Object) defaultedMap70);
        defaultedMap13.putAll((java.util.Map) defaultedMap70);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b73 == false);
    }
}

