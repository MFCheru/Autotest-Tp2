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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        try {
            int i8 = fixedOrderComparator3.compare((java.lang.Object) (-1), (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = fixedOrderComparator6.isLocked();
        try {
            boolean b9 = fixedOrderComparator2.addAsEqual((java.lang.Object) b7, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) obj_array6);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) obj_array14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsValue((java.lang.Object) defaultedMap18);
        boolean b23 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) (byte) 10);
        try {
            boolean b28 = fixedOrderComparator3.addAsEqual((java.lang.Object) b23, (java.lang.Object) defaultedMap25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b13 = defaultedMap7.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        try {
            fixedOrderComparator3.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) obj_array6);
        int i9 = fixedOrderComparator3.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) obj_array11);
        try {
            boolean b15 = fixedOrderComparator3.addAsEqual((java.lang.Object) b13, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 1);
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.isEmpty();
        java.util.Collection collection13 = defaultedMap7.values();
        java.util.Set set14 = defaultedMap7.keySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator7.add((java.lang.Object) obj_array10);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b15 = fixedOrderComparator3.add((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        try {
            int i22 = fixedOrderComparator3.compare((java.lang.Object) defaultedMap17, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) (-1));
        java.lang.String str16 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "hi!" + "'", obj15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) obj_array6);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (short) 0);
        boolean b11 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap20.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        defaultedMap16.clear();
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        try {
            int i23 = fixedOrderComparator12.compare((java.lang.Object) 100.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap20.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        defaultedMap37.clear();
        boolean b43 = defaultedMap37.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate47, predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate47);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        defaultedMap57.clear();
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate67, predicate72);
        java.lang.Object obj76 = defaultedMap57.remove((java.lang.Object) (short) 0);
        java.util.Map map77 = collections.map.DefaultedMap.decorate(map55, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate80, predicate81);
        defaultedMap79.clear();
        boolean b85 = defaultedMap79.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate88, predicate89);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap92, predicate93, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate89, predicate94);
        collections.Predicate predicate97 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate(map55, predicate89, predicate97);
        java.util.Map map99 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate89);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        defaultedMap11.clear();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate21, predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate21);
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str6 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate23, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate10, predicate23);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        defaultedMap33.clear();
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate43, predicate48);
        java.lang.Object obj52 = defaultedMap33.remove((java.lang.Object) (short) 0);
        java.util.Map map53 = collections.map.DefaultedMap.decorate(map31, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        defaultedMap55.clear();
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate65, predicate70);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate(map31, predicate65, predicate73);
        java.lang.Object obj75 = defaultedMap1.get((java.lang.Object) predicate65);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0L + "'", obj75.equals(0L));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) obj_array2);
        org.junit.Assert.assertNotNull(obj_array2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.isEmpty();
        java.util.Collection collection13 = defaultedMap7.values();
        int i14 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap20.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        defaultedMap11.clear();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate21, predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate21);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) obj_array17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        boolean b25 = defaultedMap15.containsValue((java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap21.isEmpty();
        java.util.Set set27 = defaultedMap21.entrySet();
        boolean b28 = defaultedMap1.equals((java.lang.Object) set27);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        defaultedMap11.clear();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate21, predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate21);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        defaultedMap31.clear();
        boolean b37 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate41, predicate46);
        java.lang.Object obj50 = defaultedMap31.remove((java.lang.Object) (short) 0);
        java.util.Map map51 = collections.map.DefaultedMap.decorate(map29, (java.lang.Object) defaultedMap31);
        collections.Factory factory52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, factory52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str8 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) obj_array13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) defaultedMap17);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap11);
        try {
            boolean b24 = fixedOrderComparator2.addAsEqual((java.lang.Object) map22, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str25 = defaultedMap22.toString();
        boolean b26 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) obj_array30);
        boolean b33 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        defaultedMap35.clear();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap28.remove(obj41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) b26, obj42);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        defaultedMap19.clear();
        boolean b25 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate29, predicate34);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate29);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        defaultedMap39.clear();
        boolean b45 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate49, predicate54);
        java.lang.Object obj58 = defaultedMap39.remove((java.lang.Object) (short) 0);
        java.util.Map map59 = collections.map.DefaultedMap.decorate(map37, (java.lang.Object) defaultedMap39);
        java.lang.Object obj60 = defaultedMap1.get((java.lang.Object) defaultedMap39);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "hi!" + "'", obj60.equals("hi!"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) 0.0f);
        boolean b9 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) obj_array13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) defaultedMap17);
        boolean b22 = defaultedMap17.isEmpty();
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = fixedOrderComparator3.add((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = defaultedMap17.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.Object obj14 = defaultedMap7.get((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap7.remove((java.lang.Object) 100.0d);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "hi!" + "'", obj14.equals("hi!"));
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map18, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) 0.0f);
        boolean b9 = fixedOrderComparator3.isLocked();
        int i10 = fixedOrderComparator3.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        boolean b30 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str8 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = fixedOrderComparator3.add((java.lang.Object) set10);
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set27 = defaultedMap26.keySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        defaultedMap1.clear();
        int i31 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) fixedOrderComparator15);
        java.lang.String str17 = defaultedMap7.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        boolean b18 = defaultedMap13.isEmpty();
        java.util.Set set19 = defaultedMap13.entrySet();
        try {
            boolean b20 = fixedOrderComparator3.addAsEqual(obj5, (java.lang.Object) defaultedMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b7 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) (byte) 10);
        boolean b13 = fixedOrderComparator3.addAsEqual((java.lang.Object) 0, (java.lang.Object) (byte) 10);
        int i14 = fixedOrderComparator3.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str25 = defaultedMap22.toString();
        boolean b26 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) obj_array30);
        boolean b33 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        defaultedMap35.clear();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap28.remove(obj41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) b26, obj42);
        java.util.Set set44 = defaultedMap1.keySet();
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) predicate22);
        java.util.Set set25 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) obj_array22);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) 1);
        defaultedMap20.clear();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = defaultedMap20.equals((java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) b32);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!" + "'", obj19.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b13 = defaultedMap3.containsValue((java.lang.Object) defaultedMap9);
        java.lang.String str14 = defaultedMap3.toString();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) str14);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) 0.0f);
        boolean b9 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) obj_array13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) defaultedMap17);
        boolean b22 = defaultedMap17.isEmpty();
        java.util.Set set23 = defaultedMap17.entrySet();
        boolean b24 = fixedOrderComparator3.add((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        defaultedMap26.clear();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate36, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        defaultedMap45.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) obj_array55);
        java.lang.Object obj58 = defaultedMap26.put((java.lang.Object) (-1.0f), (java.lang.Object) map57);
        try {
            int i60 = fixedOrderComparator3.compare((java.lang.Object) (-1.0f), (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) fixedOrderComparator15);
        boolean b17 = fixedOrderComparator15.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) obj_array26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap24.containsValue((java.lang.Object) defaultedMap30);
        boolean b35 = defaultedMap30.isEmpty();
        java.lang.Object obj36 = defaultedMap19.remove((java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set43 = defaultedMap42.keySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        defaultedMap19.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str50 = defaultedMap47.toString();
        boolean b51 = defaultedMap47.isEmpty();
        java.lang.Object obj52 = defaultedMap19.remove((java.lang.Object) defaultedMap47);
        java.util.Collection collection53 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        defaultedMap55.clear();
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate65, predicate70);
        try {
            boolean b73 = fixedOrderComparator15.addAsEqual((java.lang.Object) collection53, (java.lang.Object) defaultedMap55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set6 = defaultedMap5.entrySet();
        java.lang.String str7 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (-1));
        int i10 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str15 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) obj_array20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b28 = defaultedMap18.containsValue((java.lang.Object) defaultedMap24);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        boolean b35 = defaultedMap12.containsValue((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str40 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        defaultedMap47.clear();
        boolean b53 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate57, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate57);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate33, predicate44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator7.add((java.lang.Object) obj_array10);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b15 = fixedOrderComparator3.add((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (-1.0f));
        try {
            int i21 = fixedOrderComparator3.compare((java.lang.Object) 1L, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        defaultedMap27.clear();
        boolean b33 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate37, predicate42);
        java.lang.Object obj46 = defaultedMap27.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set53 = defaultedMap52.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj55 = defaultedMap27.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj56 = defaultedMap1.remove(obj55);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!" + "'", obj19.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b7 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) (byte) 10);
        boolean b13 = fixedOrderComparator3.addAsEqual((java.lang.Object) 0, (java.lang.Object) (byte) 10);
        boolean b14 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str25 = defaultedMap22.toString();
        boolean b26 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) obj_array30);
        boolean b33 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        defaultedMap35.clear();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap28.remove(obj41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) b26, obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        defaultedMap55.clear();
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate65, predicate70);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate52, predicate65);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate52, predicate74);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) obj_array6);
        fixedOrderComparator3.setUnknownObjectBehavior((int) (short) 0);
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str32 = defaultedMap29.toString();
        boolean b33 = defaultedMap29.isEmpty();
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap29);
        java.lang.String str35 = defaultedMap29.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate15, predicate20);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator26.isLocked();
        int i28 = fixedOrderComparator26.getUnknownObjectBehavior();
        boolean b29 = fixedOrderComparator26.isLocked();
        boolean b31 = fixedOrderComparator26.add((java.lang.Object) 0.0f);
        boolean b32 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) obj_array36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        boolean b44 = defaultedMap34.containsValue((java.lang.Object) defaultedMap40);
        boolean b45 = defaultedMap40.isEmpty();
        java.util.Set set46 = defaultedMap40.entrySet();
        boolean b47 = fixedOrderComparator26.add((java.lang.Object) defaultedMap40);
        try {
            boolean b48 = fixedOrderComparator3.addAsEqual((java.lang.Object) map22, (java.lang.Object) fixedOrderComparator26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) obj_array7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap5.containsValue((java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap5.toString();
        int i17 = defaultedMap5.size();
        try {
            int i19 = fixedOrderComparator2.compare((java.lang.Object) defaultedMap5, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) obj_array9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) (-1));
        boolean b17 = defaultedMap8.containsValue((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "hi!" + "'", obj15.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.isEmpty();
        java.util.Collection collection13 = defaultedMap7.values();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        defaultedMap26.clear();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate36, predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate36);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate36);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str32 = defaultedMap29.toString();
        boolean b33 = defaultedMap29.isEmpty();
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap29);
        java.util.Collection collection35 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) collection35);
        java.util.Set set37 = defaultedMap36.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator22.add((java.lang.Object) obj_array25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) obj_array31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap29.containsValue((java.lang.Object) defaultedMap35);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) obj_array25, (java.lang.Object) defaultedMap35);
        int i41 = defaultedMap35.size();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        int i47 = fixedOrderComparator45.getUnknownObjectBehavior();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) fixedOrderComparator45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set55 = defaultedMap54.keySet();
        defaultedMap50.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str61 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap58);
        boolean b63 = defaultedMap50.containsKey((java.lang.Object) defaultedMap58);
        try {
            int i65 = fixedOrderComparator45.compare((java.lang.Object) defaultedMap50, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "hi!" + "'", obj48.equals("hi!"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = fixedOrderComparator2.add((java.lang.Object) predicate6);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        defaultedMap6.clear();
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate16, predicate21);
        java.lang.Object obj25 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap1.remove(obj25);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        int i15 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) obj_array31);
        boolean b34 = defaultedMap24.containsValue((java.lang.Object) map33);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap24.get(obj35);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "hi!" + "'", obj36.equals("hi!"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) obj_array29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        boolean b37 = defaultedMap27.containsValue((java.lang.Object) defaultedMap33);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.Object obj39 = defaultedMap22.remove((java.lang.Object) b38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set46 = defaultedMap45.keySet();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        defaultedMap22.putAll((java.util.Map) defaultedMap45);
        java.lang.String str49 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str54 = defaultedMap51.toString();
        boolean b55 = defaultedMap51.isEmpty();
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        boolean b57 = defaultedMap1.containsKey((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b31 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        boolean b32 = defaultedMap27.isEmpty();
        java.lang.Object obj33 = defaultedMap16.remove((java.lang.Object) b32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set40 = defaultedMap39.keySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap39);
        defaultedMap16.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str47 = defaultedMap44.toString();
        boolean b48 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap16.remove((java.lang.Object) defaultedMap44);
        java.util.Set set50 = defaultedMap16.entrySet();
        try {
            int i51 = fixedOrderComparator3.compare((java.lang.Object) fixedOrderComparator14, (java.lang.Object) set50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.isEmpty();
        java.util.Set set13 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set26 = defaultedMap25.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj28 = defaultedMap15.get((java.lang.Object) defaultedMap25);
        boolean b29 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) obj_array33);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str42 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        defaultedMap49.clear();
        boolean b55 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate59, predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate46, predicate59);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        defaultedMap69.clear();
        boolean b75 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate78, predicate79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate79, predicate84);
        java.lang.Object obj88 = defaultedMap69.remove((java.lang.Object) (short) 0);
        java.util.Map map89 = collections.map.DefaultedMap.decorate(map67, (java.lang.Object) defaultedMap69);
        java.lang.Object obj90 = defaultedMap31.get((java.lang.Object) defaultedMap69);
        defaultedMap7.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection92 = defaultedMap7.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + "hi!" + "'", obj90.equals("hi!"));
        org.junit.Assert.assertNotNull(collection92);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        defaultedMap11.clear();
        boolean b17 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate21, predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate21);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str34 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) obj_array39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap37);
        java.util.Set set49 = defaultedMap31.entrySet();
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) set49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "hi!" + "'", obj50.equals("hi!"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap20.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) obj_array30);
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) map32);
        java.util.Set set34 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set14 = defaultedMap13.keySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) defaultedMap13);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        java.lang.Object obj22 = defaultedMap3.get((java.lang.Object) i21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        defaultedMap25.clear();
        boolean b31 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate35, predicate40);
        java.lang.Object obj44 = defaultedMap25.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str49 = defaultedMap46.toString();
        boolean b50 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) obj_array54);
        boolean b57 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        defaultedMap59.clear();
        defaultedMap52.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap52.remove(obj65);
        java.lang.Object obj67 = defaultedMap25.put((java.lang.Object) b50, obj66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        defaultedMap70.clear();
        boolean b76 = defaultedMap70.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate80, predicate85);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate68, predicate80);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate68, predicate89);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        defaultedMap6.clear();
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate16, predicate21);
        java.lang.Object obj25 = defaultedMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap1.remove(obj25);
        boolean b27 = defaultedMap1.isEmpty();
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) 1L, (java.lang.Object) predicate23);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap12.isEmpty();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap24.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) obj_array31);
        boolean b34 = defaultedMap24.containsValue((java.lang.Object) map33);
        boolean b35 = defaultedMap24.isEmpty();
        java.util.Set set36 = defaultedMap24.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b27 = fixedOrderComparator22.add((java.lang.Object) obj_array25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) obj_array31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap29.containsValue((java.lang.Object) defaultedMap35);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) obj_array25, (java.lang.Object) defaultedMap35);
        int i41 = defaultedMap35.size();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        int i47 = fixedOrderComparator45.getUnknownObjectBehavior();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) fixedOrderComparator45);
        try {
            fixedOrderComparator45.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "hi!" + "'", obj48.equals("hi!"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object[] obj_array2 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b8 = fixedOrderComparator3.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) obj_array13);
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) 1);
        defaultedMap11.clear();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = defaultedMap11.equals((java.lang.Object) fixedOrderComparator22);
        try {
            boolean b24 = fixedOrderComparator3.addAsEqual((java.lang.Object) (byte) 0, (java.lang.Object) fixedOrderComparator22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap14.keySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj17 = defaultedMap4.get((java.lang.Object) defaultedMap14);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 0, '#' };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object obj23 = defaultedMap4.get((java.lang.Object) i22);
        boolean b24 = defaultedMap2.equals((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        defaultedMap26.clear();
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate36, predicate41);
        java.lang.Object obj45 = defaultedMap26.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) (byte) 10);
        java.lang.String str50 = defaultedMap47.toString();
        boolean b51 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) obj_array55);
        boolean b58 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        defaultedMap60.clear();
        defaultedMap53.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap53.remove(obj66);
        java.lang.Object obj68 = defaultedMap26.put((java.lang.Object) b51, obj67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        defaultedMap71.clear();
        boolean b77 = defaultedMap71.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate80, predicate81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate81, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate69, predicate81);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate69, predicate90);
        java.lang.Object[] obj_array92 = new java.lang.Object[] { (short) 100, predicate69 };
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator(obj_array92);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!" + "'", obj23.equals("hi!"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(obj_array92);
    }
}

