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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
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
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            java.lang.Object obj7 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        try {
            boolean b4 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        try {
            java.lang.Object obj4 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        filterIterator8.setIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator8.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate13);
        try {
            boolean b17 = filterIterator16.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator5 = null;
        filterIterator4.setIterator(iterator5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        filterIterator9.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        filterIterator9.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate14);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map19 = collections.map.PredicatedMap.decorate(map0, predicate14, predicate18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate14);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        filterIterator1.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            filterIterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator7 = filterIterator3.getIterator();
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate14);
        try {
            java.lang.Object obj18 = filterIterator17.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator5 = null;
        filterIterator4.setIterator(iterator5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        filterIterator9.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        filterIterator9.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate14);
        collections.Predicate predicate18 = null;
        try {
            java.util.Map map19 = collections.map.PredicatedMap.decorate(map0, predicate14, predicate18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate8);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator13.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate20);
        filterIterator10.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        java.util.Iterator iterator26 = null;
        filterIterator25.setIterator(iterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate30);
        filterIterator25.setPredicate(predicate30);
        try {
            java.util.Map map33 = collections.map.PredicatedMap.decorate(map0, predicate20, predicate30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            boolean b7 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        filterIterator8.setIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator8.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate13);
        try {
            boolean b17 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        filterIterator8.setIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator8.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator19 = null;
        filterIterator18.setIterator(iterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator18.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        try {
            filterIterator26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate23);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate25);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate(map27, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        java.util.Iterator iterator11 = null;
        filterIterator9.setIterator(iterator11);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator11 = null;
        filterIterator10.setIterator(iterator11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate21);
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        filterIterator4.setPredicate(predicate25);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate14);
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        try {
            filterIterator17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Set set19 = defaultedMap15.entrySet();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator24 = null;
        filterIterator23.setIterator(iterator24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        boolean b27 = defaultedMap15.containsKey((java.lang.Object) filterIterator23);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) b27);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        filterIterator9.setIterator(iterator10);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) filterIterator9);
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator20.setPredicate(predicate23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate23);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) predicate23);
        java.util.Set set28 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator7 = null;
        filterIterator6.setIterator(iterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        filterIterator6.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        boolean b15 = defaultedMap1.equals((java.lang.Object) filterIterator6);
        try {
            java.lang.Object obj16 = filterIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate30);
        filterIterator27.setPredicate(predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate30);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate44);
        filterIterator41.setPredicate(predicate44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate44);
        boolean b48 = defaultedMap22.containsValue((java.lang.Object) predicate44);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        filterIterator49.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate56);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.Predicate predicate60 = filterIterator58.getPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        filterIterator61.setIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate68);
        filterIterator58.setPredicate(predicate68);
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map20, predicate44, predicate68);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75);
        filterIterator73.setIterator((java.util.Iterator) filterIterator75);
        java.util.Map map78 = collections.map.DefaultedMap.decorate(map20, (java.lang.Object) filterIterator73);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) map20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate12);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) filterIterator14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate10);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator12.setPredicate(predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Set set31 = defaultedMap27.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) predicate22, (java.lang.Object) set31);
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) filterIterator4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Set set19 = defaultedMap15.entrySet();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) set19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) filterIterator30);
        try {
            filterIterator30.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate8);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map14 = collections.map.PredicatedMap.decorate(map0, predicate12, predicate13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate14);
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        try {
            boolean b19 = filterIterator17.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        filterIterator14.setPredicate(predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate17);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) map20);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator5 = null;
        filterIterator4.setIterator(iterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator4.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator1.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate12);
        org.junit.Assert.assertNotNull(predicate12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "hi!");
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        java.util.Collection collection20 = defaultedMap8.values();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap22.keySet();
        java.util.Set set26 = defaultedMap22.entrySet();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator31 = null;
        filterIterator30.setIterator(iterator31);
        filterIterator27.setIterator((java.util.Iterator) filterIterator30);
        boolean b34 = defaultedMap22.containsKey((java.lang.Object) filterIterator30);
        java.lang.Object obj35 = defaultedMap8.remove((java.lang.Object) b34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (byte) 0);
        java.util.Set set40 = defaultedMap37.keySet();
        java.util.Set set41 = defaultedMap37.entrySet();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator46 = null;
        filterIterator45.setIterator(iterator46);
        filterIterator42.setIterator((java.util.Iterator) filterIterator45);
        boolean b49 = defaultedMap37.containsKey((java.lang.Object) filterIterator45);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) "hi!");
        boolean b54 = defaultedMap51.isEmpty();
        java.util.Set set55 = defaultedMap51.entrySet();
        java.lang.Object obj56 = defaultedMap8.put((java.lang.Object) b49, (java.lang.Object) set55);
        boolean b57 = defaultedMap1.containsKey((java.lang.Object) b49);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        filterIterator8.setIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator8.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator19 = null;
        filterIterator18.setIterator(iterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator18.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        filterIterator33.setPredicate(predicate36);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate36);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate50);
        filterIterator47.setPredicate(predicate50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) predicate50);
        boolean b54 = defaultedMap28.containsValue((java.lang.Object) predicate50);
        filterIterator16.setPredicate(predicate50);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate30);
        filterIterator27.setPredicate(predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate30);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate44);
        filterIterator41.setPredicate(predicate44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate44);
        boolean b48 = defaultedMap22.containsValue((java.lang.Object) predicate44);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        filterIterator49.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate56);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.Predicate predicate60 = filterIterator58.getPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        filterIterator61.setIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate68);
        filterIterator58.setPredicate(predicate68);
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map20, predicate44, predicate68);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75);
        filterIterator73.setIterator((java.util.Iterator) filterIterator75);
        java.util.Map map78 = collections.map.DefaultedMap.decorate(map20, (java.lang.Object) filterIterator73);
        collections.Factory factory79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate(map78, factory79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        filterIterator26.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate31);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) predicate36, (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        filterIterator1.setPredicate(predicate6);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap11.keySet();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator17 = null;
        filterIterator16.setIterator(iterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        filterIterator16.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        boolean b25 = defaultedMap11.equals((java.lang.Object) filterIterator16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator16);
        try {
            boolean b27 = filterIterator16.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate25);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate38);
        filterIterator35.setPredicate(predicate38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate38);
        defaultedMap29.clear();
        java.util.Set set43 = defaultedMap29.keySet();
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        filterIterator50.setPredicate(predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate53);
        java.util.Collection collection57 = defaultedMap45.values();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (byte) 0);
        java.util.Set set62 = defaultedMap59.keySet();
        java.util.Set set63 = defaultedMap59.entrySet();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        java.util.Iterator iterator68 = null;
        filterIterator67.setIterator(iterator68);
        filterIterator64.setIterator((java.util.Iterator) filterIterator67);
        boolean b71 = defaultedMap59.containsKey((java.lang.Object) filterIterator67);
        java.lang.Object obj72 = defaultedMap45.remove((java.lang.Object) b71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b76 = defaultedMap74.equals((java.lang.Object) (byte) 0);
        java.util.Set set77 = defaultedMap74.keySet();
        java.util.Set set78 = defaultedMap74.entrySet();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        java.util.Iterator iterator83 = null;
        filterIterator82.setIterator(iterator83);
        filterIterator79.setIterator((java.util.Iterator) filterIterator82);
        boolean b86 = defaultedMap74.containsKey((java.lang.Object) filterIterator82);
        java.lang.Object obj87 = null;
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap(obj87);
        java.lang.Object obj90 = defaultedMap88.get((java.lang.Object) "hi!");
        boolean b91 = defaultedMap88.isEmpty();
        java.util.Set set92 = defaultedMap88.entrySet();
        java.lang.Object obj93 = defaultedMap45.put((java.lang.Object) b86, (java.lang.Object) set92);
        java.lang.Object obj94 = defaultedMap1.put((java.lang.Object) defaultedMap29, (java.lang.Object) set92);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate10);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator12.setPredicate(predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Set set31 = defaultedMap27.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) predicate22, (java.lang.Object) set31);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Set set19 = defaultedMap15.entrySet();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) set19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) filterIterator30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate25);
        java.util.Set set28 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b26 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator31 = null;
        filterIterator30.setIterator(iterator31);
        filterIterator27.setIterator((java.util.Iterator) filterIterator30);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) filterIterator27, (java.lang.Object) "{}");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        filterIterator3.setPredicate(predicate6);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap10.keySet();
        java.util.Set set14 = defaultedMap10.entrySet();
        java.lang.String str15 = defaultedMap10.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        filterIterator22.setPredicate(predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate25);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate18);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate39);
        filterIterator36.setPredicate(predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        filterIterator50.setPredicate(predicate53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate53);
        boolean b57 = defaultedMap31.containsValue((java.lang.Object) predicate53);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        filterIterator58.setIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate65);
        java.util.Iterator iterator68 = filterIterator67.getIterator();
        collections.Predicate predicate69 = filterIterator67.getPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        filterIterator70.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate77);
        filterIterator67.setPredicate(predicate77);
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map29, predicate53, predicate77);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate77);
        java.util.Iterator iterator83 = filterIterator3.getIterator();
        collections.Predicate predicate84 = filterIterator3.getPredicate();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator20.setPredicate(predicate23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate23);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set29 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "hi!");
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        filterIterator11.setPredicate(predicate14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicate14);
        defaultedMap1.putAll(map17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator21 = null;
        filterIterator20.setIterator(iterator21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        filterIterator20.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator29 = filterIterator20.getIterator();
        boolean b30 = defaultedMap1.containsKey((java.lang.Object) filterIterator20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        filterIterator3.setPredicate(predicate6);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (byte) 0);
        java.util.Set set13 = defaultedMap10.keySet();
        java.util.Set set14 = defaultedMap10.entrySet();
        java.lang.String str15 = defaultedMap10.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        filterIterator22.setPredicate(predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate25);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate18);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate39);
        filterIterator36.setPredicate(predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        filterIterator50.setPredicate(predicate53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate53);
        boolean b57 = defaultedMap31.containsValue((java.lang.Object) predicate53);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        filterIterator58.setIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate65);
        java.util.Iterator iterator68 = filterIterator67.getIterator();
        collections.Predicate predicate69 = filterIterator67.getPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        filterIterator70.setIterator((java.util.Iterator) filterIterator72);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate77);
        filterIterator67.setPredicate(predicate77);
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map29, predicate53, predicate77);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate77);
        try {
            boolean b83 = filterIterator82.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Set set19 = defaultedMap15.entrySet();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) set19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap22.keySet();
        java.util.Set set26 = defaultedMap22.entrySet();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator31 = null;
        filterIterator30.setIterator(iterator31);
        filterIterator27.setIterator((java.util.Iterator) filterIterator30);
        boolean b34 = defaultedMap22.containsKey((java.lang.Object) filterIterator30);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.util.Iterator iterator28 = null;
        filterIterator27.setIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        filterIterator27.setPredicate(predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (byte) 0);
        java.util.Set set41 = defaultedMap38.keySet();
        java.util.Set set42 = defaultedMap38.entrySet();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        java.util.Iterator iterator47 = null;
        filterIterator46.setIterator(iterator47);
        filterIterator43.setIterator((java.util.Iterator) filterIterator46);
        boolean b50 = defaultedMap38.containsKey((java.lang.Object) filterIterator46);
        boolean b52 = defaultedMap38.equals((java.lang.Object) 10.0f);
        boolean b53 = defaultedMap1.equals((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Collection collection30 = defaultedMap29.values();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        filterIterator31.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate38);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        collections.Predicate predicate42 = filterIterator40.getPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        filterIterator43.setIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate50);
        filterIterator40.setPredicate(predicate50);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (byte) 0);
        java.util.Set set58 = defaultedMap55.keySet();
        java.util.Set set59 = defaultedMap55.entrySet();
        java.lang.Object obj60 = defaultedMap29.put((java.lang.Object) predicate50, (java.lang.Object) set59);
        java.util.Set set61 = defaultedMap29.entrySet();
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) "hi!");
        boolean b66 = defaultedMap63.isEmpty();
        java.util.Set set67 = defaultedMap63.entrySet();
        java.lang.Object obj68 = defaultedMap29.remove((java.lang.Object) defaultedMap63);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap63);
        boolean b70 = defaultedMap5.equals((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        filterIterator18.setPredicate(predicate21);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate21);
        java.util.Collection collection25 = defaultedMap13.values();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Set set31 = defaultedMap27.entrySet();
        boolean b32 = defaultedMap13.containsValue((java.lang.Object) set31);
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        filterIterator36.setPredicate(predicate39);
        boolean b41 = defaultedMap9.containsKey((java.lang.Object) predicate39);
        boolean b42 = defaultedMap7.containsValue((java.lang.Object) b41);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        filterIterator1.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator20.setPredicate(predicate23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate23);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate38);
        filterIterator35.setPredicate(predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate38);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        int i44 = defaultedMap43.size();
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) "");
        java.util.Set set47 = defaultedMap43.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate58);
        filterIterator55.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate58);
        java.util.Collection collection62 = defaultedMap50.values();
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        boolean b66 = defaultedMap64.equals((java.lang.Object) (byte) 0);
        java.util.Set set67 = defaultedMap64.keySet();
        java.util.Set set68 = defaultedMap64.entrySet();
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) set68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70);
        java.util.Iterator iterator72 = null;
        filterIterator71.setIterator(iterator72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74, predicate76);
        filterIterator71.setPredicate(predicate76);
        boolean b79 = defaultedMap50.equals((java.lang.Object) predicate76);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate76, predicate82);
        boolean b85 = defaultedMap1.equals((java.lang.Object) predicate76);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate7 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        filterIterator7.setPredicate(predicate10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator23 = null;
        filterIterator22.setIterator(iterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate27);
        filterIterator22.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate27);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        java.util.Set set35 = defaultedMap32.keySet();
        java.util.Set set36 = defaultedMap32.entrySet();
        java.lang.String str37 = defaultedMap32.toString();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate47);
        filterIterator44.setPredicate(predicate47);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate47);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate47, predicate56);
        filterIterator14.setPredicate(predicate47);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) filterIterator14);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Set set19 = defaultedMap15.entrySet();
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        filterIterator8.setIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator8.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator19 = null;
        filterIterator18.setIterator(iterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator18.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        filterIterator34.setPredicate(predicate37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate37);
        filterIterator26.setPredicate(predicate37);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        filterIterator11.setIterator(iterator12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        filterIterator11.setPredicate(predicate14);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate14);
        java.util.Collection collection18 = defaultedMap6.values();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap20.keySet();
        java.util.Set set24 = defaultedMap20.entrySet();
        boolean b25 = defaultedMap6.containsValue((java.lang.Object) set24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.util.Iterator iterator28 = null;
        filterIterator27.setIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        filterIterator27.setPredicate(predicate32);
        boolean b35 = defaultedMap6.equals((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate42);
        filterIterator39.setPredicate(predicate42);
        java.util.Iterator iterator45 = filterIterator39.getIterator();
        java.lang.Object obj47 = defaultedMap6.put((java.lang.Object) iterator45, (java.lang.Object) (short) 100);
        boolean b48 = defaultedMap1.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        collections.Predicate predicate15 = filterIterator11.getPredicate();
        java.util.Iterator iterator16 = filterIterator11.getIterator();
        filterIterator9.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator22 = null;
        filterIterator21.setIterator(iterator22);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator25 = filterIterator18.getIterator();
        filterIterator11.setIterator(iterator25);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator10.setPredicate(predicate13);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate13);
        java.util.Collection collection17 = defaultedMap5.values();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Set set23 = defaultedMap19.entrySet();
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) set23);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b26 = defaultedMap1.isEmpty();
        java.lang.String str27 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate10);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator12.setPredicate(predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Set set31 = defaultedMap27.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) predicate22, (java.lang.Object) set31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        filterIterator40.setPredicate(predicate43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap34);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.String str12 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.String str22 = defaultedMap17.toString();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        filterIterator29.setPredicate(predicate32);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate32);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        filterIterator36.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate32, predicate41);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) map43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate10);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator12.setPredicate(predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Set set31 = defaultedMap27.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) predicate22, (java.lang.Object) set31);
        java.util.Set set33 = defaultedMap1.entrySet();
        java.util.Set set34 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.equals(obj5);
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        filterIterator6.setPredicate(predicate9);
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate9);
        java.util.Collection collection13 = defaultedMap1.values();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Set set19 = defaultedMap15.entrySet();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) set19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator23 = null;
        filterIterator22.setIterator(iterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate27);
        filterIterator22.setPredicate(predicate27);
        boolean b30 = defaultedMap1.equals((java.lang.Object) predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        filterIterator34.setPredicate(predicate37);
        java.util.Iterator iterator40 = filterIterator34.getIterator();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) iterator40, (java.lang.Object) (short) 100);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap1.containsKey(obj43);
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        filterIterator11.setIterator(iterator12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator17 = null;
        filterIterator16.setIterator(iterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        filterIterator16.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator27 = null;
        filterIterator26.setIterator(iterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        filterIterator26.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate31);
        try {
            boolean b36 = filterIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate31);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate7);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator14 = null;
        filterIterator13.setIterator(iterator14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator19 = null;
        filterIterator18.setIterator(iterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate23);
        filterIterator18.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator29 = null;
        filterIterator28.setIterator(iterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        filterIterator28.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        filterIterator36.setIterator((java.util.Iterator) filterIterator39);
        filterIterator0.setIterator((java.util.Iterator) filterIterator39);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(predicate40);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        filterIterator12.setPredicate(predicate15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate15);
        defaultedMap6.clear();
        java.util.Set set20 = defaultedMap6.keySet();
        java.lang.Object obj21 = defaultedMap4.get((java.lang.Object) defaultedMap6);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        filterIterator24.setIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj31 = defaultedMap4.remove((java.lang.Object) defaultedMap30);
        java.lang.String str32 = defaultedMap30.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 0 + "'", obj21.equals((byte) 0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) predicate9);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        int i14 = defaultedMap13.size();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) "");
        java.util.Set set17 = defaultedMap13.entrySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        filterIterator13.setPredicate(predicate16);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate16);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator21.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        collections.Predicate predicate32 = filterIterator30.getPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        filterIterator33.setIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate40);
        filterIterator30.setPredicate(predicate40);
        java.util.Iterator iterator44 = filterIterator30.getIterator();
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) filterIterator30);
        try {
            filterIterator30.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate10);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator12.setPredicate(predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Set set31 = defaultedMap27.entrySet();
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) predicate22, (java.lang.Object) set31);
        java.util.Set set33 = defaultedMap1.entrySet();
        java.util.Set set34 = defaultedMap1.keySet();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap36.keySet();
        java.util.Set set40 = defaultedMap36.entrySet();
        java.lang.String str41 = defaultedMap36.toString();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) predicate44);
        boolean b46 = defaultedMap36.equals((java.lang.Object) predicate44);
        java.lang.String str47 = defaultedMap36.toString();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        filterIterator48.setIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate55);
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate68);
        filterIterator65.setPredicate(predicate68);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate68);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate58, predicate68);
        boolean b73 = defaultedMap1.containsKey((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        filterIterator7.setPredicate(predicate10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator23 = null;
        filterIterator22.setIterator(iterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate27);
        filterIterator22.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate27);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        java.util.Set set35 = defaultedMap32.keySet();
        java.util.Set set36 = defaultedMap32.entrySet();
        java.lang.String str37 = defaultedMap32.toString();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate47);
        filterIterator44.setPredicate(predicate47);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate47);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate47, predicate56);
        filterIterator14.setPredicate(predicate47);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) filterIterator14);
        java.lang.String str61 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        filterIterator9.setIterator(iterator10);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) filterIterator9);
        boolean b15 = defaultedMap1.equals((java.lang.Object) 10.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        filterIterator17.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        boolean b27 = defaultedMap1.equals((java.lang.Object) filterIterator25);
        try {
            java.lang.Object obj28 = filterIterator25.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        filterIterator7.setPredicate(predicate10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator23 = null;
        filterIterator22.setIterator(iterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate27);
        filterIterator22.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate27);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        java.util.Set set35 = defaultedMap32.keySet();
        java.util.Set set36 = defaultedMap32.entrySet();
        java.lang.String str37 = defaultedMap32.toString();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate47);
        filterIterator44.setPredicate(predicate47);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate47);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        filterIterator51.setIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate47, predicate56);
        filterIterator14.setPredicate(predicate47);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) filterIterator14);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.util.Collection collection63 = defaultedMap62.values();
        java.util.Collection collection64 = defaultedMap62.values();
        boolean b65 = defaultedMap1.containsKey((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == false);
    }
}

