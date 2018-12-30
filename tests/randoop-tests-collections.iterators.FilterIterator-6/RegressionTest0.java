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
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        try {
            java.lang.Object obj6 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 10);
        boolean b18 = defaultedMap3.containsValue((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        try {
            filterIterator5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Set set5 = defaultedMap1.entrySet();
        int i6 = defaultedMap1.size();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        try {
            java.lang.Object obj5 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        collections.Predicate predicate7 = filterIterator2.getPredicate();
        try {
            boolean b8 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) iterator7);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 100 + "'", obj12.equals((byte) 100));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        defaultedMap1.clear();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        int i2 = defaultedMap1.size();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.util.Iterator iterator10 = filterIterator7.getIterator();
        collections.Predicate predicate11 = filterIterator7.getPredicate();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        filterIterator7.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate18 = filterIterator7.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator7);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(predicate18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate5);
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) "hi!");
        java.util.Set set10 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) defaultedMap19);
        collections.Predicate predicate22 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map15, predicate26, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map15, predicate37, predicate40);
        java.lang.Object obj42 = defaultedMap6.remove((java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap46.clear();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) defaultedMap46);
        collections.Predicate predicate49 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate49, predicate53);
        boolean b56 = defaultedMap6.containsValue((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap58.clear();
        java.lang.Object obj61 = defaultedMap58.get((java.lang.Object) "hi!");
        java.util.Set set62 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap71.clear();
        java.lang.Object obj73 = defaultedMap69.remove((java.lang.Object) defaultedMap71);
        collections.Predicate predicate74 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate74, predicate78);
        java.util.Iterator iterator81 = null;
        collections.Predicate predicate82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator81, predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        filterIterator83.setPredicate(predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate(map67, predicate78, predicate84);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap88, predicate89, predicate90);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate(map67, predicate89, predicate92);
        java.lang.Object obj94 = defaultedMap58.remove((java.lang.Object) predicate92);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate53, predicate92);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0d + "'", obj9.equals(100.0d));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100.0d + "'", obj61.equals(100.0d));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        collections.Predicate predicate11 = null;
        collections.Predicate predicate12 = null;
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str16 = defaultedMap15.toString();
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate20);
        boolean b22 = defaultedMap15.equals((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap31.clear();
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) defaultedMap31);
        collections.Predicate predicate34 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate38);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator43.setPredicate(predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map27, predicate38, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map27, predicate49, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate20, predicate52);
        java.lang.Object obj55 = defaultedMap3.get((java.lang.Object) map54);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100.0d + "'", obj55.equals(100.0d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap8.clear();
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap12.clear();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) defaultedMap12);
        java.util.Set set17 = defaultedMap3.keySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0d + "'", obj10.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0d + "'", obj15.equals(100.0d));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) iterator7);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Set set19 = defaultedMap15.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 100 + "'", obj12.equals((byte) 100));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator2);
        try {
            boolean b14 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        java.lang.String str7 = defaultedMap3.toString();
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap8.clear();
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap12.clear();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) "hi!");
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) defaultedMap12);
        java.util.Collection collection17 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0d + "'", obj10.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0d + "'", obj15.equals(100.0d));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap6.clear();
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap1.containsValue(obj8);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap28.clear();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate31 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map24, predicate35, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map24, predicate46, predicate49);
        java.lang.Object obj51 = defaultedMap15.remove((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) defaultedMap55);
        collections.Predicate predicate58 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate58, predicate62);
        boolean b65 = defaultedMap15.containsValue((java.lang.Object) predicate62);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate62);
        try {
            filterIterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0d + "'", obj18.equals(100.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap12.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) false);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) 10);
        boolean b23 = defaultedMap17.containsValue((java.lang.Object) ' ');
        java.lang.Object obj25 = defaultedMap17.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj28 = defaultedMap17.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b37 = defaultedMap32.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator38, predicate41);
        java.lang.Object obj43 = defaultedMap32.get((java.lang.Object) iterator38);
        java.lang.Object obj44 = defaultedMap17.put((java.lang.Object) defaultedMap30, obj43);
        defaultedMap10.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 100 + "'", obj43.equals((byte) 100));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 10);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map16, (java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) map18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap21.clear();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) defaultedMap34);
        collections.Predicate predicate37 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate41);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate(map30, predicate41, predicate47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate(map30, predicate52, predicate55);
        java.lang.Object obj57 = defaultedMap21.remove((java.lang.Object) predicate55);
        boolean b58 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0d + "'", obj24.equals(100.0d));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap10.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap16.clear();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) defaultedMap16);
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap12.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b17 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        defaultedMap1.clear();
        defaultedMap1.clear();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap1.isEmpty();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Set set5 = defaultedMap1.entrySet();
        int i6 = defaultedMap1.size();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        try {
            boolean b13 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        java.util.Set set7 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap28.clear();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate31 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map24, predicate35, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map24, predicate46, predicate49);
        java.lang.Object obj51 = defaultedMap15.remove((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) defaultedMap55);
        collections.Predicate predicate58 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate58, predicate62);
        boolean b65 = defaultedMap15.containsValue((java.lang.Object) predicate62);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate62);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap75.clear();
        java.lang.Object obj77 = defaultedMap73.remove((java.lang.Object) defaultedMap75);
        collections.Predicate predicate78 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate78, predicate82);
        java.util.Iterator iterator85 = null;
        collections.Predicate predicate86 = null;
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        filterIterator87.setPredicate(predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map71, predicate82, predicate88);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap92, predicate93, predicate94);
        collections.Predicate predicate96 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map97 = collections.map.PredicatedMap.decorate(map71, predicate93, predicate96);
        filterIterator11.setPredicate(predicate93);
        collections.iterators.FilterIterator filterIterator99 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0d + "'", obj18.equals(100.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.lang.Object obj34 = defaultedMap23.get((java.lang.Object) iterator29);
        java.lang.Object obj35 = defaultedMap8.put((java.lang.Object) defaultedMap21, obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap43.entrySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) set44);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) map45);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap23.clear();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) "hi!");
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) defaultedMap23);
        java.util.Collection collection28 = defaultedMap23.values();
        boolean b29 = defaultedMap1.equals((java.lang.Object) defaultedMap23);
        boolean b31 = defaultedMap23.containsKey((java.lang.Object) 0.0d);
        java.util.Set set32 = defaultedMap23.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0d + "'", obj21.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0d + "'", obj26.equals(100.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap12.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap8.clear();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        collections.Predicate predicate11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate15);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map4, predicate15, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) map4);
        java.lang.String str25 = defaultedMap24.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap4.clear();
        java.lang.Object obj7 = defaultedMap4.get((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap4.keySet();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100.0d + "'", obj7.equals(100.0d));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.lang.Object obj34 = defaultedMap23.get((java.lang.Object) iterator29);
        java.lang.Object obj35 = defaultedMap8.put((java.lang.Object) defaultedMap21, obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        int i37 = defaultedMap21.size();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) defaultedMap14);
        collections.Predicate predicate17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate21);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        filterIterator26.setPredicate(predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map10, predicate21, predicate27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate27);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        java.util.Iterator iterator36 = filterIterator33.getIterator();
        collections.Predicate predicate37 = filterIterator33.getPredicate();
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator38, predicate41);
        filterIterator33.setIterator((java.util.Iterator) filterIterator42);
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap46.clear();
        java.lang.Object obj49 = defaultedMap46.get((java.lang.Object) "hi!");
        java.util.Set set50 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap59.clear();
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) defaultedMap59);
        collections.Predicate predicate62 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate62, predicate66);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        filterIterator71.setPredicate(predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate(map55, predicate66, predicate72);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map55, predicate77, predicate80);
        java.lang.Object obj82 = defaultedMap46.remove((java.lang.Object) predicate80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap86.clear();
        java.lang.Object obj88 = defaultedMap84.remove((java.lang.Object) defaultedMap86);
        collections.Predicate predicate89 = null;
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate92, predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate89, predicate93);
        boolean b96 = defaultedMap46.containsValue((java.lang.Object) predicate93);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate93);
        filterIterator5.setPredicate(predicate93);
        collections.iterators.FilterIterator filterIterator99 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(predicate37);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0d + "'", obj49.equals(100.0d));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.util.Iterator iterator12 = filterIterator9.getIterator();
        collections.Predicate predicate13 = filterIterator9.getPredicate();
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator14, predicate17);
        filterIterator9.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = filterIterator9.getPredicate();
        java.util.Iterator iterator21 = filterIterator9.getIterator();
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        filterIterator25.setIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap47.clear();
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) defaultedMap47);
        collections.Predicate predicate50 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate50, predicate54);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        filterIterator59.setPredicate(predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map43, predicate54, predicate60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate60);
        filterIterator31.setPredicate(predicate60);
        java.lang.Object obj65 = defaultedMap3.put((java.lang.Object) iterator21, (java.lang.Object) filterIterator31);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) 100 + "'", obj14.equals((byte) 100));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        boolean b7 = defaultedMap3.isEmpty();
        boolean b9 = defaultedMap3.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b12 = defaultedMap3.equals((java.lang.Object) 100);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap8.clear();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        collections.Predicate predicate11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate15);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map4, predicate15, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) map4);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        filterIterator28.setIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap50.clear();
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) defaultedMap50);
        collections.Predicate predicate53 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate53, predicate57);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map46, predicate57, predicate63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate63);
        filterIterator34.setPredicate(predicate63);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap71.clear();
        java.lang.Object obj73 = defaultedMap69.remove((java.lang.Object) defaultedMap71);
        collections.Predicate predicate74 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate74, predicate78);
        java.lang.Object obj81 = defaultedMap24.put((java.lang.Object) predicate63, (java.lang.Object) map80);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) map80);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap8.clear();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        collections.Predicate predicate11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate15);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map4, predicate15, predicate21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map4, predicate26, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap32.get((java.lang.Object) "hi!");
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 10);
        java.util.Map map49 = collections.map.DefaultedMap.decorate(map47, (java.lang.Object) (byte) 1);
        boolean b50 = defaultedMap32.containsKey((java.lang.Object) map49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap61.clear();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) defaultedMap61);
        collections.Predicate predicate64 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate64, predicate68);
        java.util.Iterator iterator71 = null;
        collections.Predicate predicate72 = null;
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        filterIterator73.setPredicate(predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map57, predicate68, predicate74);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate(map57, predicate79, predicate82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        filterIterator86.setPredicate(predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        collections.Predicate predicate90 = filterIterator86.getPredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate82, predicate90);
        java.lang.Object obj92 = defaultedMap32.remove((java.lang.Object) defaultedMap52);
        java.util.Map map93 = collections.map.DefaultedMap.decorate(map30, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100.0d + "'", obj35.equals(100.0d));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        java.util.Iterator iterator4 = filterIterator2.getIterator();
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.util.Iterator iterator10 = filterIterator7.getIterator();
        collections.Predicate predicate11 = filterIterator7.getPredicate();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        filterIterator7.setIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap33.clear();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) defaultedMap33);
        collections.Predicate predicate36 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate40);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        filterIterator45.setPredicate(predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate(map29, predicate40, predicate46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map29, predicate51, predicate54);
        java.lang.Object obj56 = defaultedMap20.remove((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap60.clear();
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) defaultedMap60);
        collections.Predicate predicate63 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate63, predicate67);
        boolean b70 = defaultedMap20.containsValue((java.lang.Object) predicate67);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate67);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate67);
        java.util.Iterator iterator73 = filterIterator72.getIterator();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) filterIterator72);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(iterator73);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap22.clear();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) defaultedMap22);
        collections.Predicate predicate25 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator34.setPredicate(predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate(map18, predicate29, predicate35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map18, predicate40, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate40);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate52 = filterIterator48.getPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate52);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) iterator7);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.lang.Object obj34 = defaultedMap23.get((java.lang.Object) iterator29);
        java.lang.Object obj35 = defaultedMap8.put((java.lang.Object) defaultedMap21, obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap43.entrySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) set44);
        boolean b46 = defaultedMap1.equals((java.lang.Object) defaultedMap38);
        boolean b48 = defaultedMap38.equals((java.lang.Object) false);
        java.lang.String str49 = defaultedMap38.toString();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{100=10}" + "'", str49.equals("{100=10}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        filterIterator3.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) defaultedMap19);
        collections.Predicate predicate22 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map15, predicate26, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map15, predicate37, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate40);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        int i12 = defaultedMap11.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 100 + "'", obj13.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Iterator iterator0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap2.clear();
        java.lang.Object obj5 = defaultedMap2.get((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap15.clear();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        collections.Predicate predicate18 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map11, predicate22, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate(map11, predicate33, predicate36);
        java.lang.Object obj38 = defaultedMap2.remove((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap42.clear();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) defaultedMap42);
        collections.Predicate predicate45 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate49);
        boolean b52 = defaultedMap2.containsValue((java.lang.Object) predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator0, predicate49);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) b6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set7 = defaultedMap6.entrySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap12.clear();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap24.clear();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) defaultedMap24);
        collections.Predicate predicate27 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate31);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator36.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map20, predicate31, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) map20);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) defaultedMap40);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        boolean b7 = defaultedMap3.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) ' ');
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        filterIterator11.setIterator((java.util.Iterator) filterIterator17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap21.clear();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) "hi!");
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap34.clear();
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) defaultedMap34);
        collections.Predicate predicate37 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate41);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate(map30, predicate41, predicate47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate(map30, predicate52, predicate55);
        java.lang.Object obj57 = defaultedMap21.remove((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap68.clear();
        java.lang.Object obj70 = defaultedMap66.remove((java.lang.Object) defaultedMap68);
        collections.Predicate predicate71 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate71, predicate75);
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        filterIterator80.setPredicate(predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate(map64, predicate75, predicate81);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map64, predicate86, predicate89);
        java.util.Iterator iterator91 = null;
        collections.Predicate predicate92 = null;
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator(iterator91, predicate92);
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        filterIterator93.setPredicate(predicate94);
        collections.iterators.FilterIterator filterIterator96 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator93);
        collections.Predicate predicate97 = filterIterator93.getPredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate89, predicate97);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate55, predicate89);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0d + "'", obj24.equals(100.0d));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator2);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Collection collection15 = defaultedMap13.values();
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        boolean b15 = defaultedMap8.equals((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap24.clear();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) defaultedMap24);
        collections.Predicate predicate27 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate31);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator36.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map20, predicate31, predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map20, predicate42, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate45);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        java.util.Iterator iterator53 = filterIterator50.getIterator();
        collections.Predicate predicate54 = filterIterator50.getPredicate();
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator55, predicate58);
        filterIterator50.setIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate61 = filterIterator50.getPredicate();
        java.util.Iterator iterator62 = filterIterator50.getIterator();
        boolean b63 = defaultedMap1.containsKey((java.lang.Object) iterator62);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNull(predicate54);
        org.junit.Assert.assertNull(predicate61);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        java.util.Iterator iterator4 = filterIterator2.getIterator();
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.util.Iterator iterator10 = filterIterator7.getIterator();
        collections.Predicate predicate11 = filterIterator7.getPredicate();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        filterIterator7.setIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap33.clear();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) defaultedMap33);
        collections.Predicate predicate36 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate40);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        filterIterator45.setPredicate(predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate(map29, predicate40, predicate46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map29, predicate51, predicate54);
        java.lang.Object obj56 = defaultedMap20.remove((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap60.clear();
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) defaultedMap60);
        collections.Predicate predicate63 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate63, predicate67);
        boolean b70 = defaultedMap20.containsValue((java.lang.Object) predicate67);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate67);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate67);
        java.util.Iterator iterator73 = filterIterator72.getIterator();
        collections.Predicate predicate74 = filterIterator72.getPredicate();
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(predicate74);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap3.isEmpty();
        defaultedMap3.clear();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 10);
        java.util.Map map19 = collections.map.DefaultedMap.decorate(map17, (java.lang.Object) (byte) 1);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) map17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.String str5 = defaultedMap4.toString();
        boolean b6 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap10.clear();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) defaultedMap10);
        collections.Predicate predicate13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate17);
        java.lang.Object obj20 = defaultedMap3.remove((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) "hi!");
        java.util.Set set26 = defaultedMap22.keySet();
        java.lang.Object obj27 = defaultedMap3.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0d + "'", obj25.equals(100.0d));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100.0d + "'", obj27.equals(100.0d));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap23.clear();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) "hi!");
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.util.Set set29 = defaultedMap14.entrySet();
        java.lang.String str30 = defaultedMap14.toString();
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) filterIterator33);
        java.util.Collection collection37 = defaultedMap14.values();
        java.util.Collection collection38 = defaultedMap14.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0d + "'", obj21.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0d + "'", obj26.equals(100.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0d + "'", obj36.equals(100.0d));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate6);
        try {
            boolean b8 = filterIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) "hi!");
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (short) 10);
        java.util.Map map18 = collections.map.DefaultedMap.decorate(map16, (java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) map18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap30.clear();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) defaultedMap30);
        collections.Predicate predicate33 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate33, predicate37);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate(map26, predicate37, predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map26, predicate48, predicate51);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        filterIterator55.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        collections.Predicate predicate59 = filterIterator55.getPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate51, predicate59);
        java.lang.Object obj61 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        java.lang.String str62 = defaultedMap21.toString();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) false);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        filterIterator9.setIterator((java.util.Iterator) filterIterator15);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator15);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 100 + "'", obj17.equals((byte) 100));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.lang.Object obj34 = defaultedMap23.get((java.lang.Object) iterator29);
        java.lang.Object obj35 = defaultedMap8.put((java.lang.Object) defaultedMap21, obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap43.entrySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) set44);
        boolean b46 = defaultedMap1.equals((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Set set52 = defaultedMap48.entrySet();
        java.lang.Object obj53 = defaultedMap1.get((java.lang.Object) set52);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100.0d + "'", obj53.equals(100.0d));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.lang.Object obj34 = defaultedMap23.get((java.lang.Object) iterator29);
        java.lang.Object obj35 = defaultedMap8.put((java.lang.Object) defaultedMap21, obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj46 = defaultedMap43.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap51.clear();
        java.lang.Object obj53 = defaultedMap49.remove((java.lang.Object) defaultedMap51);
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap56.clear();
        java.lang.Object obj58 = defaultedMap51.get((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap60.clear();
        java.lang.Object obj63 = defaultedMap60.get((java.lang.Object) "hi!");
        java.lang.Object obj64 = defaultedMap51.remove((java.lang.Object) defaultedMap60);
        defaultedMap38.putAll((java.util.Map) defaultedMap51);
        java.util.Set set66 = defaultedMap51.entrySet();
        java.lang.Object obj67 = defaultedMap21.remove((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 100.0d + "'", obj58.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100.0d + "'", obj63.equals(100.0d));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) ' ');
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        boolean b28 = defaultedMap23.containsValue((java.lang.Object) 0);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.lang.Object obj34 = defaultedMap23.get((java.lang.Object) iterator29);
        java.lang.Object obj35 = defaultedMap8.put((java.lang.Object) defaultedMap21, obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap43.entrySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) set44);
        boolean b46 = defaultedMap1.equals((java.lang.Object) defaultedMap38);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap14.clear();
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap23.clear();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) "hi!");
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.util.Set set29 = defaultedMap14.entrySet();
        boolean b30 = defaultedMap14.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0d + "'", obj21.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0d + "'", obj26.equals(100.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator2);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap28.clear();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate31 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map24, predicate35, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map24, predicate46, predicate49);
        java.lang.Object obj51 = defaultedMap15.remove((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) defaultedMap55);
        collections.Predicate predicate58 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate58, predicate62);
        boolean b65 = defaultedMap15.containsValue((java.lang.Object) predicate62);
        filterIterator2.setPredicate(predicate62);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0d + "'", obj18.equals(100.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) "hi!");
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap28.clear();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) defaultedMap28);
        collections.Predicate predicate31 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map24, predicate35, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map24, predicate46, predicate49);
        java.lang.Object obj51 = defaultedMap15.remove((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap55.clear();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) defaultedMap55);
        collections.Predicate predicate58 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate58, predicate62);
        boolean b65 = defaultedMap15.containsValue((java.lang.Object) predicate62);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate62);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap75.clear();
        java.lang.Object obj77 = defaultedMap73.remove((java.lang.Object) defaultedMap75);
        collections.Predicate predicate78 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate78, predicate82);
        java.util.Iterator iterator85 = null;
        collections.Predicate predicate86 = null;
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        filterIterator87.setPredicate(predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map71, predicate82, predicate88);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap92, predicate93, predicate94);
        collections.Predicate predicate96 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map97 = collections.map.PredicatedMap.decorate(map71, predicate93, predicate96);
        filterIterator11.setPredicate(predicate93);
        java.util.Iterator iterator99 = filterIterator11.getIterator();
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0d + "'", obj18.equals(100.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNull(iterator99);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap3.clear();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        try {
            filterIterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator2);
        java.util.Collection collection14 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 100, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.util.Set set22 = defaultedMap21.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap27.clear();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) defaultedMap27);
        defaultedMap16.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap39.clear();
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) defaultedMap39);
        collections.Predicate predicate42 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate42, predicate46);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map35, predicate46, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) map35);
        java.lang.Object obj56 = defaultedMap16.remove((java.lang.Object) defaultedMap55);
        boolean b57 = defaultedMap13.containsValue((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        defaultedMap16.putAll((java.util.Map) defaultedMap59);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
    }
}

