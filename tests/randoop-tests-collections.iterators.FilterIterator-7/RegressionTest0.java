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
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            boolean b2 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0L);
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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        try {
            java.lang.Object obj5 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        filterIterator1.setIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        filterIterator1.setPredicate(predicate8);
        try {
            boolean b10 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map map0 = null;
        java.util.Iterator iterator1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) iterator1);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) (short) 1);
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        try {
            java.lang.Object obj9 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicateUtils4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        int i8 = defaultedMap2.size();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1.0d));
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        java.util.Collection collection11 = defaultedMap6.values();
        boolean b12 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b11 = defaultedMap5.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        filterIterator1.setPredicate(predicate14);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i7 = defaultedMap6.size();
        java.lang.String str8 = defaultedMap6.toString();
        java.lang.Object obj9 = defaultedMap2.put(obj4, (java.lang.Object) str8);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        java.util.Set set8 = defaultedMap2.entrySet();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator8 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(iterator1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap2.get(obj9);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            java.lang.Object obj9 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.put((java.lang.Object) b17, obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) iterator24);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.get(obj29);
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap26.get(obj34);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        boolean b11 = defaultedMap2.containsValue((java.lang.Object) filterIterator9);
        java.util.Set set12 = defaultedMap2.entrySet();
        java.util.Set set13 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            filterIterator8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i8 = defaultedMap7.size();
        int i9 = defaultedMap7.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection11 = defaultedMap7.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b8 = defaultedMap2.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate9, predicate11);
        defaultedMap2.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i15 = defaultedMap14.size();
        java.lang.String str16 = defaultedMap14.toString();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        try {
            java.lang.Object obj14 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        int i11 = defaultedMap6.size();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        java.util.Iterator iterator17 = filterIterator14.getIterator();
        filterIterator12.setIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator12.setPredicate(predicate19);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate23);
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        java.lang.Object obj27 = defaultedMap2.remove((java.lang.Object) filterIterator25);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.containsValue(obj4);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.put((java.lang.Object) b17, obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) iterator24);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.get(obj29);
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) iterator34);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) iterator37);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap36.equals((java.lang.Object) collection40);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        boolean b45 = defaultedMap36.containsValue((java.lang.Object) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        java.util.Iterator iterator52 = filterIterator49.getIterator();
        filterIterator47.setIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate54);
        java.lang.Object obj56 = defaultedMap36.get((java.lang.Object) predicate54);
        defaultedMap26.putAll((java.util.Map) defaultedMap36);
        collections.Transformer transformer58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, transformer58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b8 = defaultedMap2.isEmpty();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 1, obj5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate15 = filterIterator1.getPredicate();
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) iterator16);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b24 = defaultedMap18.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate27);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate(map29, (java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i40 = defaultedMap39.size();
        int i41 = defaultedMap39.size();
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) predicateUtils42);
        boolean b45 = defaultedMap39.equals((java.lang.Object) false);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) iterator46);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b54 = defaultedMap48.isEmpty();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate55, predicate57);
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) iterator60);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 100.0f);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b68 = defaultedMap62.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate69, predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate57, predicate71);
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map29, predicate36, predicate71);
        filterIterator1.setPredicate(predicate36);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            boolean b19 = filterIterator18.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap2.containsValue((java.lang.Object) (byte) 1);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) filterIterator5);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i20 = defaultedMap19.size();
        int i21 = defaultedMap19.size();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) predicateUtils22);
        boolean b25 = defaultedMap19.equals((java.lang.Object) false);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) iterator26);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 100.0f);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b34 = defaultedMap28.isEmpty();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate37);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) iterator40);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100.0f);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b48 = defaultedMap42.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate51);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate37, predicate51);
        filterIterator4.setPredicate(predicate51);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
        try {
            java.lang.Object obj19 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        try {
            java.lang.Object obj8 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object obj11 = defaultedMap2.put((java.lang.Object) (-1), (java.lang.Object) (short) 0);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap14.remove(obj18);
        java.util.Set set20 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap2.equals((java.lang.Object) set20);
        defaultedMap2.clear();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.remove((java.lang.Object) ' ');
        int i7 = defaultedMap2.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b10 = defaultedMap9.isEmpty();
        java.util.Collection collection11 = defaultedMap9.values();
        boolean b12 = defaultedMap2.equals((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicateUtils4);
        boolean b7 = defaultedMap1.equals((java.lang.Object) false);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap10.equals((java.lang.Object) collection14);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) collection14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) iterator17);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap19.equals((java.lang.Object) collection23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) filterIterator26);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) filterIterator26);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 1, obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        java.util.Collection collection11 = defaultedMap6.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) iterator23);
        java.util.Collection collection26 = defaultedMap25.values();
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) defaultedMap25);
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap14.put((java.lang.Object) b29, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) iterator36);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap33.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.get(obj41);
        boolean b44 = defaultedMap38.containsValue((java.lang.Object) 1);
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) defaultedMap38);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) iterator46);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) iterator49);
        java.util.Collection collection52 = defaultedMap51.values();
        boolean b53 = defaultedMap48.equals((java.lang.Object) collection52);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        boolean b57 = defaultedMap48.containsValue((java.lang.Object) filterIterator55);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        java.util.Iterator iterator63 = filterIterator61.getIterator();
        java.util.Iterator iterator64 = filterIterator61.getIterator();
        filterIterator59.setIterator(iterator64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate66);
        java.lang.Object obj68 = defaultedMap48.get((java.lang.Object) predicate66);
        defaultedMap38.putAll((java.util.Map) defaultedMap48);
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) iterator70);
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) iterator73);
        java.util.Collection collection76 = defaultedMap75.values();
        boolean b77 = defaultedMap72.equals((java.lang.Object) collection76);
        java.util.Iterator iterator78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator78);
        java.util.Iterator iterator80 = filterIterator79.getIterator();
        boolean b81 = defaultedMap72.containsValue((java.lang.Object) filterIterator79);
        int i82 = defaultedMap72.size();
        java.util.Iterator iterator83 = null;
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator83);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) iterator83);
        java.util.Iterator iterator86 = null;
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator86);
        java.util.Iterator iterator88 = filterIterator87.getIterator();
        java.util.Iterator iterator89 = filterIterator87.getIterator();
        java.lang.Object obj90 = defaultedMap85.remove((java.lang.Object) filterIterator87);
        boolean b91 = defaultedMap72.equals((java.lang.Object) filterIterator87);
        boolean b92 = defaultedMap48.containsValue((java.lang.Object) defaultedMap72);
        boolean b93 = defaultedMap6.containsValue((java.lang.Object) b92);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(iterator64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(iterator80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNull(iterator88);
        org.junit.Assert.assertNull(iterator89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) iterator6);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b14 = defaultedMap8.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate15, predicate17);
        boolean b20 = defaultedMap2.containsValue((java.lang.Object) predicate17);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) collection10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        boolean b15 = defaultedMap6.containsValue((java.lang.Object) filterIterator13);
        java.lang.Object obj16 = defaultedMap2.get((java.lang.Object) defaultedMap6);
        java.util.Set set17 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.String str21 = defaultedMap19.toString();
        defaultedMap2.putAll((java.util.Map) defaultedMap19);
        defaultedMap19.clear();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        int i6 = defaultedMap1.size();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) iterator18);
        java.util.Collection collection21 = defaultedMap20.values();
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap9.put((java.lang.Object) b24, obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) iterator31);
        java.util.Collection collection34 = defaultedMap33.values();
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap33);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap33.get(obj36);
        boolean b39 = defaultedMap33.containsValue((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) defaultedMap33);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) iterator41);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) iterator44);
        java.util.Collection collection47 = defaultedMap46.values();
        boolean b48 = defaultedMap43.equals((java.lang.Object) collection47);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        boolean b52 = defaultedMap43.containsValue((java.lang.Object) filterIterator50);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        java.util.Iterator iterator58 = filterIterator56.getIterator();
        java.util.Iterator iterator59 = filterIterator56.getIterator();
        filterIterator54.setIterator(iterator59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        filterIterator54.setPredicate(predicate61);
        java.lang.Object obj63 = defaultedMap43.get((java.lang.Object) predicate61);
        defaultedMap33.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj65 = defaultedMap1.remove((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1 + "'", obj5.equals(1));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicateUtils4);
        boolean b7 = defaultedMap1.equals((java.lang.Object) false);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) iterator5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Collection collection11 = defaultedMap10.values();
        boolean b12 = defaultedMap7.equals((java.lang.Object) collection11);
        java.util.Set set13 = defaultedMap7.entrySet();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.util.Collection collection17 = defaultedMap16.values();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) predicate18);
        defaultedMap16.clear();
        java.lang.Object obj21 = defaultedMap7.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i24 = defaultedMap23.size();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap23);
        java.lang.String str26 = defaultedMap23.toString();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        defaultedMap1.clear();
        java.util.Set set29 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        boolean b11 = defaultedMap2.containsValue((java.lang.Object) filterIterator9);
        int i12 = defaultedMap2.size();
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) iterator13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) filterIterator17);
        boolean b21 = defaultedMap2.equals((java.lang.Object) filterIterator17);
        try {
            java.lang.Object obj22 = filterIterator17.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap10.equals((java.lang.Object) collection14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) filterIterator17);
        defaultedMap2.putAll((java.util.Map) defaultedMap10);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap23.remove(obj27);
        java.util.Set set29 = defaultedMap23.entrySet();
        java.util.Collection collection30 = defaultedMap23.values();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) iterator31);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap10.put((java.lang.Object) defaultedMap23, (java.lang.Object) (short) 1);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) iterator39);
        java.util.Collection collection42 = defaultedMap41.values();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) predicate43);
        java.util.Collection collection45 = defaultedMap41.values();
        java.util.Set set46 = defaultedMap41.entrySet();
        boolean b47 = defaultedMap23.containsKey((java.lang.Object) defaultedMap41);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap11.equals((java.lang.Object) collection15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        boolean b20 = defaultedMap11.containsValue((java.lang.Object) filterIterator18);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap2.containsKey((java.lang.Object) defaultedMap11);
        int i24 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap11.remove(obj15);
        java.util.Set set17 = defaultedMap11.entrySet();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b29 = defaultedMap23.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate30, predicate32);
        filterIterator19.setPredicate(predicate32);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) iterator36);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 100.0f);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b44 = defaultedMap38.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate47);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate32, predicate45);
        filterIterator8.setPredicate(predicate32);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 0.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1));
        java.lang.String str25 = defaultedMap22.toString();
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) iterator29);
        java.util.Collection collection32 = defaultedMap31.values();
        boolean b33 = defaultedMap28.equals((java.lang.Object) collection32);
        java.util.Set set34 = defaultedMap28.entrySet();
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) iterator35);
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        boolean b40 = defaultedMap37.containsValue((java.lang.Object) predicate39);
        defaultedMap37.clear();
        java.lang.Object obj42 = defaultedMap28.remove((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i45 = defaultedMap44.size();
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) defaultedMap44);
        java.lang.String str47 = defaultedMap44.toString();
        java.lang.Object obj48 = defaultedMap22.get((java.lang.Object) defaultedMap44);
        boolean b49 = defaultedMap17.containsKey((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str13 = defaultedMap12.toString();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        java.util.Iterator iterator23 = filterIterator20.getIterator();
        filterIterator18.setIterator(iterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate25);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate29);
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.lang.Object obj33 = defaultedMap6.put((java.lang.Object) str13, (java.lang.Object) predicate32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.util.Collection collection12 = defaultedMap11.values();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) predicate13);
        defaultedMap11.clear();
        java.lang.Object obj16 = defaultedMap2.remove((java.lang.Object) defaultedMap11);
        boolean b17 = defaultedMap11.isEmpty();
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 10);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator9.setPredicate(predicate13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i20 = defaultedMap19.size();
        int i21 = defaultedMap19.size();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) predicateUtils22);
        boolean b25 = defaultedMap19.equals((java.lang.Object) false);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) iterator26);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 100.0f);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b34 = defaultedMap28.isEmpty();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate37);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) iterator40);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100.0f);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b48 = defaultedMap42.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate51);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate37, predicate51);
        filterIterator16.setPredicate(predicate37);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate37);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) map56);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        filterIterator1.setIterator(iterator6);
        try {
            java.lang.Object obj8 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Collection collection9 = defaultedMap2.values();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) iterator10);
        java.util.Collection collection13 = defaultedMap12.values();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.lang.Object obj18 = defaultedMap2.remove((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        filterIterator1.setIterator(iterator6);
        try {
            boolean b8 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap10.equals((java.lang.Object) collection14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) filterIterator17);
        defaultedMap2.putAll((java.util.Map) defaultedMap10);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.util.Collection collection24 = defaultedMap23.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) 0.0f);
        java.util.Set set29 = defaultedMap23.keySet();
        java.lang.Object obj32 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) (short) 0);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) iterator33);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap35.remove(obj39);
        java.util.Set set41 = defaultedMap35.entrySet();
        boolean b42 = defaultedMap23.equals((java.lang.Object) set41);
        boolean b43 = defaultedMap2.equals((java.lang.Object) set41);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str10 = defaultedMap9.toString();
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        java.lang.String str13 = defaultedMap9.toString();
        java.util.Set set14 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i17 = defaultedMap16.size();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) iterator18);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.util.Collection collection24 = defaultedMap23.values();
        boolean b25 = defaultedMap20.equals((java.lang.Object) collection24);
        defaultedMap20.clear();
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap20);
        boolean b28 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1 + "'", obj5.equals(1));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate15);
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        try {
            java.lang.Object obj19 = filterIterator17.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i11 = defaultedMap10.size();
        int i12 = defaultedMap10.size();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1));
        java.lang.String str18 = defaultedMap15.toString();
        collections.Predicate predicate19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj26 = defaultedMap15.put((java.lang.Object) 10L, (java.lang.Object) defaultedMap25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) iterator27);
        java.util.Collection collection30 = defaultedMap29.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap29.values();
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap29);
        java.util.Set set35 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        java.util.Iterator iterator13 = filterIterator10.getIterator();
        filterIterator8.setIterator(iterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate15);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate19);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        filterIterator1.setIterator((java.util.Iterator) filterIterator21);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
        try {
            boolean b19 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        java.util.Iterator iterator5 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.remove((java.lang.Object) ' ');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) iterator18);
        java.util.Collection collection21 = defaultedMap20.values();
        boolean b22 = defaultedMap17.equals((java.lang.Object) collection21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) filterIterator24);
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj28 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        int i29 = defaultedMap17.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) 1);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Collection collection15 = defaultedMap9.values();
        java.util.Set set16 = defaultedMap9.entrySet();
        boolean b17 = defaultedMap2.containsValue((java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1));
        java.lang.String str22 = defaultedMap19.toString();
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        java.lang.Object obj30 = defaultedMap19.put((java.lang.Object) 10L, (java.lang.Object) defaultedMap29);
        defaultedMap2.putAll((java.util.Map) defaultedMap29);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str7 = defaultedMap6.toString();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b16 = defaultedMap10.isEmpty();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate19);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate(map21, (java.lang.Object) predicate24);
        java.lang.Object obj27 = null;
        java.util.Map map28 = collections.map.DefaultedMap.decorate(map21, obj27);
        defaultedMap6.putAll(map28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        int i8 = defaultedMap2.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap2.equals((java.lang.Object) true);
        int i12 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator8 = filterIterator1.getIterator();
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        filterIterator2.setIterator((java.util.Iterator) filterIterator5);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) defaultedMap22);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap11.put((java.lang.Object) b26, obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) iterator33);
        java.util.Collection collection36 = defaultedMap35.values();
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) defaultedMap35);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap35.get(obj38);
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) 1);
        java.lang.Object obj42 = defaultedMap11.get((java.lang.Object) defaultedMap35);
        boolean b43 = defaultedMap1.containsKey(obj42);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) iterator44);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) (byte) 10);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) defaultedMap46, (java.lang.Object) predicate52);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator56);
        java.lang.Object obj58 = defaultedMap46.remove((java.lang.Object) defaultedMap57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        java.util.Set set13 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate15);
        try {
            java.lang.Object obj18 = filterIterator17.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.util.Collection collection6 = defaultedMap2.values();
        java.util.Collection collection7 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i10 = defaultedMap9.size();
        int i11 = defaultedMap9.size();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) predicateUtils12);
        boolean b15 = defaultedMap9.equals((java.lang.Object) false);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) iterator16);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b24 = defaultedMap18.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate27);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) iterator30);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap32.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b38 = defaultedMap32.isEmpty();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate27, predicate41);
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        java.util.Iterator iterator53 = filterIterator51.getIterator();
        java.util.Iterator iterator54 = filterIterator51.getIterator();
        filterIterator49.setIterator(iterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator49.setPredicate(predicate56);
        filterIterator46.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate60);
        collections.Predicate predicate63 = filterIterator62.getPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate27, predicate63);
        collections.Transformer transformer65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b20 = defaultedMap14.isEmpty();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate23);
        filterIterator10.setPredicate(predicate23);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) iterator27);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b35 = defaultedMap29.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate23, predicate36);
        int i42 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i8 = defaultedMap7.size();
        int i9 = defaultedMap7.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        boolean b12 = defaultedMap2.containsValue((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i14 = defaultedMap13.size();
        int i15 = defaultedMap13.size();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) predicateUtils16);
        boolean b19 = defaultedMap13.equals((java.lang.Object) false);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate31);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) iterator34);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 100.0f);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b42 = defaultedMap36.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate45);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate31, predicate45);
        filterIterator10.setPredicate(predicate31);
        java.lang.Object obj51 = defaultedMap1.put((java.lang.Object) filterIterator10, (java.lang.Object) '4');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            filterIterator8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i11 = defaultedMap10.size();
        int i12 = defaultedMap10.size();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) predicateUtils13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.util.Collection collection18 = defaultedMap17.values();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) predicate19);
        java.lang.Object obj21 = defaultedMap10.get((java.lang.Object) defaultedMap17);
        boolean b22 = defaultedMap10.isEmpty();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1 + "'", obj21.equals(1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        boolean b11 = defaultedMap2.containsValue((java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) iterator16);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) defaultedMap18);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.get(obj21);
        int i23 = defaultedMap18.size();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) i23);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        int i14 = defaultedMap9.size();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) collection20);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        int i13 = defaultedMap6.size();
        java.util.Set set14 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) iterator19);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.get(obj24);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) 1);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 0.0f);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) iterator30);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj36 = defaultedMap6.remove((java.lang.Object) defaultedMap21);
        java.lang.String str37 = defaultedMap6.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        java.util.Iterator iterator18 = filterIterator15.getIterator();
        filterIterator13.setIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate20);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate24);
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        java.util.Iterator iterator36 = filterIterator34.getIterator();
        java.util.Iterator iterator37 = filterIterator34.getIterator();
        filterIterator32.setIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate39);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate43);
        collections.Predicate predicate46 = filterIterator45.getPredicate();
        java.lang.Object obj47 = defaultedMap2.put((java.lang.Object) predicate27, (java.lang.Object) filterIterator45);
        boolean b49 = defaultedMap2.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) iterator54);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap51.containsValue((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i61 = defaultedMap60.size();
        int i62 = defaultedMap60.size();
        boolean b63 = defaultedMap51.containsValue((java.lang.Object) i62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) (-1));
        java.lang.String str68 = defaultedMap65.toString();
        collections.Predicate predicate69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate69, predicate70);
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) filterIterator74);
        java.lang.Object obj76 = defaultedMap65.put((java.lang.Object) 10L, (java.lang.Object) defaultedMap75);
        java.util.Iterator iterator77 = null;
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator77);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) iterator77);
        java.util.Collection collection80 = defaultedMap79.values();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        boolean b82 = defaultedMap79.containsValue((java.lang.Object) predicate81);
        java.util.Collection collection83 = defaultedMap79.values();
        java.lang.Object obj84 = defaultedMap51.put((java.lang.Object) defaultedMap75, (java.lang.Object) defaultedMap79);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap79);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object obj11 = defaultedMap2.put((java.lang.Object) (-1), (java.lang.Object) (short) 0);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap14.remove(obj18);
        java.util.Set set20 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap2.equals((java.lang.Object) set20);
        java.lang.String str22 = defaultedMap2.toString();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{-1=0}" + "'", str22.equals("{-1=0}"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) iterator10);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap12.remove(obj16);
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) iterator22);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 100.0f);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b30 = defaultedMap24.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate31, predicate33);
        filterIterator20.setPredicate(predicate33);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) iterator37);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b45 = defaultedMap39.isEmpty();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate46, predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate33, predicate46);
        filterIterator4.setPredicate(predicate46);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator12);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1 + "'", obj5.equals(1));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i11 = defaultedMap10.size();
        int i12 = defaultedMap10.size();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) i12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1));
        java.lang.String str18 = defaultedMap15.toString();
        collections.Predicate predicate19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj26 = defaultedMap15.put((java.lang.Object) 10L, (java.lang.Object) defaultedMap25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) iterator27);
        java.util.Collection collection30 = defaultedMap29.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        boolean b32 = defaultedMap29.containsValue((java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap29.values();
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap29);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) iterator35);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.lang.String str40 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i43 = defaultedMap42.size();
        int i44 = defaultedMap42.size();
        defaultedMap37.putAll((java.util.Map) defaultedMap42);
        defaultedMap37.clear();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        int i13 = defaultedMap6.size();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.util.Collection collection6 = defaultedMap2.values();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicateUtils4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) iterator6);
        java.util.Collection collection9 = defaultedMap8.values();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) predicate10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) iterator13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) filterIterator17);
        boolean b21 = defaultedMap1.containsKey(obj20);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        collections.Predicate predicate5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) defaultedMap11);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) iterator13);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Iterator iterator0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i3 = defaultedMap2.size();
        int i4 = defaultedMap2.size();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) predicateUtils5);
        boolean b8 = defaultedMap2.equals((java.lang.Object) false);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b17 = defaultedMap11.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate18, predicate20);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) iterator23);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b31 = defaultedMap25.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate34);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate20, predicate34);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator0, predicate20);
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i8 = defaultedMap7.size();
        int i9 = defaultedMap7.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        int i11 = defaultedMap7.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Map map0 = null;
        java.util.Iterator iterator1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) iterator1);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b9 = defaultedMap3.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate10, predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) iterator19);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        java.util.Iterator iterator33 = filterIterator30.getIterator();
        filterIterator28.setIterator(iterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate35);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate39);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        java.util.Iterator iterator51 = filterIterator48.getIterator();
        filterIterator46.setIterator(iterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate53);
        filterIterator43.setIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i62 = defaultedMap61.size();
        int i63 = defaultedMap61.size();
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) predicateUtils64);
        boolean b67 = defaultedMap61.equals((java.lang.Object) false);
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) iterator68);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) 100.0f);
        java.lang.Object obj75 = defaultedMap70.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b76 = defaultedMap70.isEmpty();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) iterator82);
        java.lang.Object obj86 = defaultedMap84.get((java.lang.Object) 100.0f);
        java.lang.Object obj89 = defaultedMap84.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b90 = defaultedMap84.isEmpty();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator();
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        filterIterator92.setPredicate(predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate91, predicate93);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate79, predicate93);
        filterIterator46.setPredicate(predicate93);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate39, predicate93);
        try {
            java.util.Map map99 = collections.map.PredicatedMap.decorate(map0, predicate10, predicate93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        int i13 = defaultedMap6.size();
        java.util.Set set14 = defaultedMap6.keySet();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b8 = defaultedMap2.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate9, predicate11);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.util.Collection collection12 = defaultedMap11.values();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) predicate13);
        defaultedMap11.clear();
        java.lang.Object obj16 = defaultedMap2.remove((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i19 = defaultedMap18.size();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap18);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) iterator24);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap23.equals((java.lang.Object) collection27);
        defaultedMap23.clear();
        java.lang.Object obj30 = defaultedMap11.remove((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i10 = defaultedMap9.size();
        java.lang.String str11 = defaultedMap9.toString();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 1, obj13);
        java.util.Collection collection15 = defaultedMap9.values();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        int i17 = defaultedMap2.size();
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        try {
            java.lang.Object obj3 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1));
        java.lang.String str8 = defaultedMap5.toString();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap2.get((java.lang.Object) map11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        try {
            boolean b20 = filterIterator19.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator19 = filterIterator13.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(iterator19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        try {
            boolean b3 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b20 = defaultedMap14.isEmpty();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate23);
        filterIterator10.setPredicate(predicate23);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) iterator27);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b35 = defaultedMap29.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate23, predicate36);
        java.util.Set set42 = defaultedMap2.entrySet();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        boolean b11 = defaultedMap2.containsValue((java.lang.Object) filterIterator9);
        boolean b13 = defaultedMap2.containsKey((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap10.equals((java.lang.Object) collection14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) filterIterator17);
        defaultedMap2.putAll((java.util.Map) defaultedMap10);
        defaultedMap2.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator1.getPredicate();
        collections.Predicate predicate9 = filterIterator1.getPredicate();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = filterIterator14.getPredicate();
        filterIterator1.setIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate31);
        filterIterator14.setPredicate(predicate29);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set8 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1));
        java.lang.String str8 = defaultedMap5.toString();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap2.get((java.lang.Object) map11);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) iterator13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) iterator16);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap15.equals((java.lang.Object) collection19);
        java.util.Set set21 = defaultedMap15.entrySet();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) iterator22);
        java.util.Collection collection25 = defaultedMap24.values();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) predicate26);
        defaultedMap24.clear();
        java.lang.Object obj29 = defaultedMap15.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap24.get((java.lang.Object) defaultedMap31);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        java.util.Iterator iterator42 = filterIterator40.getIterator();
        java.util.Iterator iterator43 = filterIterator40.getIterator();
        filterIterator38.setIterator(iterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate45);
        filterIterator35.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate49 = filterIterator35.getPredicate();
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) iterator50);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 100.0f);
        java.lang.Object obj57 = defaultedMap52.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b58 = defaultedMap52.isEmpty();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate59, predicate61);
        filterIterator35.setPredicate(predicate59);
        java.lang.Object obj65 = defaultedMap2.put((java.lang.Object) defaultedMap24, (java.lang.Object) predicate59);
        java.util.Set set66 = defaultedMap24.entrySet();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            java.lang.Object obj9 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Collection collection9 = defaultedMap2.values();
        java.lang.Object obj11 = defaultedMap2.get((java.lang.Object) "hi!");
        defaultedMap2.clear();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        boolean b13 = defaultedMap1.equals((java.lang.Object) predicate12);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            boolean b11 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = filterIterator13.getPredicate();
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        try {
            boolean b20 = filterIterator13.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.put((java.lang.Object) b17, obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) iterator24);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.get(obj29);
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) iterator34);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) iterator37);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap36.equals((java.lang.Object) collection40);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        boolean b45 = defaultedMap36.containsValue((java.lang.Object) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        java.util.Iterator iterator52 = filterIterator49.getIterator();
        filterIterator47.setIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate54);
        java.lang.Object obj56 = defaultedMap36.get((java.lang.Object) predicate54);
        defaultedMap26.putAll((java.util.Map) defaultedMap36);
        defaultedMap36.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        java.util.Set set6 = defaultedMap2.entrySet();
        int i7 = defaultedMap2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 0.0f);
        java.util.Set set15 = defaultedMap6.keySet();
        java.util.Set set16 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        filterIterator1.setIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        filterIterator1.setPredicate(predicate8);
        try {
            java.lang.Object obj10 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.put((java.lang.Object) b17, obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) iterator24);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.get(obj29);
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) iterator34);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) iterator37);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap36.equals((java.lang.Object) collection40);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        boolean b45 = defaultedMap36.containsValue((java.lang.Object) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        java.util.Iterator iterator52 = filterIterator49.getIterator();
        filterIterator47.setIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate54);
        java.lang.Object obj56 = defaultedMap36.get((java.lang.Object) predicate54);
        defaultedMap26.putAll((java.util.Map) defaultedMap36);
        collections.Transformer transformer58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, transformer58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap2.equals((java.lang.Object) collection6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.util.Collection collection12 = defaultedMap11.values();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) predicate13);
        defaultedMap11.clear();
        java.lang.Object obj16 = defaultedMap2.remove((java.lang.Object) defaultedMap11);
        java.lang.Object obj18 = defaultedMap2.remove((java.lang.Object) "");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        java.util.Set set11 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate15 = filterIterator1.getPredicate();
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) iterator16);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b24 = defaultedMap18.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate27);
        filterIterator1.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) filterIterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.util.Iterator iterator15 = filterIterator12.getIterator();
        filterIterator10.setIterator(iterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate17);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        filterIterator4.setIterator((java.util.Iterator) filterIterator10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.util.Collection collection5 = defaultedMap2.values();
        java.util.Set set6 = defaultedMap2.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate8);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) iterator6);
        java.util.Collection collection9 = defaultedMap8.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) collection9);
        defaultedMap5.clear();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.lang.Object obj20 = defaultedMap5.get((java.lang.Object) filterIterator17);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i8 = defaultedMap7.size();
        int i9 = defaultedMap7.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        defaultedMap2.clear();
        boolean b12 = defaultedMap2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1));
        java.lang.String str8 = defaultedMap5.toString();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap2.get((java.lang.Object) map11);
        boolean b13 = defaultedMap2.isEmpty();
        collections.Predicate predicate14 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i17 = defaultedMap16.size();
        int i18 = defaultedMap16.size();
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) predicateUtils19);
        boolean b22 = defaultedMap16.equals((java.lang.Object) false);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) iterator23);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b31 = defaultedMap25.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate34);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) iterator37);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b45 = defaultedMap39.isEmpty();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate46, predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate34, predicate48);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate14, predicate34);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 0.0f);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) iterator5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Collection collection11 = defaultedMap10.values();
        boolean b12 = defaultedMap7.equals((java.lang.Object) collection11);
        java.util.Set set13 = defaultedMap7.entrySet();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.util.Collection collection17 = defaultedMap16.values();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) predicate18);
        defaultedMap16.clear();
        java.lang.Object obj21 = defaultedMap7.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i24 = defaultedMap23.size();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap23);
        java.lang.String str26 = defaultedMap23.toString();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        defaultedMap1.clear();
        boolean b29 = defaultedMap1.isEmpty();
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator8 = filterIterator1.getIterator();
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator1.setPredicate(predicate10);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        int i14 = defaultedMap9.size();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) collection20);
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap1.equals(obj22);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        defaultedMap2.clear();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) ' ');
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) iterator22);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) iterator25);
        java.util.Collection collection28 = defaultedMap27.values();
        boolean b29 = defaultedMap24.equals((java.lang.Object) collection28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        boolean b33 = defaultedMap24.containsValue((java.lang.Object) filterIterator31);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj35 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        defaultedMap9.clear();
        java.lang.Object obj37 = defaultedMap2.remove((java.lang.Object) defaultedMap9);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) iterator38);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) ' ');
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) iterator45);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 100.0f);
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) iterator53);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) iterator56);
        java.util.Collection collection59 = defaultedMap58.values();
        boolean b60 = defaultedMap55.equals((java.lang.Object) collection59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        boolean b64 = defaultedMap55.containsValue((java.lang.Object) filterIterator62);
        defaultedMap47.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj66 = defaultedMap40.get((java.lang.Object) defaultedMap55);
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = defaultedMap40.get(obj67);
        java.lang.Object obj69 = defaultedMap2.remove((java.lang.Object) defaultedMap40);
        collections.Factory factory70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, factory70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) iterator5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Collection collection11 = defaultedMap10.values();
        boolean b12 = defaultedMap7.equals((java.lang.Object) collection11);
        java.util.Set set13 = defaultedMap7.entrySet();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.util.Collection collection17 = defaultedMap16.values();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) predicate18);
        defaultedMap16.clear();
        java.lang.Object obj21 = defaultedMap7.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i24 = defaultedMap23.size();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap23);
        java.lang.String str26 = defaultedMap23.toString();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        defaultedMap1.clear();
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) iterator29);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) iterator32);
        java.util.Collection collection35 = defaultedMap34.values();
        boolean b36 = defaultedMap31.equals((java.lang.Object) collection35);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        boolean b40 = defaultedMap31.containsValue((java.lang.Object) filterIterator38);
        int i41 = defaultedMap31.size();
        java.lang.String str42 = defaultedMap31.toString();
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) str42);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.remove((java.lang.Object) ' ');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) iterator18);
        java.util.Collection collection21 = defaultedMap20.values();
        boolean b22 = defaultedMap17.equals((java.lang.Object) collection21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) filterIterator24);
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj28 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) iterator29);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (short) 1);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) iterator36);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 100.0f);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Collection collection44 = defaultedMap38.values();
        java.util.Set set45 = defaultedMap38.entrySet();
        boolean b46 = defaultedMap31.containsValue((java.lang.Object) set45);
        java.lang.Object obj47 = defaultedMap17.get((java.lang.Object) defaultedMap31);
        boolean b48 = defaultedMap31.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) collection10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        boolean b15 = defaultedMap6.containsValue((java.lang.Object) filterIterator13);
        java.lang.Object obj16 = defaultedMap2.get((java.lang.Object) defaultedMap6);
        java.util.Set set17 = defaultedMap2.entrySet();
        int i18 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap11.containsValue((java.lang.Object) defaultedMap16);
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) b20, obj21);
        java.lang.Object obj24 = defaultedMap5.remove((java.lang.Object) '4');
        boolean b25 = defaultedMap2.containsKey(obj24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) iterator26);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 100.0f);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) ' ');
        int i33 = defaultedMap28.size();
        java.util.Set set34 = defaultedMap28.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap28);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap11.equals((java.lang.Object) collection15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        boolean b20 = defaultedMap11.containsValue((java.lang.Object) filterIterator18);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap2.containsKey((java.lang.Object) defaultedMap11);
        java.util.Set set24 = defaultedMap11.entrySet();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) iterator6);
        java.util.Collection collection9 = defaultedMap8.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) collection9);
        defaultedMap5.clear();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) iterator13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) iterator16);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap15.equals((java.lang.Object) collection19);
        java.util.Set set21 = defaultedMap15.entrySet();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) iterator22);
        java.util.Collection collection25 = defaultedMap24.values();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) predicate26);
        defaultedMap24.clear();
        java.lang.Object obj29 = defaultedMap15.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i32 = defaultedMap31.size();
        java.lang.Object obj33 = defaultedMap24.get((java.lang.Object) defaultedMap31);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Set set35 = defaultedMap31.keySet();
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) set35);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1 + "'", obj12.equals(1));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap10.equals((java.lang.Object) collection14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) filterIterator17);
        defaultedMap2.putAll((java.util.Map) defaultedMap10);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap23.remove(obj27);
        java.util.Set set29 = defaultedMap23.entrySet();
        java.util.Collection collection30 = defaultedMap23.values();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) iterator31);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap10.put((java.lang.Object) defaultedMap23, (java.lang.Object) (short) 1);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) iterator39);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) iterator42);
        java.util.Collection collection45 = defaultedMap44.values();
        boolean b46 = defaultedMap41.equals((java.lang.Object) collection45);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate52);
        filterIterator48.setIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate55 = filterIterator51.getPredicate();
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        java.util.Iterator iterator58 = filterIterator57.getIterator();
        java.util.Iterator iterator59 = filterIterator57.getIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate64 = filterIterator60.getPredicate();
        filterIterator51.setPredicate(predicate64);
        boolean b66 = defaultedMap41.containsValue((java.lang.Object) predicate64);
        boolean b67 = defaultedMap10.equals((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            java.lang.Object obj15 = filterIterator14.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.put((java.lang.Object) b17, obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) iterator24);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.get(obj29);
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) iterator34);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) iterator37);
        java.util.Collection collection40 = defaultedMap39.values();
        boolean b41 = defaultedMap36.equals((java.lang.Object) collection40);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        boolean b45 = defaultedMap36.containsValue((java.lang.Object) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        java.util.Iterator iterator52 = filterIterator49.getIterator();
        filterIterator47.setIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate54);
        java.lang.Object obj56 = defaultedMap36.get((java.lang.Object) predicate54);
        defaultedMap26.putAll((java.util.Map) defaultedMap36);
        int i58 = defaultedMap26.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(i58 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate11);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate15);
        try {
            filterIterator17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) defaultedMap22);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap11.put((java.lang.Object) b26, obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) iterator33);
        java.util.Collection collection36 = defaultedMap35.values();
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) defaultedMap35);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap35.get(obj38);
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) 1);
        java.lang.Object obj42 = defaultedMap11.get((java.lang.Object) defaultedMap35);
        boolean b43 = defaultedMap1.containsKey(obj42);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) iterator44);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) (byte) 10);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) defaultedMap46, (java.lang.Object) predicate52);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        java.util.Iterator iterator58 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        filterIterator56.setIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate63 = filterIterator59.getPredicate();
        java.util.Iterator iterator64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator64);
        java.util.Iterator iterator66 = filterIterator65.getIterator();
        java.util.Iterator iterator67 = filterIterator65.getIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        filterIterator65.setIterator((java.util.Iterator) filterIterator68);
        collections.Predicate predicate72 = filterIterator68.getPredicate();
        filterIterator59.setPredicate(predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate72);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) iterator9);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) defaultedMap22);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap11.put((java.lang.Object) b26, obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) iterator33);
        java.util.Collection collection36 = defaultedMap35.values();
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) defaultedMap35);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap35.get(obj38);
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) 1);
        java.lang.Object obj42 = defaultedMap11.get((java.lang.Object) defaultedMap35);
        boolean b43 = defaultedMap1.containsKey(obj42);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) iterator44);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) (byte) 10);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj54 = defaultedMap1.put((java.lang.Object) defaultedMap46, (java.lang.Object) predicate52);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) iterator55);
        java.util.Collection collection58 = defaultedMap57.values();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        boolean b60 = defaultedMap57.containsValue((java.lang.Object) predicate59);
        java.lang.Object obj62 = defaultedMap57.get((java.lang.Object) 0.0f);
        int i63 = defaultedMap57.size();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b66 = defaultedMap57.equals((java.lang.Object) true);
        defaultedMap46.putAll((java.util.Map) defaultedMap57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.util.Collection collection6 = defaultedMap2.values();
        java.util.Collection collection7 = defaultedMap2.values();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap10.remove(obj14);
        java.util.Set set16 = defaultedMap10.entrySet();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) iterator17);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap19.equals((java.lang.Object) collection23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) filterIterator26);
        java.lang.Object obj30 = defaultedMap19.get((java.lang.Object) 0.0d);
        boolean b31 = defaultedMap10.containsKey((java.lang.Object) defaultedMap19);
        defaultedMap2.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i8 = defaultedMap7.size();
        int i9 = defaultedMap7.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        java.util.Map map11 = null;
        try {
            defaultedMap7.putAll(map11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1));
        java.lang.String str8 = defaultedMap5.toString();
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate10);
        java.lang.Object obj12 = defaultedMap2.get((java.lang.Object) map11);
        defaultedMap2.clear();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator3);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap11.containsValue((java.lang.Object) defaultedMap16);
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) b20, obj21);
        java.lang.Object obj24 = defaultedMap5.remove((java.lang.Object) '4');
        boolean b25 = defaultedMap2.containsKey(obj24);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap2.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) iterator11);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap10.equals((java.lang.Object) collection14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) filterIterator17);
        defaultedMap2.putAll((java.util.Map) defaultedMap10);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) iterator21);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap23.remove(obj27);
        java.util.Set set29 = defaultedMap23.entrySet();
        java.util.Collection collection30 = defaultedMap23.values();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) iterator31);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 100.0f);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap10.put((java.lang.Object) defaultedMap23, (java.lang.Object) (short) 1);
        java.util.Set set39 = defaultedMap23.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap6.values();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        java.util.Iterator iterator17 = filterIterator14.getIterator();
        filterIterator12.setIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator12.setPredicate(predicate19);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        filterIterator22.setIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate29);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) iterator31);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 100.0f);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b39 = defaultedMap33.isEmpty();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate42);
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate(map44, (java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i55 = defaultedMap54.size();
        int i56 = defaultedMap54.size();
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) predicateUtils57);
        boolean b60 = defaultedMap54.equals((java.lang.Object) false);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) iterator61);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) 100.0f);
        java.lang.Object obj68 = defaultedMap63.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b69 = defaultedMap63.isEmpty();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator71.setPredicate(predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate70, predicate72);
        java.util.Iterator iterator75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator75);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) iterator75);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 100.0f);
        java.lang.Object obj82 = defaultedMap77.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b83 = defaultedMap77.isEmpty();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        filterIterator85.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate84, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate72, predicate86);
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map44, predicate51, predicate86);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate86);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate19, predicate86);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate86);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        java.util.Iterator iterator11 = filterIterator9.getIterator();
        java.util.Iterator iterator12 = filterIterator9.getIterator();
        filterIterator7.setIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate14);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate18);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) filterIterator7);
        java.util.Iterator iterator22 = filterIterator7.getIterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator22);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object obj11 = defaultedMap2.put((java.lang.Object) (-1), (java.lang.Object) (short) 0);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.lang.String str4 = defaultedMap1.toString();
        collections.Predicate predicate5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) iterator12);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i19 = defaultedMap18.size();
        int i20 = defaultedMap18.size();
        boolean b21 = defaultedMap9.containsValue((java.lang.Object) i20);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicateUtils4);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap9);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        int i14 = defaultedMap9.size();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) collection20);
        java.util.Set set22 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Set set8 = defaultedMap2.entrySet();
        java.util.Collection collection9 = defaultedMap2.values();
        java.lang.Object obj11 = defaultedMap2.get((java.lang.Object) "hi!");
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        java.util.Iterator iterator21 = filterIterator18.getIterator();
        filterIterator16.setIterator(iterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate23);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        java.util.Iterator iterator29 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        filterIterator27.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate34 = filterIterator30.getPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate34);
        boolean b36 = defaultedMap2.containsValue((java.lang.Object) filterIterator13);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) collection10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        boolean b15 = defaultedMap6.containsValue((java.lang.Object) filterIterator13);
        java.lang.Object obj16 = defaultedMap2.get((java.lang.Object) defaultedMap6);
        java.util.Set set17 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.String str21 = defaultedMap19.toString();
        defaultedMap2.putAll((java.util.Map) defaultedMap19);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) iterator23);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) iterator31);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) iterator34);
        java.util.Collection collection37 = defaultedMap36.values();
        boolean b38 = defaultedMap33.equals((java.lang.Object) collection37);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        boolean b42 = defaultedMap33.containsValue((java.lang.Object) filterIterator40);
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) iterator44);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap46.remove(obj50);
        java.util.Set set52 = defaultedMap46.entrySet();
        java.util.Collection collection53 = defaultedMap46.values();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) iterator54);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) 100.0f);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap33.put((java.lang.Object) defaultedMap46, (java.lang.Object) (short) 1);
        java.lang.String str62 = defaultedMap33.toString();
        boolean b63 = defaultedMap19.containsKey((java.lang.Object) defaultedMap33);
        defaultedMap33.clear();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{{}=1}" + "'", str62.equals("{{}=1}"));
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicateUtils4);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) iterator15);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) iterator18);
        java.util.Collection collection21 = defaultedMap20.values();
        boolean b22 = defaultedMap17.equals((java.lang.Object) collection21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) filterIterator24);
        defaultedMap9.putAll((java.util.Map) defaultedMap17);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) iterator28);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap30.remove(obj34);
        java.util.Set set36 = defaultedMap30.entrySet();
        java.util.Collection collection37 = defaultedMap30.values();
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) iterator38);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap17.put((java.lang.Object) defaultedMap30, (java.lang.Object) (short) 1);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) iterator46);
        java.util.Collection collection49 = defaultedMap48.values();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        boolean b51 = defaultedMap48.containsValue((java.lang.Object) predicate50);
        java.util.Collection collection52 = defaultedMap48.values();
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b54 = defaultedMap30.containsKey((java.lang.Object) defaultedMap48);
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 1L, (java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap2.remove(obj6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) filterIterator12);
        boolean b16 = defaultedMap2.equals((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i8 = defaultedMap7.size();
        int i9 = defaultedMap7.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        filterIterator1.setIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        java.util.Iterator iterator11 = filterIterator9.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate16);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) iterator18);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b26 = defaultedMap20.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate27, predicate29);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate(map31, (java.lang.Object) predicate34);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i42 = defaultedMap41.size();
        int i43 = defaultedMap41.size();
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) predicateUtils44);
        boolean b47 = defaultedMap41.equals((java.lang.Object) false);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) iterator48);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 100.0f);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b56 = defaultedMap50.isEmpty();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate57, predicate59);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) iterator62);
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 100.0f);
        java.lang.Object obj69 = defaultedMap64.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b70 = defaultedMap64.isEmpty();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate71, predicate73);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate59, predicate73);
        java.util.Map map77 = collections.map.PredicatedMap.decorate(map31, predicate38, predicate73);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate73);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate73);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
        java.util.Collection collection3 = defaultedMap2.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        boolean b5 = defaultedMap2.containsValue((java.lang.Object) predicate4);
        defaultedMap2.clear();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator7);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) ' ');
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) iterator14);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) iterator22);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) iterator25);
        java.util.Collection collection28 = defaultedMap27.values();
        boolean b29 = defaultedMap24.equals((java.lang.Object) collection28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        boolean b33 = defaultedMap24.containsValue((java.lang.Object) filterIterator31);
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj35 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        defaultedMap9.clear();
        java.lang.Object obj37 = defaultedMap2.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i40 = defaultedMap39.size();
        java.lang.String str41 = defaultedMap39.toString();
        java.lang.Object obj42 = defaultedMap9.remove((java.lang.Object) str41);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 1);
        int i13 = defaultedMap6.size();
        java.util.Set set14 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) iterator19);
        java.util.Collection collection22 = defaultedMap21.values();
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.get(obj24);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) 1);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 0.0f);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) iterator30);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj36 = defaultedMap6.remove((java.lang.Object) defaultedMap21);
        int i37 = defaultedMap21.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 10);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i9 = defaultedMap8.size();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) iterator10);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) iterator13);
        java.util.Collection collection16 = defaultedMap15.values();
        boolean b17 = defaultedMap12.equals((java.lang.Object) collection16);
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b16 = defaultedMap10.isEmpty();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate19);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) 1.0f, (java.lang.Object) 100.0d);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator4);
        java.util.Collection collection7 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1));
        java.lang.String str12 = defaultedMap9.toString();
        collections.Predicate predicate13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) map15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) iterator17);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) iterator20);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap19.equals((java.lang.Object) collection23);
        java.util.Set set25 = defaultedMap19.entrySet();
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) iterator26);
        java.util.Collection collection29 = defaultedMap28.values();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) predicate30);
        defaultedMap28.clear();
        java.lang.Object obj33 = defaultedMap19.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        int i36 = defaultedMap35.size();
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) defaultedMap35);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        java.util.Iterator iterator46 = filterIterator44.getIterator();
        java.util.Iterator iterator47 = filterIterator44.getIterator();
        filterIterator42.setIterator(iterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator42.setPredicate(predicate49);
        filterIterator39.setIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate53 = filterIterator39.getPredicate();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) iterator54);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) 100.0f);
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) 1, (java.lang.Object) (short) 100);
        boolean b62 = defaultedMap56.isEmpty();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate63, predicate65);
        filterIterator39.setPredicate(predicate63);
        java.lang.Object obj69 = defaultedMap6.put((java.lang.Object) defaultedMap28, (java.lang.Object) predicate63);
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) iterator70);
        java.util.Collection collection73 = defaultedMap72.values();
        java.lang.Object obj75 = defaultedMap72.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj76 = null;
        java.lang.Object obj77 = defaultedMap72.remove(obj76);
        java.util.Set set78 = defaultedMap72.entrySet();
        java.util.Collection collection79 = defaultedMap72.values();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1));
        java.util.Iterator iterator84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator84);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) iterator84);
        java.util.Collection collection87 = defaultedMap86.values();
        boolean b88 = defaultedMap81.containsValue((java.lang.Object) defaultedMap86);
        java.lang.Object obj89 = null;
        java.lang.Object obj90 = defaultedMap86.get(obj89);
        boolean b92 = defaultedMap86.containsValue((java.lang.Object) 1);
        java.lang.Object obj94 = defaultedMap86.get((java.lang.Object) 0.0f);
        java.util.Set set95 = defaultedMap86.keySet();
        boolean b96 = defaultedMap72.equals((java.lang.Object) defaultedMap86);
        java.lang.Object obj97 = defaultedMap1.put(obj69, (java.lang.Object) defaultedMap72);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertNull(obj97);
    }
}

