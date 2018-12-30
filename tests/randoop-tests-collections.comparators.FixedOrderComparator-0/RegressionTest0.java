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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 0);
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
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        try {
            boolean b4 = fixedOrderComparator0.addAsEqual((java.lang.Object) (-1L), (java.lang.Object) predicateUtils3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        java.lang.Object obj23 = null;
        try {
            int i24 = fixedOrderComparator12.compare((java.lang.Object) map22, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, fixedOrderComparator1, 0.0d, (short) -1, b5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f, fixedOrderComparator26, 0.0d, (short) -1, b30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj33 = defaultedMap19.get((java.lang.Object) obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array31);
        try {
            int i35 = fixedOrderComparator7.compare((java.lang.Object) (-1.0d), (java.lang.Object) fixedOrderComparator34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1 + "'", obj33.equals(1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        try {
            fixedOrderComparator12.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (-1), (-1L), (-1.0f), "", 2, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, fixedOrderComparator9, 0.0d, (short) -1, b13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        boolean b18 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator16);
        boolean b19 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str22 = defaultedMap21.toString();
        try {
            boolean b23 = fixedOrderComparator7.addAsEqual((java.lang.Object) fixedOrderComparator15, (java.lang.Object) str22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        int i18 = fixedOrderComparator12.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(i18 == 2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0f);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Set set4 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        int i13 = defaultedMap5.size();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map6, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Map map12 = null;
        try {
            defaultedMap8.putAll(map12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0f, fixedOrderComparator10, 0.0d, (short) -1, b14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator17);
        try {
            boolean b23 = fixedOrderComparator17.addAsEqual((java.lang.Object) 0.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1 + "'", obj20.equals(1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        int i12 = defaultedMap8.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (-1), (-1L), (-1.0f), "", 2, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) fixedOrderComparator12);
        java.util.Set set14 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (short) 10);
        java.lang.String str20 = defaultedMap16.toString();
        try {
            int i21 = fixedOrderComparator7.compare((java.lang.Object) set14, (java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0f);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Collection collection14 = defaultedMap1.values();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set6 = defaultedMap5.entrySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f, fixedOrderComparator12, 0.0d, (short) -1, b16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator20);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, fixedOrderComparator20, 0.0d, (short) -1, b24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) fixedOrderComparator33);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        boolean b41 = defaultedMap30.containsKey((java.lang.Object) defaultedMap37);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) 'a');
        boolean b44 = fixedOrderComparator28.add((java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { i5, obj11, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        try {
            fixedOrderComparator46.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(obj_array45);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        java.util.Set set12 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.String str14 = defaultedMap1.toString();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) fixedOrderComparator6);
        defaultedMap3.clear();
        boolean b10 = defaultedMap3.containsKey((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f, fixedOrderComparator12, 0.0d, (short) -1, b16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj22 = defaultedMap3.get((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) map26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        java.util.Set set12 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        boolean b18 = fixedOrderComparator12.isLocked();
        int i19 = fixedOrderComparator12.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, fixedOrderComparator1, 0.0d, (short) -1, b5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        try {
            int i10 = fixedOrderComparator7.compare((java.lang.Object) (short) 1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0f, fixedOrderComparator10, 0.0d, (short) -1, b14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator17);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Set set23 = defaultedMap22.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set23);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1 + "'", obj20.equals(1));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0f, fixedOrderComparator7, 0.0d, (short) -1, b11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = defaultedMap5.equals((java.lang.Object) obj_array12);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array12);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) defaultedMap14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        boolean b5 = defaultedMap1.isEmpty();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Set set14 = defaultedMap1.entrySet();
        boolean b15 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b4 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        boolean b11 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        boolean b18 = defaultedMap13.isEmpty();
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        java.lang.String str20 = defaultedMap7.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (-1), (-1L), (-1.0f), "", 2, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) b29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, fixedOrderComparator32, 0.0d, (short) -1, b36 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        int i39 = fixedOrderComparator38.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b45 = fixedOrderComparator44.isLocked();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 10.0f, fixedOrderComparator41, 0.0d, (short) -1, b45 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator48.isLocked();
        boolean b50 = fixedOrderComparator47.add((java.lang.Object) fixedOrderComparator48);
        java.lang.Object obj51 = defaultedMap1.put((java.lang.Object) i39, (java.lang.Object) fixedOrderComparator48);
        try {
            fixedOrderComparator48.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set19 = defaultedMap18.entrySet();
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 1.0f);
        defaultedMap18.putAll((java.util.Map) defaultedMap25);
        boolean b29 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        int i30 = fixedOrderComparator16.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i30 == 2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) fixedOrderComparator37);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 100.0d);
        boolean b45 = defaultedMap34.containsKey((java.lang.Object) defaultedMap41);
        defaultedMap18.putAll((java.util.Map) defaultedMap41);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0f, fixedOrderComparator7, 0.0d, (short) -1, b11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = defaultedMap5.equals((java.lang.Object) obj_array12);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array12);
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        boolean b10 = defaultedMap7.containsValue((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap7.containsValue((java.lang.Object) (-1.0d));
        java.lang.String str13 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) fixedOrderComparator20);
        java.util.Set set22 = defaultedMap17.keySet();
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) defaultedMap17);
        try {
            boolean b24 = fixedOrderComparator4.addAsEqual((java.lang.Object) str13, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + true + "'", obj23.equals(true));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100.0d);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        boolean b18 = fixedOrderComparator12.isLocked();
        try {
            fixedOrderComparator12.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0f, fixedOrderComparator10, 0.0d, (short) -1, b14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b18 = defaultedMap8.equals((java.lang.Object) obj_array15);
        java.util.Set set19 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Set set14 = defaultedMap1.entrySet();
        boolean b16 = defaultedMap1.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, fixedOrderComparator23, 0.0d, (short) -1, b27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = defaultedMap21.equals((java.lang.Object) obj_array28);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, fixedOrderComparator36, 0.0d, (short) -1, b40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap34.equals((java.lang.Object) obj_array41);
        java.util.Set set45 = defaultedMap34.entrySet();
        defaultedMap34.clear();
        java.lang.String str47 = defaultedMap34.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection49 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set52 = defaultedMap51.entrySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 100.0d);
        boolean b55 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) fixedOrderComparator60);
        boolean b62 = defaultedMap57.isEmpty();
        java.lang.Object obj63 = defaultedMap51.get((java.lang.Object) defaultedMap57);
        boolean b64 = defaultedMap34.containsKey(obj63);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1 + "'", obj63.equals(1));
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) fixedOrderComparator7);
        defaultedMap4.clear();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10.0f, fixedOrderComparator13, 0.0d, (short) -1, b17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        boolean b22 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator20);
        boolean b23 = fixedOrderComparator19.isLocked();
        java.lang.Object obj24 = defaultedMap4.put(obj11, (java.lang.Object) fixedOrderComparator19);
        boolean b25 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 10 + "'", obj10.equals((byte) 10));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str35 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) fixedOrderComparator40);
        defaultedMap37.clear();
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) defaultedMap37);
        java.util.Set set44 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set47 = defaultedMap46.entrySet();
        boolean b49 = defaultedMap46.containsValue((java.lang.Object) (short) 10);
        defaultedMap46.clear();
        defaultedMap46.clear();
        java.util.Set set52 = defaultedMap46.keySet();
        int i53 = fixedOrderComparator16.compare((java.lang.Object) defaultedMap37, (java.lang.Object) defaultedMap46);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 10 + "'", obj43.equals((byte) 10));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(i53 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f, fixedOrderComparator12, 0.0d, (short) -1, b16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator19);
        boolean b22 = fixedOrderComparator18.isLocked();
        java.lang.Object obj23 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator18);
        boolean b24 = fixedOrderComparator18.isLocked();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap4.values();
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) collection5);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) collection16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str20 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) fixedOrderComparator25);
        defaultedMap22.clear();
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) defaultedMap22);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 10 + "'", obj28.equals((byte) 10));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, fixedOrderComparator34, 0.0d, (short) -1, b38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b42 = defaultedMap32.equals((java.lang.Object) obj_array39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set45 = defaultedMap44.entrySet();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100.0d);
        boolean b48 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap32.remove((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set52 = defaultedMap51.entrySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 100.0d);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1.0d));
        java.lang.Object obj57 = defaultedMap1.put((java.lang.Object) defaultedMap44, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, fixedOrderComparator1, 0.0d, (short) -1, b5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) fixedOrderComparator19);
        defaultedMap16.clear();
        boolean b22 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        boolean b24 = defaultedMap12.isEmpty();
        java.util.Collection collection25 = defaultedMap12.values();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        try {
            int i28 = fixedOrderComparator7.compare((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f, fixedOrderComparator12, 0.0d, (short) -1, b16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator19);
        boolean b22 = fixedOrderComparator18.isLocked();
        java.lang.Object obj23 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator18);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator11);
        java.util.Set set13 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap8.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) fixedOrderComparator23);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set28 = defaultedMap27.entrySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap20.containsKey((java.lang.Object) defaultedMap27);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) defaultedMap33);
        boolean b36 = defaultedMap27.equals((java.lang.Object) 10L);
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) 1.0f, (java.lang.Object) b36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set40 = defaultedMap39.entrySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100.0d);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator49.isLocked();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0f, fixedOrderComparator46, 0.0d, (short) -1, b50 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj53 = defaultedMap39.get((java.lang.Object) obj_array51);
        defaultedMap8.putAll((java.util.Map) defaultedMap39);
        boolean b56 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set57 = defaultedMap8.keySet();
        boolean b58 = defaultedMap1.containsKey((java.lang.Object) set57);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1 + "'", obj53.equals(1));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set36 = defaultedMap35.entrySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        boolean b39 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) fixedOrderComparator44);
        boolean b46 = defaultedMap41.isEmpty();
        java.lang.Object obj47 = defaultedMap35.get((java.lang.Object) defaultedMap41);
        java.util.Set set48 = defaultedMap35.keySet();
        try {
            boolean b49 = fixedOrderComparator16.addAsEqual((java.lang.Object) 1L, (java.lang.Object) set48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1 + "'", obj47.equals(1));
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1.0f);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap1.remove(obj10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        java.util.Set set12 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.String str14 = defaultedMap1.toString();
        java.util.Set set15 = defaultedMap1.entrySet();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Set set18 = defaultedMap17.entrySet();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10.0d + "'", obj19.equals(10.0d));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        boolean b6 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set18 = defaultedMap17.entrySet();
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) (short) 10);
        defaultedMap17.clear();
        defaultedMap17.clear();
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 1.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 10.0f, fixedOrderComparator30, 0.0d, (short) -1, b34 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        boolean b39 = fixedOrderComparator36.add((java.lang.Object) fixedOrderComparator37);
        boolean b40 = fixedOrderComparator36.isLocked();
        java.lang.Object obj41 = defaultedMap25.get((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator48.isLocked();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10.0f, fixedOrderComparator45, 0.0d, (short) -1, b49 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        boolean b53 = defaultedMap43.equals((java.lang.Object) obj_array50);
        java.util.Set set54 = defaultedMap43.entrySet();
        java.lang.Object obj55 = defaultedMap17.put(obj41, (java.lang.Object) set54);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, fixedOrderComparator1, 0.0d, (short) -1, b5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b9 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) fixedOrderComparator14);
        java.util.Set set16 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str19 = defaultedMap18.toString();
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection21 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        boolean b27 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100.0d);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1.0d));
        boolean b35 = defaultedMap23.equals((java.lang.Object) defaultedMap29);
        java.util.Set set36 = defaultedMap23.entrySet();
        try {
            int i37 = fixedOrderComparator7.compare((java.lang.Object) defaultedMap11, (java.lang.Object) set36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        boolean b17 = defaultedMap5.equals((java.lang.Object) map16);
        java.lang.Object obj18 = null;
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj18);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, fixedOrderComparator23, 0.0d, (short) -1, b27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = defaultedMap21.equals((java.lang.Object) obj_array28);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, fixedOrderComparator36, 0.0d, (short) -1, b40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap34.equals((java.lang.Object) obj_array41);
        java.util.Set set45 = defaultedMap34.entrySet();
        defaultedMap34.clear();
        java.lang.String str47 = defaultedMap34.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection49 = defaultedMap34.values();
        java.util.Collection collection50 = defaultedMap34.values();
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str6 = defaultedMap5.toString();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) str6);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, fixedOrderComparator39, 0.0d, (short) -1, b43 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) obj_array44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str50 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set53 = defaultedMap52.entrySet();
        java.lang.Object obj55 = defaultedMap52.get((java.lang.Object) (byte) 100);
        boolean b56 = defaultedMap52.isEmpty();
        boolean b57 = defaultedMap49.containsKey((java.lang.Object) defaultedMap52);
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) b57);
        collections.Predicate predicate59 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set62 = defaultedMap61.entrySet();
        boolean b64 = defaultedMap61.containsValue((java.lang.Object) (short) 10);
        defaultedMap61.clear();
        java.util.Collection collection66 = defaultedMap61.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set69 = defaultedMap68.entrySet();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) 100.0d);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) (-1.0d));
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate74, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate59, predicate77);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1 + "'", obj46.equals(1));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1 + "'", obj55.equals(1));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1 + "'", obj58.equals(1));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Collection collection14 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) collection14);
        boolean b16 = defaultedMap15.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        boolean b3 = fixedOrderComparator2.isLocked();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator2);
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) fixedOrderComparator15);
        boolean b18 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator15);
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) fixedOrderComparator23);
        defaultedMap20.clear();
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator32.isLocked();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0f, fixedOrderComparator29, 0.0d, (short) -1, b33 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        boolean b38 = fixedOrderComparator35.add((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj39 = defaultedMap20.get((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set46 = defaultedMap45.entrySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 100.0d);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        boolean b56 = fixedOrderComparator55.isLocked();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 10.0f, fixedOrderComparator52, 0.0d, (short) -1, b56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj59 = defaultedMap45.get((java.lang.Object) obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) fixedOrderComparator65);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set70 = defaultedMap69.entrySet();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 100.0d);
        boolean b73 = defaultedMap62.containsKey((java.lang.Object) defaultedMap69);
        java.lang.Object obj75 = defaultedMap62.remove((java.lang.Object) 'a');
        boolean b76 = fixedOrderComparator60.add((java.lang.Object) defaultedMap62);
        boolean b77 = defaultedMap20.containsKey((java.lang.Object) b76);
        java.util.Map map78 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1 + "'", obj39.equals(1));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1 + "'", obj59.equals(1));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) collection11);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Collection collection2 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, fixedOrderComparator39, 0.0d, (short) -1, b43 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) obj_array44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        boolean b49 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set50 = defaultedMap1.keySet();
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap1.get(obj51);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1 + "'", obj46.equals(1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1 + "'", obj52.equals(1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0f, fixedOrderComparator10, 0.0d, (short) -1, b14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        boolean b19 = fixedOrderComparator16.add((java.lang.Object) fixedOrderComparator17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator17);
        try {
            fixedOrderComparator17.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1 + "'", obj20.equals(1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, fixedOrderComparator20, 0.0d, (short) -1, b24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) fixedOrderComparator33);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        boolean b41 = defaultedMap30.containsKey((java.lang.Object) defaultedMap37);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) 'a');
        boolean b44 = fixedOrderComparator28.add((java.lang.Object) defaultedMap30);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator49.isLocked();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0f, fixedOrderComparator46, 0.0d, (short) -1, b50 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator53.isLocked();
        boolean b55 = fixedOrderComparator52.add((java.lang.Object) fixedOrderComparator53);
        boolean b56 = fixedOrderComparator52.isLocked();
        boolean b57 = defaultedMap30.equals((java.lang.Object) b56);
        try {
            boolean b58 = fixedOrderComparator4.addAsEqual((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) predicate15);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator11);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0d);
        boolean b19 = defaultedMap8.containsKey((java.lang.Object) defaultedMap15);
        java.lang.Object obj21 = defaultedMap8.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 10.0f, fixedOrderComparator30, 0.0d, (short) -1, b34 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b38 = defaultedMap28.equals((java.lang.Object) obj_array35);
        java.lang.Object obj39 = defaultedMap8.put((java.lang.Object) 100.0d, (java.lang.Object) b38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b47 = fixedOrderComparator46.isLocked();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0f, fixedOrderComparator43, 0.0d, (short) -1, b47 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b51 = defaultedMap41.equals((java.lang.Object) obj_array48);
        java.util.Set set52 = defaultedMap41.entrySet();
        defaultedMap41.clear();
        java.lang.String str54 = defaultedMap41.toString();
        defaultedMap8.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set58 = defaultedMap57.entrySet();
        boolean b60 = defaultedMap57.containsValue((java.lang.Object) (short) 10);
        defaultedMap57.clear();
        defaultedMap57.clear();
        java.util.Set set63 = defaultedMap57.keySet();
        boolean b64 = defaultedMap41.containsKey((java.lang.Object) set63);
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1 + "'", obj65.equals(1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, fixedOrderComparator1, 0.0d, (short) -1, b5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) fixedOrderComparator13);
        java.util.Set set15 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0f, fixedOrderComparator21, 0.0d, (short) -1, b25 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator28.isLocked();
        boolean b30 = fixedOrderComparator27.add((java.lang.Object) fixedOrderComparator28);
        boolean b31 = fixedOrderComparator27.isLocked();
        java.lang.Object obj32 = defaultedMap17.remove((java.lang.Object) fixedOrderComparator27);
        try {
            boolean b33 = fixedOrderComparator7.addAsEqual(obj8, obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, fixedOrderComparator23, 0.0d, (short) -1, b27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = defaultedMap21.equals((java.lang.Object) obj_array28);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, fixedOrderComparator36, 0.0d, (short) -1, b40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap34.equals((java.lang.Object) obj_array41);
        java.util.Set set45 = defaultedMap34.entrySet();
        defaultedMap34.clear();
        java.lang.String str47 = defaultedMap34.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection49 = defaultedMap34.values();
        java.util.Collection collection50 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj56 = defaultedMap52.remove((java.lang.Object) fixedOrderComparator55);
        boolean b57 = defaultedMap52.isEmpty();
        java.util.Collection collection58 = defaultedMap52.values();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set5 = defaultedMap4.entrySet();
        java.lang.Object obj7 = defaultedMap4.get((java.lang.Object) (byte) 100);
        boolean b8 = defaultedMap4.isEmpty();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        int i10 = defaultedMap4.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f, fixedOrderComparator12, 0.0d, (short) -1, b16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator19);
        boolean b22 = fixedOrderComparator18.isLocked();
        java.lang.Object obj23 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator18);
        defaultedMap8.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, fixedOrderComparator34, 0.0d, (short) -1, b38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator41.isLocked();
        boolean b43 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator41);
        boolean b44 = fixedOrderComparator40.isLocked();
        boolean b45 = defaultedMap18.equals((java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set48 = defaultedMap47.entrySet();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100.0d);
        boolean b51 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) fixedOrderComparator56);
        boolean b58 = defaultedMap53.isEmpty();
        java.lang.Object obj59 = defaultedMap47.get((java.lang.Object) defaultedMap53);
        java.util.Set set60 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set63 = defaultedMap62.entrySet();
        boolean b65 = defaultedMap62.containsValue((java.lang.Object) (short) 10);
        defaultedMap62.clear();
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set70 = defaultedMap69.entrySet();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 100.0d);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate76, predicate78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set82 = defaultedMap81.entrySet();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) 100.0d);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) (-1.0d));
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate87, predicate88);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) predicate87);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate78, predicate87);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1 + "'", obj59.equals(1));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set15 = defaultedMap14.entrySet();
        boolean b17 = defaultedMap14.containsValue((java.lang.Object) (short) 10);
        defaultedMap14.clear();
        java.util.Collection collection19 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set22 = defaultedMap21.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 100.0d);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate27, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set34 = defaultedMap33.entrySet();
        int i35 = defaultedMap33.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, fixedOrderComparator39, 0.0d, (short) -1, b43 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b47 = defaultedMap37.equals((java.lang.Object) obj_array44);
        java.util.Set set48 = defaultedMap37.entrySet();
        defaultedMap37.clear();
        java.lang.String str50 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        boolean b52 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        try {
            int i53 = fixedOrderComparator12.compare((java.lang.Object) map31, (java.lang.Object) b52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0d);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0f, fixedOrderComparator39, 0.0d, (short) -1, b43 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object obj46 = defaultedMap32.get((java.lang.Object) obj_array44);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) fixedOrderComparator56);
        defaultedMap53.clear();
        boolean b59 = defaultedMap53.isEmpty();
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        boolean b61 = defaultedMap49.isEmpty();
        java.util.Collection collection62 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) collection62);
        defaultedMap1.putAll((java.util.Map) defaultedMap63);
        java.lang.String str65 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1 + "'", obj46.equals(1));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{1.0=false}" + "'", str65.equals("{1.0=false}"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, fixedOrderComparator1, 0.0d, (short) -1, b5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (byte) 100);
        boolean b14 = defaultedMap10.isEmpty();
        java.util.Set set15 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, fixedOrderComparator19, 0.0d, (short) -1, b23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = defaultedMap17.equals((java.lang.Object) obj_array24);
        java.util.Set set28 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        try {
            int i31 = fixedOrderComparator7.compare((java.lang.Object) "", (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.util.Collection collection10 = defaultedMap1.values();
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) fixedOrderComparator20);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        boolean b28 = defaultedMap17.containsKey((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap14.equals((java.lang.Object) b28);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b17 = fixedOrderComparator16.isLocked();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f, fixedOrderComparator26, 0.0d, (short) -1, b30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator33.isLocked();
        boolean b35 = fixedOrderComparator32.add((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) fixedOrderComparator33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set39 = defaultedMap38.entrySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0d);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate45);
        boolean b47 = fixedOrderComparator33.add((java.lang.Object) predicate44);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate19, predicate44);
        try {
            java.util.Map map49 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (-1), (-1L), (-1.0f), "", 2, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b14 = defaultedMap4.equals((java.lang.Object) obj_array11);
        java.util.Set set15 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0f, fixedOrderComparator19, 0.0d, (short) -1, b23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = defaultedMap17.equals((java.lang.Object) obj_array24);
        java.util.Set set28 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        java.lang.String str30 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        int i32 = defaultedMap17.size();
        try {
            int i33 = fixedOrderComparator0.compare((java.lang.Object) set15, (java.lang.Object) i32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set13 = defaultedMap12.entrySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        boolean b19 = defaultedMap12.containsKey((java.lang.Object) defaultedMap18);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) b19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.String str18 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100.0d);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f, fixedOrderComparator17, 0.0d, (short) -1, b21 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj24 = defaultedMap10.get((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) fixedOrderComparator30);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set35 = defaultedMap34.entrySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        boolean b38 = defaultedMap27.containsKey((java.lang.Object) defaultedMap34);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) 'a');
        boolean b41 = fixedOrderComparator25.add((java.lang.Object) defaultedMap27);
        boolean b42 = defaultedMap27.isEmpty();
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) b42);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1 + "'", obj24.equals(1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) b29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, fixedOrderComparator32, 0.0d, (short) -1, b36 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        int i39 = fixedOrderComparator38.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b45 = fixedOrderComparator44.isLocked();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 10.0f, fixedOrderComparator41, 0.0d, (short) -1, b45 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator48.isLocked();
        boolean b50 = fixedOrderComparator47.add((java.lang.Object) fixedOrderComparator48);
        java.lang.Object obj51 = defaultedMap1.put((java.lang.Object) i39, (java.lang.Object) fixedOrderComparator48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str54 = defaultedMap53.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap53.remove((java.lang.Object) defaultedMap57);
        java.lang.Object obj59 = defaultedMap1.get((java.lang.Object) defaultedMap57);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1 + "'", obj59.equals(1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0f, fixedOrderComparator7, 0.0d, (short) -1, b11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = defaultedMap5.equals((java.lang.Object) obj_array12);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array12);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i18 == 2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap14);
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap14.put((java.lang.Object) collection20, obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set25 = defaultedMap24.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        boolean b28 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set31 = defaultedMap30.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 100.0d);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (-1.0d));
        boolean b36 = defaultedMap24.equals((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap30.get((java.lang.Object) collection39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj40);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) fixedOrderComparator15);
        boolean b18 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap1.containsKey(obj19);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b13 = defaultedMap1.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, fixedOrderComparator15, 0.0d, (short) -1, b19 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator24);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        boolean b19 = fixedOrderComparator12.add((java.lang.Object) 100L);
        int i20 = fixedOrderComparator12.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, fixedOrderComparator20, 0.0d, (short) -1, b24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) fixedOrderComparator33);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        boolean b41 = defaultedMap30.containsKey((java.lang.Object) defaultedMap37);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) 'a');
        boolean b44 = fixedOrderComparator28.add((java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { i5, obj11, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(obj_array45);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        int i13 = defaultedMap5.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, fixedOrderComparator15, 0.0d, (short) -1, b19 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        boolean b24 = defaultedMap5.equals((java.lang.Object) i23);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, fixedOrderComparator11, 0.0d, (short) -1, b15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) i18);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        boolean b13 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0d);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap9.equals((java.lang.Object) defaultedMap15);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set25 = defaultedMap24.entrySet();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) (short) 10);
        java.lang.String str28 = defaultedMap24.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        int i13 = defaultedMap1.size();
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj6 = defaultedMap2.remove((java.lang.Object) fixedOrderComparator5);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        boolean b13 = defaultedMap2.containsKey((java.lang.Object) defaultedMap9);
        java.lang.Object obj14 = null;
        try {
            boolean b15 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap9, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set8 = defaultedMap7.entrySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100.0d);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) fixedOrderComparator22);
        defaultedMap19.clear();
        boolean b25 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        boolean b27 = defaultedMap15.isEmpty();
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0f, fixedOrderComparator20, 0.0d, (short) -1, b24 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) fixedOrderComparator33);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set38 = defaultedMap37.entrySet();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0d);
        boolean b41 = defaultedMap30.containsKey((java.lang.Object) defaultedMap37);
        java.lang.Object obj43 = defaultedMap30.remove((java.lang.Object) 'a');
        boolean b44 = fixedOrderComparator28.add((java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { i5, obj11, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b47 = fixedOrderComparator46.isLocked();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0f, fixedOrderComparator6, 0.0d, (short) -1, b10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator13);
        boolean b16 = fixedOrderComparator12.isLocked();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        boolean b18 = fixedOrderComparator12.isLocked();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        boolean b20 = fixedOrderComparator12.add((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1.0f);
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set28 = defaultedMap27.entrySet();
        boolean b30 = defaultedMap27.containsValue((java.lang.Object) (short) 10);
        defaultedMap27.clear();
        java.util.Collection collection32 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set35 = defaultedMap34.entrySet();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1.0d));
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate40, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set47 = defaultedMap46.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100.0d);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) (-1.0d));
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate40, predicate53);
        boolean b56 = fixedOrderComparator12.add((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, fixedOrderComparator34, 0.0d, (short) -1, b38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator41.isLocked();
        boolean b43 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator41);
        boolean b44 = fixedOrderComparator40.isLocked();
        boolean b45 = defaultedMap18.equals((java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        boolean b57 = fixedOrderComparator56.isLocked();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0f, fixedOrderComparator53, 0.0d, (short) -1, b57 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b61 = defaultedMap51.equals((java.lang.Object) obj_array58);
        java.lang.Object obj62 = defaultedMap47.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object obj64 = defaultedMap18.get((java.lang.Object) obj_array58);
        java.util.Set set65 = defaultedMap18.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1 + "'", obj64.equals(1));
        org.junit.Assert.assertNotNull(set65);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0f, fixedOrderComparator10, 0.0d, (short) -1, b14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b18 = defaultedMap8.equals((java.lang.Object) obj_array15);
        java.util.Set set19 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (byte) 100);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Set set28 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b36 = fixedOrderComparator35.isLocked();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0f, fixedOrderComparator32, 0.0d, (short) -1, b36 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b40 = defaultedMap30.equals((java.lang.Object) obj_array37);
        java.util.Set set41 = defaultedMap30.entrySet();
        defaultedMap30.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 1.0f);
        java.util.Set set48 = defaultedMap45.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator53.isLocked();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f, fixedOrderComparator50, 0.0d, (short) -1, b54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        boolean b58 = fixedOrderComparator57.isLocked();
        boolean b59 = fixedOrderComparator56.add((java.lang.Object) fixedOrderComparator57);
        boolean b60 = fixedOrderComparator56.isLocked();
        java.lang.Object obj61 = defaultedMap45.get((java.lang.Object) fixedOrderComparator56);
        boolean b63 = fixedOrderComparator56.add((java.lang.Object) 100L);
        java.lang.Object obj64 = defaultedMap30.get((java.lang.Object) fixedOrderComparator56);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str67 = defaultedMap66.toString();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj73 = defaultedMap69.remove((java.lang.Object) fixedOrderComparator72);
        defaultedMap69.clear();
        java.lang.Object obj75 = defaultedMap66.get((java.lang.Object) defaultedMap69);
        boolean b76 = fixedOrderComparator56.add((java.lang.Object) defaultedMap66);
        java.lang.Object obj77 = defaultedMap1.get((java.lang.Object) b76);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1 + "'", obj61.equals(1));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 10.0d + "'", obj64.equals(10.0d));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (byte) 10 + "'", obj75.equals((byte) 10));
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 1 + "'", obj77.equals(1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) fixedOrderComparator6);
        java.util.Set set8 = defaultedMap3.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator14.isLocked();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, fixedOrderComparator11, 0.0d, (short) -1, b15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) fixedOrderComparator18);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        java.util.Set set12 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.String str14 = defaultedMap1.toString();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0f, fixedOrderComparator7, 0.0d, (short) -1, b11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = defaultedMap5.equals((java.lang.Object) obj_array12);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set19 = defaultedMap18.entrySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (byte) 100);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Set set23 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0f, fixedOrderComparator27, 0.0d, (short) -1, b31 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = defaultedMap25.equals((java.lang.Object) obj_array32);
        java.util.Set set36 = defaultedMap25.entrySet();
        defaultedMap25.clear();
        defaultedMap18.putAll((java.util.Map) defaultedMap25);
        int i39 = defaultedMap25.size();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10.0d + "'", obj40.equals(10.0d));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) fixedOrderComparator16);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100.0d);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set27 = defaultedMap26.entrySet();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 100.0d);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0f, fixedOrderComparator33, 0.0d, (short) -1, b37 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        java.lang.Object obj40 = defaultedMap26.get((java.lang.Object) obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj47 = defaultedMap43.remove((java.lang.Object) fixedOrderComparator46);
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set51 = defaultedMap50.entrySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100.0d);
        boolean b54 = defaultedMap43.containsKey((java.lang.Object) defaultedMap50);
        java.lang.Object obj56 = defaultedMap43.remove((java.lang.Object) 'a');
        boolean b57 = fixedOrderComparator41.add((java.lang.Object) defaultedMap43);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        boolean b63 = fixedOrderComparator62.isLocked();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 10.0f, fixedOrderComparator59, 0.0d, (short) -1, b63 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        boolean b67 = fixedOrderComparator66.isLocked();
        boolean b68 = fixedOrderComparator65.add((java.lang.Object) fixedOrderComparator66);
        boolean b69 = fixedOrderComparator65.isLocked();
        boolean b70 = defaultedMap43.equals((java.lang.Object) b69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str73 = defaultedMap72.toString();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator();
        boolean b82 = fixedOrderComparator81.isLocked();
        java.lang.Object[] obj_array83 = new java.lang.Object[] { 10.0f, fixedOrderComparator78, 0.0d, (short) -1, b82 };
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array83);
        boolean b86 = defaultedMap76.equals((java.lang.Object) obj_array83);
        java.lang.Object obj87 = defaultedMap72.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array83);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array83);
        java.lang.Object obj89 = defaultedMap43.get((java.lang.Object) obj_array83);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap43);
        boolean b91 = defaultedMap1.containsValue((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 1 + "'", obj89.equals(1));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) fixedOrderComparator15);
        boolean b18 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) (byte) 100);
        boolean b24 = defaultedMap20.isEmpty();
        java.util.Set set25 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator32.isLocked();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0f, fixedOrderComparator29, 0.0d, (short) -1, b33 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b37 = defaultedMap27.equals((java.lang.Object) obj_array34);
        java.util.Set set38 = defaultedMap27.entrySet();
        defaultedMap27.clear();
        defaultedMap20.putAll((java.util.Map) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 1.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        boolean b13 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0d);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap9.equals((java.lang.Object) defaultedMap15);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) b21);
        java.lang.String str23 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, fixedOrderComparator4, 0.0d, (short) -1, b8 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj14 = defaultedMap2.get((java.lang.Object) fixedOrderComparator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 10.0f, fixedOrderComparator22, 0.0d, (short) -1, b26 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b30 = defaultedMap20.equals((java.lang.Object) obj_array27);
        java.lang.Object obj31 = defaultedMap16.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) (byte) 100);
        boolean b37 = defaultedMap33.isEmpty();
        java.util.Set set38 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator45.isLocked();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0f, fixedOrderComparator42, 0.0d, (short) -1, b46 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b50 = defaultedMap40.equals((java.lang.Object) obj_array47);
        java.util.Set set51 = defaultedMap40.entrySet();
        defaultedMap40.clear();
        defaultedMap33.putAll((java.util.Map) defaultedMap40);
        int i54 = defaultedMap33.size();
        try {
            boolean b55 = fixedOrderComparator11.addAsEqual((java.lang.Object) obj_array27, (java.lang.Object) i54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1 + "'", obj36.equals(1));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i54 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 100);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator13.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0f, fixedOrderComparator10, 0.0d, (short) -1, b14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b18 = defaultedMap8.equals((java.lang.Object) obj_array15);
        java.util.Set set19 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set22 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, fixedOrderComparator23, 0.0d, (short) -1, b27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = defaultedMap21.equals((java.lang.Object) obj_array28);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, fixedOrderComparator36, 0.0d, (short) -1, b40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap34.equals((java.lang.Object) obj_array41);
        java.util.Set set45 = defaultedMap34.entrySet();
        defaultedMap34.clear();
        java.lang.String str47 = defaultedMap34.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set51 = defaultedMap50.entrySet();
        boolean b53 = defaultedMap50.containsValue((java.lang.Object) (short) 10);
        defaultedMap50.clear();
        defaultedMap50.clear();
        java.util.Set set56 = defaultedMap50.keySet();
        boolean b57 = defaultedMap34.containsKey((java.lang.Object) set56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) fixedOrderComparator62);
        defaultedMap59.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set67 = defaultedMap66.entrySet();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 100.0d);
        boolean b70 = defaultedMap59.containsKey((java.lang.Object) defaultedMap66);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b73 = defaultedMap66.containsValue((java.lang.Object) defaultedMap72);
        boolean b74 = defaultedMap34.equals((java.lang.Object) b73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj80 = defaultedMap76.remove((java.lang.Object) fixedOrderComparator79);
        defaultedMap76.clear();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set84 = defaultedMap83.entrySet();
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap83, (java.lang.Object) 100.0d);
        boolean b87 = defaultedMap76.containsKey((java.lang.Object) defaultedMap83);
        java.lang.Object obj89 = defaultedMap76.remove((java.lang.Object) 'a');
        java.lang.Object obj90 = defaultedMap34.remove((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) fixedOrderComparator10);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100.0d);
        boolean b18 = defaultedMap7.containsKey((java.lang.Object) defaultedMap14);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set24 = defaultedMap23.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        boolean b27 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) fixedOrderComparator32);
        boolean b34 = defaultedMap29.isEmpty();
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) defaultedMap29);
        java.lang.String str36 = defaultedMap23.toString();
        java.lang.Object obj37 = defaultedMap14.remove((java.lang.Object) defaultedMap23);
        try {
            int i39 = fixedOrderComparator4.compare(obj37, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) fixedOrderComparator37);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set42 = defaultedMap41.entrySet();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 100.0d);
        boolean b45 = defaultedMap34.containsKey((java.lang.Object) defaultedMap41);
        defaultedMap18.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj49 = defaultedMap18.get((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        boolean b57 = fixedOrderComparator56.isLocked();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0f, fixedOrderComparator53, 0.0d, (short) -1, b57 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b61 = defaultedMap51.equals((java.lang.Object) obj_array58);
        java.util.Set set62 = defaultedMap51.entrySet();
        defaultedMap51.clear();
        java.lang.String str64 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.lang.Object obj66 = defaultedMap18.remove((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1 + "'", obj49.equals(1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) fixedOrderComparator15);
        boolean b18 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator15);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator5.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, fixedOrderComparator9, 0.0d, (short) -1, b13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        boolean b18 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator16);
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) fixedOrderComparator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0f, fixedOrderComparator27, 0.0d, (short) -1, b31 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b35 = defaultedMap25.equals((java.lang.Object) obj_array32);
        java.util.Set set36 = defaultedMap25.entrySet();
        defaultedMap25.clear();
        java.lang.String str38 = defaultedMap25.toString();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap25);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f, fixedOrderComparator3, 0.0d, (short) -1, b7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100.0d);
        boolean b17 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) fixedOrderComparator23);
        boolean b25 = defaultedMap20.isEmpty();
        java.util.Collection collection26 = defaultedMap20.values();
        java.util.Set set27 = defaultedMap20.entrySet();
        java.lang.Object obj28 = defaultedMap13.get((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) fixedOrderComparator15);
        boolean b18 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator15);
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap3.put(obj6, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) fixedOrderComparator7);
        defaultedMap4.clear();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.lang.Object obj11 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10.0f, fixedOrderComparator13, 0.0d, (short) -1, b17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        boolean b22 = fixedOrderComparator19.add((java.lang.Object) fixedOrderComparator20);
        boolean b23 = fixedOrderComparator19.isLocked();
        java.lang.Object obj24 = defaultedMap4.put(obj11, (java.lang.Object) fixedOrderComparator19);
        boolean b25 = fixedOrderComparator19.isLocked();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 10 + "'", obj10.equals((byte) 10));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (-1), (-1L), (-1.0f), "", 2, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0f, fixedOrderComparator16, 0.0d, (short) -1, b20 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap9.get((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) fixedOrderComparator29);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        boolean b37 = defaultedMap26.containsKey((java.lang.Object) defaultedMap33);
        java.lang.Object obj39 = defaultedMap26.remove((java.lang.Object) 'a');
        boolean b40 = fixedOrderComparator24.add((java.lang.Object) defaultedMap26);
        boolean b41 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator24);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator42.isLocked();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator49.isLocked();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0f, fixedOrderComparator46, 0.0d, (short) -1, b50 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator53.isLocked();
        boolean b55 = fixedOrderComparator52.add((java.lang.Object) fixedOrderComparator53);
        java.lang.Object obj56 = defaultedMap44.get((java.lang.Object) fixedOrderComparator53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set59 = defaultedMap58.entrySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 100.0d);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        boolean b67 = fixedOrderComparator53.add((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set70 = defaultedMap69.entrySet();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 100.0d);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) predicate75);
        try {
            int i79 = fixedOrderComparator7.compare((java.lang.Object) predicate64, (java.lang.Object) predicate75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (-1), (-1L), (-1.0f), "", 2, (-1L) };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0d);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0f, fixedOrderComparator16, 0.0d, (short) -1, b20 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap9.get((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) fixedOrderComparator29);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0d);
        boolean b37 = defaultedMap26.containsKey((java.lang.Object) defaultedMap33);
        java.lang.Object obj39 = defaultedMap26.remove((java.lang.Object) 'a');
        boolean b40 = fixedOrderComparator24.add((java.lang.Object) defaultedMap26);
        boolean b41 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator24);
        int i42 = fixedOrderComparator24.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i42 == 2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, fixedOrderComparator23, 0.0d, (short) -1, b27 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = defaultedMap21.equals((java.lang.Object) obj_array28);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator39.isLocked();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f, fixedOrderComparator36, 0.0d, (short) -1, b40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap34.equals((java.lang.Object) obj_array41);
        java.util.Set set45 = defaultedMap34.entrySet();
        defaultedMap34.clear();
        java.lang.String str47 = defaultedMap34.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set51 = defaultedMap50.entrySet();
        boolean b53 = defaultedMap50.containsValue((java.lang.Object) (short) 10);
        defaultedMap50.clear();
        defaultedMap50.clear();
        java.util.Set set56 = defaultedMap50.keySet();
        boolean b57 = defaultedMap34.containsKey((java.lang.Object) set56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) fixedOrderComparator62);
        defaultedMap59.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set67 = defaultedMap66.entrySet();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) 100.0d);
        boolean b70 = defaultedMap59.containsKey((java.lang.Object) defaultedMap66);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b73 = defaultedMap66.containsValue((java.lang.Object) defaultedMap72);
        boolean b74 = defaultedMap34.equals((java.lang.Object) b73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 1.0f);
        boolean b79 = defaultedMap34.containsKey((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap14);
        java.lang.String str16 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1.0f);
        java.util.Set set25 = defaultedMap22.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap28);
        defaultedMap8.putAll((java.util.Map) defaultedMap28);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, fixedOrderComparator18, 0.0d, (short) -1, b22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj25 = defaultedMap11.get((java.lang.Object) obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) fixedOrderComparator31);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set36 = defaultedMap35.entrySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100.0d);
        boolean b39 = defaultedMap28.containsKey((java.lang.Object) defaultedMap35);
        java.lang.Object obj41 = defaultedMap28.remove((java.lang.Object) 'a');
        boolean b42 = fixedOrderComparator26.add((java.lang.Object) defaultedMap28);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator47.isLocked();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0f, fixedOrderComparator44, 0.0d, (short) -1, b48 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator51.isLocked();
        boolean b53 = fixedOrderComparator50.add((java.lang.Object) fixedOrderComparator51);
        boolean b54 = fixedOrderComparator50.isLocked();
        boolean b55 = defaultedMap28.equals((java.lang.Object) b54);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 1.0f);
        java.util.Set set65 = defaultedMap62.keySet();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) defaultedMap62);
        java.lang.Object obj68 = defaultedMap28.put((java.lang.Object) defaultedMap62, (java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f, fixedOrderComparator8, 0.0d, (short) -1, b12 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) fixedOrderComparator21);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap18.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object obj31 = defaultedMap18.remove((java.lang.Object) 'a');
        boolean b32 = fixedOrderComparator16.add((java.lang.Object) defaultedMap18);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f, fixedOrderComparator34, 0.0d, (short) -1, b38 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator41.isLocked();
        boolean b43 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator41);
        boolean b44 = fixedOrderComparator40.isLocked();
        boolean b45 = defaultedMap18.equals((java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        boolean b57 = fixedOrderComparator56.isLocked();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0f, fixedOrderComparator53, 0.0d, (short) -1, b57 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b61 = defaultedMap51.equals((java.lang.Object) obj_array58);
        java.lang.Object obj62 = defaultedMap47.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object obj64 = defaultedMap18.get((java.lang.Object) obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array58);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1 + "'", obj64.equals(1));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) fixedOrderComparator8);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1.0f);
        boolean b17 = defaultedMap5.equals((java.lang.Object) map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0d);
        boolean b23 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap19.equals((java.lang.Object) defaultedMap25);
        java.util.Set set32 = defaultedMap19.entrySet();
        boolean b33 = defaultedMap5.containsKey((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 10.0f, fixedOrderComparator37, 0.0d, (short) -1, b41 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = defaultedMap35.equals((java.lang.Object) obj_array42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set48 = defaultedMap47.entrySet();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100.0d);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (-1.0d));
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 10.0f, fixedOrderComparator55, 0.0d, (short) -1, b59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj62 = defaultedMap19.put((java.lang.Object) defaultedMap35, (java.lang.Object) fixedOrderComparator61);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator4);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100.0d);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (-1.0d));
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0f, fixedOrderComparator21, 0.0d, (short) -1, b25 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap14.get((java.lang.Object) obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) fixedOrderComparator34);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set39 = defaultedMap38.entrySet();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100.0d);
        boolean b42 = defaultedMap31.containsKey((java.lang.Object) defaultedMap38);
        java.lang.Object obj44 = defaultedMap31.remove((java.lang.Object) 'a');
        boolean b45 = fixedOrderComparator29.add((java.lang.Object) defaultedMap31);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b51 = fixedOrderComparator50.isLocked();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10.0f, fixedOrderComparator47, 0.0d, (short) -1, b51 };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b55 = fixedOrderComparator54.isLocked();
        boolean b56 = fixedOrderComparator53.add((java.lang.Object) fixedOrderComparator54);
        boolean b57 = fixedOrderComparator53.isLocked();
        boolean b58 = defaultedMap31.equals((java.lang.Object) b57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.String str61 = defaultedMap60.toString();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b70 = fixedOrderComparator69.isLocked();
        java.lang.Object[] obj_array71 = new java.lang.Object[] { 10.0f, fixedOrderComparator66, 0.0d, (short) -1, b70 };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array71);
        boolean b74 = defaultedMap64.equals((java.lang.Object) obj_array71);
        java.lang.Object obj75 = defaultedMap60.put((java.lang.Object) 1.0f, (java.lang.Object) obj_array71);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array71);
        java.lang.Object obj77 = defaultedMap31.get((java.lang.Object) obj_array71);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) 1.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj84 = defaultedMap80.remove((java.lang.Object) fixedOrderComparator83);
        boolean b85 = defaultedMap80.isEmpty();
        java.util.Collection collection86 = defaultedMap80.values();
        java.lang.Object obj87 = defaultedMap31.get((java.lang.Object) defaultedMap80);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 1 + "'", obj77.equals(1));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 1 + "'", obj87.equals(1));
    }
}

