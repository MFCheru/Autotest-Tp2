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
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        try {
            java.util.Map map13 = collections.map.PredicatedMap.decorate(map0, predicate5, predicate11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = filterIterator1.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        defaultedMap6.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate14);
        collections.Predicate predicate16 = null;
        try {
            java.util.Map map17 = collections.map.PredicatedMap.decorate(map0, predicate12, predicate16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, (java.lang.Object) 100.0d);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate(map14, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        java.util.Set set7 = defaultedMap5.entrySet();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        boolean b19 = defaultedMap5.containsKey((java.lang.Object) false);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        defaultedMap32.clear();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate40);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate19, predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.Predicate predicate46 = filterIterator44.getPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = filterIterator50.getPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        java.util.Collection collection57 = defaultedMap49.values();
        boolean b58 = defaultedMap5.equals((java.lang.Object) collection57);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        boolean b6 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, (java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.Predicate predicate19 = filterIterator17.getPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.Predicate predicate25 = filterIterator23.getPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        boolean b30 = defaultedMap22.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj32 = defaultedMap22.get((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map14, predicate31, predicate33);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate9);
        java.util.Iterator iterator12 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.Predicate predicate21 = filterIterator19.getPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        defaultedMap24.clear();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate32);
        filterIterator0.setPredicate(predicate32);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) filterIterator13);
        defaultedMap11.clear();
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.lang.String str15 = defaultedMap5.toString();
        java.lang.String str16 = defaultedMap5.toString();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) false);
        defaultedMap5.clear();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        boolean b10 = defaultedMap5.isEmpty();
        defaultedMap5.clear();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = filterIterator7.getPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate10);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap20.clear();
        boolean b22 = defaultedMap20.isEmpty();
        java.util.Set set23 = defaultedMap20.keySet();
        int i24 = defaultedMap20.size();
        java.lang.String str25 = defaultedMap20.toString();
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap11.put((java.lang.Object) defaultedMap20, obj27);
        boolean b29 = defaultedMap11.isEmpty();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap27.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate33);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(iterator38);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) filterIterator13);
        int i19 = defaultedMap11.size();
        java.util.Set set20 = defaultedMap11.entrySet();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap23.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        boolean b39 = defaultedMap23.containsValue((java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap23.keySet();
        java.lang.Object obj41 = defaultedMap5.remove((java.lang.Object) defaultedMap23);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = filterIterator42.getPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = filterIterator48.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        boolean b55 = defaultedMap47.isEmpty();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj57 = defaultedMap47.get((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap47.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        boolean b63 = defaultedMap47.containsValue((java.lang.Object) filterIterator62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        collections.Predicate predicate66 = filterIterator64.getPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate67);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) filterIterator68);
        defaultedMap69.clear();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator72 = filterIterator71.getIterator();
        collections.Predicate predicate73 = filterIterator71.getPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator78 = filterIterator77.getIterator();
        collections.Predicate predicate79 = filterIterator77.getPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate80);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) filterIterator81);
        defaultedMap76.putAll((java.util.Map) defaultedMap82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator();
        java.lang.Object obj85 = defaultedMap82.get((java.lang.Object) filterIterator84);
        defaultedMap82.clear();
        java.lang.Object obj87 = defaultedMap69.remove((java.lang.Object) defaultedMap82);
        java.lang.Object obj88 = defaultedMap23.put((java.lang.Object) filterIterator62, (java.lang.Object) defaultedMap82);
        collections.Transformer transformer89 = null;
        try {
            java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, transformer89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(iterator72);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(iterator78);
        org.junit.Assert.assertNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap23.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        boolean b39 = defaultedMap23.containsValue((java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap23.keySet();
        java.lang.Object obj41 = defaultedMap5.remove((java.lang.Object) defaultedMap23);
        java.lang.String str42 = defaultedMap23.toString();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        boolean b14 = defaultedMap5.containsValue((java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        boolean b28 = defaultedMap20.isEmpty();
        int i29 = defaultedMap20.size();
        java.util.Collection collection30 = defaultedMap20.values();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = filterIterator37.getPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        defaultedMap36.putAll((java.util.Map) defaultedMap42);
        boolean b44 = defaultedMap36.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj46 = defaultedMap36.get((java.lang.Object) predicate45);
        boolean b47 = defaultedMap20.containsKey((java.lang.Object) defaultedMap36);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = filterIterator48.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.Predicate predicate56 = filterIterator54.getPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate57);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator58);
        defaultedMap53.putAll((java.util.Map) defaultedMap59);
        boolean b61 = defaultedMap53.isEmpty();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj63 = defaultedMap53.get((java.lang.Object) predicate62);
        java.lang.Object obj65 = defaultedMap53.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator67 = filterIterator66.getIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        boolean b69 = defaultedMap53.containsValue((java.lang.Object) filterIterator68);
        java.lang.Object obj70 = null;
        boolean b71 = defaultedMap53.containsKey(obj70);
        defaultedMap20.putAll((java.util.Map) defaultedMap53);
        java.util.Collection collection73 = defaultedMap20.values();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap20);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator76 = filterIterator75.getIterator();
        collections.Predicate predicate77 = filterIterator75.getPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate78);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) filterIterator79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator82 = filterIterator81.getIterator();
        collections.Predicate predicate83 = filterIterator81.getPredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81, predicate84);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) filterIterator85);
        defaultedMap80.putAll((java.util.Map) defaultedMap86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator89 = filterIterator88.getIterator();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator();
        filterIterator88.setIterator((java.util.Iterator) filterIterator90);
        collections.Predicate predicate92 = null;
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator90, predicate92);
        java.lang.Object obj94 = defaultedMap80.get((java.lang.Object) filterIterator90);
        boolean b95 = defaultedMap5.containsKey(obj94);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(iterator76);
        org.junit.Assert.assertNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNull(iterator82);
        org.junit.Assert.assertNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(iterator89);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        boolean b17 = defaultedMap9.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        boolean b25 = defaultedMap9.containsValue((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = filterIterator26.getPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        defaultedMap31.clear();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate37);
        filterIterator3.setIterator((java.util.Iterator) filterIterator24);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = filterIterator5.getPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate19);
        filterIterator0.setIterator((java.util.Iterator) filterIterator9);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) filterIterator13);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        boolean b14 = defaultedMap5.containsValue((java.lang.Object) (-1));
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap27.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate33);
        collections.Predicate predicate38 = null;
        filterIterator20.setPredicate(predicate38);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = filterIterator20.getPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        defaultedMap25.clear();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate33);
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = filterIterator37.getPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = filterIterator42.getPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = filterIterator48.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        boolean b55 = defaultedMap47.isEmpty();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        filterIterator56.setIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.Predicate predicate64 = filterIterator62.getPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate65);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) filterIterator66);
        defaultedMap67.clear();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        filterIterator69.setIterator((java.util.Iterator) filterIterator71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate73, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate75);
        java.lang.Object obj78 = defaultedMap47.get((java.lang.Object) filterIterator77);
        java.lang.Object obj79 = defaultedMap5.put((java.lang.Object) filterIterator37, (java.lang.Object) filterIterator77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator81 = filterIterator80.getIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        filterIterator80.setIterator((java.util.Iterator) filterIterator82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate85);
        boolean b87 = defaultedMap5.containsKey((java.lang.Object) predicate85);
        defaultedMap5.clear();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        boolean b90 = defaultedMap5.containsKey((java.lang.Object) predicate89);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, (java.lang.Object) 100.0d);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.Predicate predicate19 = filterIterator17.getPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.Predicate predicate25 = filterIterator23.getPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        boolean b30 = defaultedMap22.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj32 = defaultedMap22.get((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap22.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        boolean b38 = defaultedMap22.containsValue((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        collections.Predicate predicate41 = filterIterator39.getPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator43);
        defaultedMap44.clear();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        filterIterator46.setIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate50);
        java.util.Map map55 = collections.map.DefaultedMap.decorate(map14, (java.lang.Object) filterIterator54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap27.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate33);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        filterIterator42.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = filterIterator48.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        defaultedMap53.clear();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        filterIterator55.setIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate59, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate61);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate61);
        filterIterator37.setPredicate(predicate61);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.Predicate predicate19 = filterIterator17.getPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        defaultedMap22.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate30);
        filterIterator0.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate35 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(predicate35);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = filterIterator7.getPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) filterIterator20);
        defaultedMap18.clear();
        java.lang.Object obj23 = defaultedMap5.remove((java.lang.Object) defaultedMap18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        filterIterator30.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate34);
        java.lang.Object obj36 = defaultedMap29.remove((java.lang.Object) filterIterator35);
        boolean b37 = defaultedMap29.isEmpty();
        boolean b38 = defaultedMap29.isEmpty();
        java.lang.Object obj39 = defaultedMap18.remove((java.lang.Object) b38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        collections.Predicate predicate42 = filterIterator40.getPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        defaultedMap45.clear();
        boolean b47 = defaultedMap45.isEmpty();
        java.util.Set set48 = defaultedMap45.keySet();
        int i49 = defaultedMap45.size();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = filterIterator50.getPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.Predicate predicate58 = filterIterator56.getPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) filterIterator60);
        defaultedMap55.putAll((java.util.Map) defaultedMap61);
        boolean b63 = defaultedMap45.equals((java.lang.Object) defaultedMap55);
        java.util.Set set64 = defaultedMap45.entrySet();
        java.lang.Object obj65 = defaultedMap18.remove((java.lang.Object) set64);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) filterIterator13);
        collections.Predicate predicate19 = filterIterator13.getPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        filterIterator20.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        filterIterator22.setIterator((java.util.Iterator) filterIterator30);
        filterIterator13.setIterator((java.util.Iterator) filterIterator30);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator27);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b23 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set24 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.Predicate predicate27 = filterIterator25.getPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.lang.Object obj39 = defaultedMap36.get((java.lang.Object) filterIterator38);
        defaultedMap36.clear();
        java.lang.Object obj41 = defaultedMap5.get((java.lang.Object) defaultedMap36);
        java.lang.String str42 = defaultedMap36.toString();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        filterIterator11.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator21);
        filterIterator0.setIterator((java.util.Iterator) filterIterator13);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.lang.String str15 = defaultedMap5.toString();
        java.util.Collection collection16 = defaultedMap5.values();
        int i17 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b23 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set24 = defaultedMap5.entrySet();
        boolean b25 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.util.Collection collection15 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap21.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) predicate30);
        boolean b32 = defaultedMap5.containsKey((java.lang.Object) defaultedMap21);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = filterIterator33.getPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        collections.Predicate predicate41 = filterIterator39.getPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator43);
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        boolean b46 = defaultedMap38.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj48 = defaultedMap38.get((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap38.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        boolean b54 = defaultedMap38.containsValue((java.lang.Object) filterIterator53);
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap38.containsKey(obj55);
        defaultedMap5.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection58 = defaultedMap5.values();
        int i59 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(i59 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.util.Collection collection15 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap21.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) predicate30);
        boolean b32 = defaultedMap5.containsKey((java.lang.Object) defaultedMap21);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap27.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        filterIterator29.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate35);
        boolean b37 = defaultedMap5.containsValue((java.lang.Object) predicate35);
        boolean b38 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = filterIterator5.getPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator10.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate14);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        boolean b13 = defaultedMap5.isEmpty();
        boolean b14 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        boolean b19 = defaultedMap5.containsKey((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = filterIterator20.getPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator24 = filterIterator20.getIterator();
        filterIterator15.setIterator((java.util.Iterator) filterIterator20);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(iterator24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        defaultedMap5.clear();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap5.containsKey(obj22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj27 = defaultedMap5.remove((java.lang.Object) filterIterator26);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = filterIterator7.getPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b20 = defaultedMap12.isEmpty();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.Predicate predicate25 = filterIterator23.getPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        filterIterator28.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.Predicate predicate36 = filterIterator34.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator38);
        defaultedMap39.clear();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate45, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate47);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate26, predicate47);
        boolean b51 = defaultedMap5.containsValue((java.lang.Object) defaultedMap12);
        collections.Transformer transformer52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.equals(obj15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        defaultedMap32.clear();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        filterIterator44.setIterator((java.util.Iterator) filterIterator46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = filterIterator50.getPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        defaultedMap55.clear();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator58 = filterIterator57.getIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        filterIterator57.setIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate63);
        collections.Predicate predicate66 = filterIterator65.getPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate40, predicate66);
        collections.Factory factory68 = null;
        try {
            java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        collections.Predicate predicate22 = filterIterator20.getPredicate();
        java.util.Iterator iterator23 = filterIterator20.getIterator();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.equals(obj15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        filterIterator17.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        defaultedMap32.clear();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        filterIterator44.setIterator((java.util.Iterator) filterIterator46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = filterIterator50.getPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        defaultedMap55.clear();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator58 = filterIterator57.getIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        filterIterator57.setIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate63);
        collections.Predicate predicate66 = filterIterator65.getPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate40, predicate66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap23.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        boolean b39 = defaultedMap23.containsValue((java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap23.keySet();
        java.lang.Object obj41 = defaultedMap5.remove((java.lang.Object) defaultedMap23);
        java.util.Set set42 = defaultedMap5.keySet();
        java.util.Collection collection43 = defaultedMap5.values();
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap5.containsKey(obj44);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        filterIterator10.setIterator((java.util.Iterator) filterIterator12);
        boolean b14 = defaultedMap5.equals((java.lang.Object) filterIterator10);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.lang.String str15 = defaultedMap5.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        java.lang.Object obj27 = defaultedMap21.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.Predicate predicate30 = filterIterator28.getPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        java.lang.String str34 = defaultedMap33.toString();
        java.lang.Object obj35 = defaultedMap21.remove((java.lang.Object) defaultedMap33);
        boolean b36 = defaultedMap5.equals((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b23 = defaultedMap5.equals((java.lang.Object) defaultedMap15);
        java.util.Set set24 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.Predicate predicate27 = filterIterator25.getPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.lang.Object obj39 = defaultedMap36.get((java.lang.Object) filterIterator38);
        defaultedMap36.clear();
        java.lang.Object obj41 = defaultedMap5.get((java.lang.Object) defaultedMap36);
        java.util.Set set42 = defaultedMap5.entrySet();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = filterIterator20.getPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        defaultedMap25.clear();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        filterIterator27.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate33);
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = filterIterator37.getPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = filterIterator42.getPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = filterIterator48.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        boolean b55 = defaultedMap47.isEmpty();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        filterIterator56.setIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.Predicate predicate64 = filterIterator62.getPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate65);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) filterIterator66);
        defaultedMap67.clear();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        filterIterator69.setIterator((java.util.Iterator) filterIterator71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate73, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate75);
        java.lang.Object obj78 = defaultedMap47.get((java.lang.Object) filterIterator77);
        java.lang.Object obj79 = defaultedMap5.put((java.lang.Object) filterIterator37, (java.lang.Object) filterIterator77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator81 = filterIterator80.getIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        filterIterator80.setIterator((java.util.Iterator) filterIterator82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate85);
        boolean b87 = defaultedMap5.containsKey((java.lang.Object) predicate85);
        defaultedMap5.clear();
        defaultedMap5.clear();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.Predicate predicate10 = filterIterator8.getPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.Predicate predicate16 = filterIterator14.getPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator18);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b21 = defaultedMap13.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        boolean b29 = defaultedMap13.containsValue((java.lang.Object) filterIterator28);
        java.util.Set set30 = defaultedMap13.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        filterIterator31.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate35);
        collections.Predicate predicate37 = filterIterator31.getPredicate();
        java.util.Iterator iterator38 = filterIterator31.getIterator();
        java.lang.Object obj39 = defaultedMap13.get((java.lang.Object) iterator38);
        java.lang.Object obj40 = defaultedMap5.put((java.lang.Object) (short) 100, obj39);
        collections.Transformer transformer41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(predicate37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        boolean b14 = defaultedMap5.containsValue((java.lang.Object) (-1));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        boolean b28 = defaultedMap20.isEmpty();
        int i29 = defaultedMap20.size();
        java.util.Collection collection30 = defaultedMap20.values();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = filterIterator37.getPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        defaultedMap36.putAll((java.util.Map) defaultedMap42);
        boolean b44 = defaultedMap36.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj46 = defaultedMap36.get((java.lang.Object) predicate45);
        boolean b47 = defaultedMap20.containsKey((java.lang.Object) defaultedMap36);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = filterIterator48.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.Predicate predicate56 = filterIterator54.getPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate57);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator58);
        defaultedMap53.putAll((java.util.Map) defaultedMap59);
        boolean b61 = defaultedMap53.isEmpty();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj63 = defaultedMap53.get((java.lang.Object) predicate62);
        java.lang.Object obj65 = defaultedMap53.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator67 = filterIterator66.getIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        boolean b69 = defaultedMap53.containsValue((java.lang.Object) filterIterator68);
        java.lang.Object obj70 = null;
        boolean b71 = defaultedMap53.containsKey(obj70);
        defaultedMap20.putAll((java.util.Map) defaultedMap53);
        java.util.Collection collection73 = defaultedMap20.values();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap20);
        java.util.Collection collection75 = defaultedMap5.values();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(collection75);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap23.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        boolean b39 = defaultedMap23.containsValue((java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap23.keySet();
        java.lang.Object obj41 = defaultedMap5.remove((java.lang.Object) defaultedMap23);
        java.util.Set set42 = defaultedMap5.keySet();
        int i43 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        boolean b13 = defaultedMap5.isEmpty();
        boolean b14 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        boolean b28 = defaultedMap20.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        filterIterator36.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = filterIterator42.getPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        defaultedMap47.clear();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        filterIterator49.setIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate55);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate34, predicate55);
        java.lang.Object obj59 = defaultedMap5.get((java.lang.Object) predicate34);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.Predicate predicate62 = filterIterator60.getPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) filterIterator64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator67 = filterIterator66.getIterator();
        collections.Predicate predicate68 = filterIterator66.getPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate69);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) filterIterator70);
        defaultedMap65.putAll((java.util.Map) defaultedMap71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator74 = filterIterator73.getIterator();
        collections.Predicate predicate75 = filterIterator73.getPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate76);
        java.lang.Object obj78 = defaultedMap71.get((java.lang.Object) filterIterator73);
        boolean b79 = defaultedMap5.containsKey((java.lang.Object) filterIterator73);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(iterator74);
        org.junit.Assert.assertNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) false);
        java.util.Set set14 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap20.clear();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map29, (java.lang.Object) 100.0d);
        boolean b32 = defaultedMap5.equals((java.lang.Object) 100.0d);
        int i33 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap23.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        boolean b39 = defaultedMap23.containsValue((java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap23.keySet();
        java.lang.Object obj41 = defaultedMap5.remove((java.lang.Object) defaultedMap23);
        java.util.Set set42 = defaultedMap5.keySet();
        java.util.Collection collection43 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.Predicate predicate46 = filterIterator44.getPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        filterIterator50.setIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate54);
        java.lang.Object obj56 = defaultedMap49.remove((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        boolean b58 = defaultedMap5.equals((java.lang.Object) filterIterator55);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap20.clear();
        boolean b22 = defaultedMap20.isEmpty();
        java.util.Set set23 = defaultedMap20.keySet();
        int i24 = defaultedMap20.size();
        java.lang.String str25 = defaultedMap20.toString();
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap11.put((java.lang.Object) defaultedMap20, obj27);
        defaultedMap11.clear();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) false);
        java.util.Set set14 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap20.clear();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        filterIterator22.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map29, (java.lang.Object) 100.0d);
        boolean b32 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        boolean b13 = defaultedMap5.isEmpty();
        boolean b14 = defaultedMap5.isEmpty();
        int i15 = defaultedMap5.size();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        defaultedMap21.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        collections.Predicate predicate32 = filterIterator30.getPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        boolean b37 = defaultedMap29.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj39 = defaultedMap29.get((java.lang.Object) predicate38);
        java.lang.Object obj41 = defaultedMap29.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        boolean b45 = defaultedMap29.containsValue((java.lang.Object) filterIterator44);
        java.util.Set set46 = defaultedMap29.keySet();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        filterIterator47.setIterator((java.util.Iterator) filterIterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate51);
        collections.Predicate predicate53 = filterIterator47.getPredicate();
        java.util.Iterator iterator54 = filterIterator47.getIterator();
        java.lang.Object obj55 = defaultedMap29.get((java.lang.Object) iterator54);
        java.lang.Object obj56 = defaultedMap21.put((java.lang.Object) (short) 100, obj55);
        java.lang.Object obj57 = defaultedMap5.remove((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate13);
        java.util.Map map15 = null;
        try {
            defaultedMap5.putAll(map15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.util.Collection collection15 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap21.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) predicate30);
        boolean b32 = defaultedMap5.containsKey((java.lang.Object) defaultedMap21);
        java.util.Collection collection33 = defaultedMap5.values();
        java.lang.String str34 = defaultedMap5.toString();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        defaultedMap32.clear();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate40);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate19, predicate40);
        java.lang.Object obj44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.Predicate predicate47 = filterIterator45.getPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) filterIterator49);
        defaultedMap50.clear();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        collections.Predicate predicate54 = filterIterator52.getPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.Predicate predicate60 = filterIterator58.getPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate61);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) filterIterator62);
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        java.lang.Object obj66 = defaultedMap63.get((java.lang.Object) filterIterator65);
        defaultedMap63.clear();
        java.lang.Object obj68 = defaultedMap50.remove((java.lang.Object) defaultedMap63);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        filterIterator69.setIterator((java.util.Iterator) filterIterator71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate73);
        collections.Predicate predicate75 = filterIterator69.getPredicate();
        java.util.Iterator iterator76 = filterIterator69.getIterator();
        java.lang.Object obj78 = defaultedMap50.put((java.lang.Object) filterIterator69, (java.lang.Object) 100.0f);
        java.lang.Object obj79 = defaultedMap5.put(obj44, obj78);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(predicate75);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) filterIterator8);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = filterIterator9.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap14.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        boolean b30 = defaultedMap14.containsValue((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        defaultedMap36.clear();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate42);
        filterIterator0.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate48 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(predicate48);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        int i14 = defaultedMap5.size();
        java.util.Collection collection15 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = filterIterator22.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap21.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) predicate30);
        boolean b32 = defaultedMap5.containsKey((java.lang.Object) defaultedMap21);
        java.util.Collection collection33 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.Predicate predicate36 = filterIterator34.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator38);
        defaultedMap39.clear();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.Predicate predicate43 = filterIterator41.getPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        collections.Predicate predicate49 = filterIterator47.getPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) filterIterator51);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        boolean b54 = defaultedMap46.isEmpty();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj56 = defaultedMap46.get((java.lang.Object) predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator58 = filterIterator57.getIterator();
        collections.Predicate predicate59 = filterIterator57.getPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        filterIterator62.setIterator((java.util.Iterator) filterIterator64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator69 = filterIterator68.getIterator();
        collections.Predicate predicate70 = filterIterator68.getPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) filterIterator72);
        defaultedMap73.clear();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator76 = filterIterator75.getIterator();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        filterIterator75.setIterator((java.util.Iterator) filterIterator77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate79, predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate81);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate60, predicate81);
        boolean b85 = defaultedMap39.containsValue((java.lang.Object) defaultedMap46);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator87 = filterIterator86.getIterator();
        collections.Predicate predicate88 = filterIterator86.getPredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86, predicate89);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) filterIterator90);
        defaultedMap91.clear();
        boolean b93 = defaultedMap91.isEmpty();
        java.util.Set set94 = defaultedMap91.keySet();
        int i95 = defaultedMap91.size();
        java.lang.Object obj96 = defaultedMap46.get((java.lang.Object) i95);
        boolean b97 = defaultedMap5.containsKey((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(iterator76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(iterator87);
        org.junit.Assert.assertNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertNotNull(obj96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) filterIterator11);
        java.util.Collection collection13 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.Predicate predicate16 = filterIterator14.getPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator18);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) '4', (java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap19.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = filterIterator26.getPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        java.lang.String str32 = defaultedMap31.toString();
        java.lang.Object obj33 = defaultedMap19.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap5.remove((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        boolean b10 = defaultedMap5.isEmpty();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap5.get(obj11);
        defaultedMap5.clear();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.Predicate predicate6 = filterIterator4.getPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate7);
        filterIterator0.setPredicate(predicate7);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 'a');
        int i10 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = filterIterator9.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap14.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        boolean b30 = defaultedMap14.containsValue((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        defaultedMap36.clear();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate42);
        filterIterator0.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection13 = defaultedMap5.values();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap5.containsValue(obj14);
        java.lang.String str16 = defaultedMap5.toString();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) filterIterator13);
        java.util.Collection collection19 = defaultedMap11.values();
        int i20 = defaultedMap11.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) filterIterator15);
        try {
            filterIterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = filterIterator11.getPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        filterIterator18.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate22, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate24);
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) filterIterator3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        filterIterator13.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = filterIterator20.getPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        defaultedMap25.clear();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = filterIterator33.getPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) filterIterator37);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap32.isEmpty();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.Predicate predicate45 = filterIterator43.getPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        filterIterator48.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.Predicate predicate56 = filterIterator54.getPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate57);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) filterIterator58);
        defaultedMap59.clear();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        filterIterator61.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate67);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate46, predicate67);
        boolean b71 = defaultedMap25.containsValue((java.lang.Object) defaultedMap32);
        boolean b72 = defaultedMap5.equals((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) filterIterator13);
        defaultedMap11.clear();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = filterIterator16.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        defaultedMap21.clear();
        boolean b23 = defaultedMap21.isEmpty();
        java.util.Set set24 = defaultedMap21.keySet();
        int i25 = defaultedMap21.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap21);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        defaultedMap5.clear();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Set set8 = defaultedMap5.keySet();
        int i9 = defaultedMap5.size();
        boolean b11 = defaultedMap5.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap5.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) filterIterator20);
        int i22 = defaultedMap5.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.Predicate predicate21 = filterIterator19.getPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.Predicate predicate27 = filterIterator25.getPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        boolean b32 = defaultedMap24.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj34 = defaultedMap24.get((java.lang.Object) predicate33);
        java.lang.Object obj35 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.util.Set set36 = defaultedMap24.keySet();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = filterIterator37.getPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        filterIterator45.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.Predicate predicate53 = filterIterator51.getPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        defaultedMap56.clear();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        filterIterator58.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate64);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate64);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        java.lang.Object obj69 = defaultedMap5.put((java.lang.Object) set36, (java.lang.Object) filterIterator40);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate9);
        java.util.Iterator iterator12 = filterIterator0.getIterator();
        collections.Predicate predicate13 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(predicate13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        collections.Predicate predicate4 = filterIterator2.getPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) filterIterator6);
        defaultedMap7.clear();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Set set10 = defaultedMap7.keySet();
        int i11 = defaultedMap7.size();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap7.equals((java.lang.Object) defaultedMap17);
        java.util.Set set26 = defaultedMap7.entrySet();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = filterIterator33.getPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) filterIterator37);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) filterIterator40);
        defaultedMap38.clear();
        java.lang.Object obj43 = defaultedMap7.get((java.lang.Object) defaultedMap38);
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) defaultedMap38);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.Predicate predicate47 = filterIterator45.getPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) filterIterator49);
        defaultedMap50.clear();
        boolean b52 = defaultedMap50.isEmpty();
        java.util.Set set53 = defaultedMap50.keySet();
        int i54 = defaultedMap50.size();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        collections.Predicate predicate57 = filterIterator55.getPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) filterIterator59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        collections.Predicate predicate63 = filterIterator61.getPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate64);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) filterIterator65);
        defaultedMap60.putAll((java.util.Map) defaultedMap66);
        boolean b68 = defaultedMap50.equals((java.lang.Object) defaultedMap60);
        java.lang.Object obj70 = defaultedMap1.put((java.lang.Object) b68, (java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator72 = filterIterator71.getIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        filterIterator71.setIterator((java.util.Iterator) filterIterator73);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73);
        boolean b76 = defaultedMap1.containsKey((java.lang.Object) filterIterator73);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(iterator72);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = filterIterator9.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = filterIterator15.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b22 = defaultedMap14.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        boolean b30 = defaultedMap14.containsValue((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        defaultedMap36.clear();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        filterIterator38.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate42);
        filterIterator0.setIterator((java.util.Iterator) filterIterator29);
        try {
            java.lang.Object obj48 = filterIterator29.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
    }
}

