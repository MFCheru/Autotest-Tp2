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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            boolean b3 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10L);
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
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate11);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        try {
            java.lang.Object obj13 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator13, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator17);
        try {
            java.lang.Object obj25 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator4.setIterator((java.util.Iterator) filterIterator13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        filterIterator11.setIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) filterIterator24, obj32);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        int i5 = defaultedMap1.size();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        int i5 = defaultedMap1.size();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        collections.Predicate predicate12 = filterIterator4.getPredicate();
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(predicate12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator8, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate19);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator12);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        filterIterator11.setIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) filterIterator24, obj32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator34, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        filterIterator38.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.Predicate predicate48 = filterIterator46.getPredicate();
        filterIterator24.setPredicate(predicate48);
        try {
            java.lang.Object obj50 = filterIterator24.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate48);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        try {
            boolean b13 = filterIterator12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        java.lang.Object obj33 = defaultedMap18.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator24);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        filterIterator40.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate35, predicate58);
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) predicate58);
        java.lang.Object obj64 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        collections.Factory factory65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) b2);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        try {
            java.lang.Object obj12 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        boolean b22 = defaultedMap4.equals((java.lang.Object) 1L);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator28, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator41, predicate44);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        filterIterator45.setIterator((java.util.Iterator) filterIterator48);
        filterIterator32.setIterator((java.util.Iterator) filterIterator45);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap22.put((java.lang.Object) filterIterator45, obj53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator55, predicate58);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        filterIterator62.setPredicate(predicate63);
        filterIterator59.setIterator((java.util.Iterator) filterIterator62);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) filterIterator67);
        collections.Predicate predicate69 = filterIterator67.getPredicate();
        filterIterator45.setPredicate(predicate69);
        java.lang.Object obj72 = defaultedMap1.put((java.lang.Object) predicate69, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0.0d + "'", obj27.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator11, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator4.setPredicate(predicate22);
        try {
            boolean b25 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.lang.String str20 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        int i6 = defaultedMap1.size();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Collection collection13 = defaultedMap11.values();
        int i14 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b21 = defaultedMap11.containsKey((java.lang.Object) defaultedMap16);
        boolean b22 = defaultedMap16.isEmpty();
        java.util.Set set23 = defaultedMap16.entrySet();
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap4.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap4.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str3 = defaultedMap2.toString();
        java.util.Collection collection4 = defaultedMap2.values();
        int i5 = defaultedMap2.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj11 = defaultedMap7.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b12 = defaultedMap2.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str15 = defaultedMap14.toString();
        java.lang.Object obj18 = defaultedMap14.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj19 = defaultedMap7.remove((java.lang.Object) defaultedMap14);
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b12 = defaultedMap6.isEmpty();
        int i13 = defaultedMap6.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Collection collection16 = defaultedMap14.values();
        int i17 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b24 = defaultedMap14.containsKey((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator33, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        filterIterator37.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate44);
        java.lang.Object obj46 = defaultedMap31.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator37);
        defaultedMap26.putAll((java.util.Map) defaultedMap31);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator49, predicate52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator60, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        filterIterator64.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate71);
        filterIterator53.setPredicate(predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate48, predicate71);
        boolean b75 = defaultedMap19.containsValue((java.lang.Object) predicate71);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate71);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.get(obj5);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator18, predicate21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = null;
        filterIterator25.setPredicate(predicate26);
        filterIterator22.setIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        filterIterator33.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate40);
        filterIterator22.setPredicate(predicate40);
        filterIterator9.setPredicate(predicate40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str46 = defaultedMap45.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) (short) -1);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator51, predicate54);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = null;
        filterIterator58.setPredicate(predicate59);
        filterIterator55.setIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate62);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator64, predicate67);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.Predicate predicate72 = null;
        filterIterator71.setPredicate(predicate72);
        filterIterator68.setIterator((java.util.Iterator) filterIterator71);
        filterIterator55.setIterator((java.util.Iterator) filterIterator68);
        java.lang.Object obj76 = null;
        java.lang.Object obj77 = defaultedMap45.put((java.lang.Object) filterIterator68, obj76);
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.Predicate predicate81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator78, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        collections.Predicate predicate86 = null;
        filterIterator85.setPredicate(predicate86);
        filterIterator82.setIterator((java.util.Iterator) filterIterator85);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate89);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) filterIterator90);
        collections.Predicate predicate92 = filterIterator90.getPredicate();
        filterIterator68.setPredicate(predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate40, predicate92);
        java.util.Map map95 = null;
        try {
            defaultedMap1.putAll(map95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d + "'", obj50.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        int i21 = defaultedMap4.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator3, predicate6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator7);
        java.util.Iterator iterator17 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Collection collection21 = defaultedMap19.values();
        int i22 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj28 = defaultedMap24.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b29 = defaultedMap19.containsKey((java.lang.Object) defaultedMap24);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator30, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate41);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator43, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        filterIterator47.setIterator((java.util.Iterator) filterIterator50);
        filterIterator34.setIterator((java.util.Iterator) filterIterator47);
        boolean b55 = defaultedMap19.containsValue((java.lang.Object) filterIterator34);
        filterIterator7.setIterator((java.util.Iterator) filterIterator34);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator4, predicate7);
        filterIterator2.setIterator(iterator4);
        org.junit.Assert.assertNull(predicate3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator40, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate51);
        java.lang.Object obj53 = defaultedMap38.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator44);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator60, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        filterIterator64.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate71);
        java.lang.Object obj73 = defaultedMap58.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator64);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap58);
        java.lang.Object obj75 = defaultedMap36.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj76 = defaultedMap1.get(obj75);
        java.lang.Object obj78 = defaultedMap1.remove((java.lang.Object) 'a');
        boolean b80 = defaultedMap1.containsKey((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0.0d + "'", obj75.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        int i12 = defaultedMap6.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Collection collection12 = defaultedMap6.values();
        boolean b13 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator11, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator4.setPredicate(predicate22);
        collections.Predicate predicate25 = filterIterator4.getPredicate();
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator28, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        filterIterator32.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator41, predicate44);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        filterIterator45.setIterator((java.util.Iterator) filterIterator48);
        filterIterator32.setIterator((java.util.Iterator) filterIterator45);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap22.put((java.lang.Object) filterIterator45, obj53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator55, predicate58);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        filterIterator62.setPredicate(predicate63);
        filterIterator59.setIterator((java.util.Iterator) filterIterator62);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) filterIterator67);
        collections.Predicate predicate69 = filterIterator67.getPredicate();
        filterIterator45.setPredicate(predicate69);
        java.lang.Object obj72 = defaultedMap1.put((java.lang.Object) predicate69, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b75 = defaultedMap74.isEmpty();
        int i76 = defaultedMap74.size();
        java.lang.String str77 = defaultedMap74.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap74);
        java.util.Iterator iterator79 = null;
        collections.Predicate predicate80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator79, predicate80);
        collections.Predicate predicate82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator79, predicate82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        collections.Predicate predicate87 = null;
        filterIterator86.setPredicate(predicate87);
        filterIterator83.setIterator((java.util.Iterator) filterIterator86);
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate90);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) filterIterator91);
        collections.Predicate predicate93 = filterIterator91.getPredicate();
        java.lang.Object obj94 = defaultedMap74.remove((java.lang.Object) filterIterator91);
        try {
            boolean b95 = filterIterator91.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0.0d + "'", obj27.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator11, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator4.setPredicate(predicate22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator41, predicate44);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        filterIterator45.setIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate52);
        java.lang.Object obj54 = defaultedMap39.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator45);
        filterIterator29.setIterator((java.util.Iterator) filterIterator45);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator56, predicate59);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = null;
        filterIterator63.setPredicate(predicate64);
        filterIterator60.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate67);
        filterIterator4.setPredicate(predicate67);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate67);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (short) -1);
        int i33 = defaultedMap29.size();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) 1.0f);
        java.lang.Object obj36 = defaultedMap8.get((java.lang.Object) 1.0f);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator44, predicate47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = null;
        filterIterator51.setPredicate(predicate52);
        filterIterator48.setIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate55);
        java.lang.Object obj57 = defaultedMap42.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator48);
        boolean b58 = defaultedMap39.containsKey((java.lang.Object) defaultedMap42);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator59, predicate62);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        collections.Predicate predicate67 = null;
        filterIterator66.setPredicate(predicate67);
        filterIterator63.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) filterIterator71);
        collections.Predicate predicate73 = filterIterator71.getPredicate();
        java.lang.Object obj74 = defaultedMap42.remove((java.lang.Object) filterIterator71);
        java.lang.Object obj75 = defaultedMap8.put(obj37, obj74);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator9, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate20);
        java.lang.Object obj22 = defaultedMap7.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator13);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        filterIterator33.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate40);
        java.lang.Object obj42 = defaultedMap27.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator33);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap27);
        java.lang.Object obj44 = defaultedMap5.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Set set46 = defaultedMap5.entrySet();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap5.get(obj47);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0.0d + "'", obj48.equals(0.0d));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        filterIterator11.setIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) filterIterator24, obj32);
        try {
            filterIterator24.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str6 = defaultedMap5.toString();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b17 = defaultedMap12.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator29);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap23);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        java.lang.Object obj60 = defaultedMap45.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator51);
        boolean b61 = defaultedMap42.containsKey((java.lang.Object) defaultedMap45);
        java.util.Iterator iterator62 = null;
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator62, predicate65);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        filterIterator66.setIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) filterIterator74);
        collections.Predicate predicate76 = filterIterator74.getPredicate();
        java.lang.Object obj77 = defaultedMap45.remove((java.lang.Object) filterIterator74);
        boolean b78 = defaultedMap23.containsKey((java.lang.Object) defaultedMap45);
        collections.Factory factory79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        java.lang.Object obj33 = defaultedMap18.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator24);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        filterIterator40.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate35, predicate58);
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) predicate58);
        java.lang.Object obj64 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        collections.Transformer transformer65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        java.lang.Object obj33 = defaultedMap18.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator24);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        filterIterator40.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate35, predicate58);
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) predicate58);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator63, predicate66);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = null;
        filterIterator70.setPredicate(predicate71);
        filterIterator67.setIterator((java.util.Iterator) filterIterator70);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) filterIterator75);
        collections.Predicate predicate77 = filterIterator75.getPredicate();
        collections.Predicate predicate78 = filterIterator75.getPredicate();
        boolean b79 = defaultedMap6.containsKey((java.lang.Object) filterIterator75);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator9, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate20);
        java.lang.Object obj22 = defaultedMap7.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator13);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        filterIterator33.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate40);
        java.lang.Object obj42 = defaultedMap27.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator33);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap27);
        java.lang.Object obj44 = defaultedMap5.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Set set46 = defaultedMap5.entrySet();
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = filterIterator54.getPredicate();
        java.lang.Object obj59 = defaultedMap5.get((java.lang.Object) predicate58);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(predicate58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0.0d + "'", obj59.equals(0.0d));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        java.lang.Object obj33 = defaultedMap18.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator24);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        filterIterator40.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate35, predicate58);
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) predicate58);
        boolean b63 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        boolean b26 = defaultedMap6.equals((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap4.putAll((java.util.Map) defaultedMap22);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator15, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate26 = filterIterator19.getPredicate();
        java.util.Iterator iterator27 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Collection collection31 = defaultedMap29.values();
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator32, predicate35);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = null;
        filterIterator39.setPredicate(predicate40);
        filterIterator36.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate43);
        collections.Predicate predicate45 = null;
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate43, predicate45);
        filterIterator19.setPredicate(predicate43);
        filterIterator12.setPredicate(predicate43);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator15, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate26);
        java.lang.Object obj28 = defaultedMap13.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator19);
        boolean b29 = defaultedMap10.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Collection collection34 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap10.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap32);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) predicate47);
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator40, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate51);
        java.lang.Object obj53 = defaultedMap38.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator44);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator60, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        filterIterator64.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate71);
        java.lang.Object obj73 = defaultedMap58.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator64);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap58);
        java.lang.Object obj75 = defaultedMap36.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj76 = defaultedMap1.get(obj75);
        defaultedMap1.clear();
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        boolean b81 = defaultedMap1.containsValue((java.lang.Object) filterIterator80);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0.0d + "'", obj75.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator9, predicate12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate20);
        java.lang.Object obj22 = defaultedMap7.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator13);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator29, predicate32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        filterIterator33.setIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate40);
        java.lang.Object obj42 = defaultedMap27.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator33);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap27);
        java.lang.Object obj44 = defaultedMap5.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Set set46 = defaultedMap5.entrySet();
        java.lang.String str47 = defaultedMap5.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str6 = defaultedMap5.toString();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b17 = defaultedMap12.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.util.Collection collection14 = defaultedMap13.values();
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator11, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate22);
        filterIterator4.setPredicate(predicate22);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate22);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate31 = filterIterator4.getPredicate();
        collections.Predicate predicate32 = filterIterator4.getPredicate();
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate32);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator17, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        filterIterator21.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate30);
        filterIterator12.setPredicate(predicate28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate47);
        java.lang.Object obj49 = defaultedMap34.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator40);
        java.util.Iterator iterator50 = filterIterator40.getIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator54.setPredicate(predicate56);
        filterIterator40.setIterator((java.util.Iterator) filterIterator54);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        filterIterator9.setPredicate(predicate27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str16 = defaultedMap15.toString();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap15.containsKey(obj21);
        defaultedMap15.clear();
        java.lang.Object obj24 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Collection collection28 = defaultedMap26.values();
        int i29 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str32 = defaultedMap31.toString();
        java.lang.Object obj35 = defaultedMap31.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b36 = defaultedMap26.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str39 = defaultedMap38.toString();
        java.lang.Object obj42 = defaultedMap38.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj43 = defaultedMap31.remove((java.lang.Object) defaultedMap38);
        boolean b44 = defaultedMap31.isEmpty();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        filterIterator11.setIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) filterIterator24, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator42, predicate45);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        filterIterator46.setIterator((java.util.Iterator) filterIterator49);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate53);
        java.lang.Object obj55 = defaultedMap40.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator46);
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        java.util.Set set57 = defaultedMap40.entrySet();
        java.lang.Object obj59 = defaultedMap1.put((java.lang.Object) defaultedMap40, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) -1);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator33, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        filterIterator37.setIterator((java.util.Iterator) filterIterator40);
        filterIterator24.setIterator((java.util.Iterator) filterIterator37);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap14.put((java.lang.Object) filterIterator37, obj45);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) filterIterator59);
        collections.Predicate predicate61 = filterIterator59.getPredicate();
        filterIterator37.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate61);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate61);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator8, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate19);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator12);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set23 = defaultedMap6.entrySet();
        java.util.Set set24 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (short) -1);
        java.lang.Object obj30 = defaultedMap6.get((java.lang.Object) map29);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str30 = defaultedMap29.toString();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate47);
        java.lang.Object obj49 = defaultedMap34.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator40);
        defaultedMap29.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection51 = defaultedMap34.values();
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        collections.Predicate predicate57 = filterIterator54.getPredicate();
        java.lang.Object obj58 = defaultedMap1.put((java.lang.Object) collection51, (java.lang.Object) filterIterator54);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator30, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate41);
        java.lang.Object obj43 = defaultedMap28.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator34);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap28);
        java.lang.Object obj45 = defaultedMap6.get((java.lang.Object) defaultedMap28);
        java.lang.String str46 = defaultedMap28.toString();
        defaultedMap28.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        java.lang.String str49 = defaultedMap28.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        filterIterator9.setPredicate(predicate27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate(map4, (java.lang.Object) filterIterator9);
        try {
            boolean b31 = filterIterator9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        java.util.Set set28 = defaultedMap8.entrySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str24 = defaultedMap23.toString();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str29 = defaultedMap28.toString();
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) str29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator14, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate25);
        java.lang.Object obj27 = defaultedMap12.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator18);
        boolean b28 = defaultedMap9.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator49, predicate52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        filterIterator40.setIterator((java.util.Iterator) filterIterator53);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap30.put((java.lang.Object) filterIterator53, obj61);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator63, predicate66);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = null;
        filterIterator70.setPredicate(predicate71);
        filterIterator67.setIterator((java.util.Iterator) filterIterator70);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) filterIterator75);
        collections.Predicate predicate77 = filterIterator75.getPredicate();
        filterIterator53.setPredicate(predicate77);
        java.lang.Object obj80 = defaultedMap9.put((java.lang.Object) predicate77, (java.lang.Object) 1.0d);
        java.lang.Object obj81 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator31, predicate34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        filterIterator35.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate42);
        try {
            filterIterator44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate42);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj6);
        boolean b8 = defaultedMap1.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator23, predicate26);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = null;
        filterIterator30.setPredicate(predicate31);
        filterIterator27.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate34);
        java.lang.Object obj36 = defaultedMap21.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator27);
        filterIterator11.setIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator38, predicate41);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = null;
        filterIterator45.setPredicate(predicate46);
        filterIterator42.setIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) predicate49);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0.0d + "'", obj52.equals(0.0d));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator40, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate51);
        java.lang.Object obj53 = defaultedMap38.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator44);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator60, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        filterIterator64.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate71);
        java.lang.Object obj73 = defaultedMap58.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator64);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap58);
        java.lang.Object obj75 = defaultedMap36.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj76 = defaultedMap1.get(obj75);
        defaultedMap1.clear();
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.Predicate predicate81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator78, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        collections.Predicate predicate86 = null;
        filterIterator85.setPredicate(predicate86);
        filterIterator82.setIterator((java.util.Iterator) filterIterator85);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate89);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) filterIterator90);
        java.util.Iterator iterator92 = filterIterator90.getIterator();
        boolean b93 = defaultedMap1.containsValue((java.lang.Object) filterIterator90);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0.0d + "'", obj75.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b12 = defaultedMap6.isEmpty();
        java.util.Set set13 = defaultedMap6.entrySet();
        java.util.Set set14 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator29);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap23);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str41 = defaultedMap23.toString();
        defaultedMap23.clear();
        java.util.Set set43 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str46 = defaultedMap45.toString();
        java.util.Collection collection47 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator53, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate64);
        java.lang.Object obj66 = defaultedMap51.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator57);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = null;
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator73, predicate76);
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.Predicate predicate81 = null;
        filterIterator80.setPredicate(predicate81);
        filterIterator77.setIterator((java.util.Iterator) filterIterator80);
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate84);
        java.lang.Object obj86 = defaultedMap71.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator77);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) defaultedMap71);
        java.lang.Object obj88 = defaultedMap49.get((java.lang.Object) defaultedMap71);
        java.lang.Object obj89 = defaultedMap45.get((java.lang.Object) defaultedMap49);
        java.util.Set set90 = defaultedMap49.entrySet();
        boolean b91 = defaultedMap23.containsValue((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0.0d + "'", obj88.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 0.0d + "'", obj89.equals(0.0d));
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator3, predicate6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator7);
        java.util.Iterator iterator17 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator26, predicate29);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator30.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate37);
        java.lang.Object obj39 = defaultedMap24.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator30);
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator42, predicate45);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        filterIterator46.setIterator((java.util.Iterator) filterIterator49);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator53, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate64);
        filterIterator46.setPredicate(predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate41, predicate64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator17, predicate64);
        try {
            filterIterator68.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        java.util.Collection collection28 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) 100.0f);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap30.containsKey(obj36);
        java.lang.String str38 = defaultedMap30.toString();
        boolean b39 = defaultedMap8.containsValue((java.lang.Object) defaultedMap30);
        java.util.Map map40 = null;
        try {
            defaultedMap30.putAll(map40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Collection collection36 = defaultedMap35.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        int i10 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b17 = defaultedMap7.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj24 = defaultedMap12.remove((java.lang.Object) defaultedMap19);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str28 = defaultedMap27.toString();
        java.lang.Object obj31 = defaultedMap27.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        int i32 = defaultedMap27.size();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str38 = defaultedMap37.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap37.containsKey(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap46.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator51, predicate54);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = null;
        filterIterator58.setPredicate(predicate59);
        filterIterator55.setIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate62);
        java.lang.Object obj64 = defaultedMap49.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator55);
        boolean b65 = defaultedMap46.containsKey((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str69 = defaultedMap68.toString();
        java.util.Collection collection70 = defaultedMap68.values();
        java.lang.Object obj71 = defaultedMap46.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap68);
        java.util.Iterator iterator72 = null;
        collections.Predicate predicate73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator72, predicate73);
        collections.Predicate predicate75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator72, predicate75);
        java.util.Iterator iterator77 = null;
        collections.Predicate predicate78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = null;
        filterIterator79.setPredicate(predicate80);
        filterIterator76.setIterator((java.util.Iterator) filterIterator79);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator76, predicate83);
        java.lang.Object obj85 = defaultedMap37.put((java.lang.Object) (short) 10, (java.lang.Object) predicate83);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator34, predicate83);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate83);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b12 = defaultedMap6.isEmpty();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.String str13 = defaultedMap6.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{0.0=10}" + "'", str13.equals("{0.0=10}"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        defaultedMap8.clear();
        java.lang.String str29 = defaultedMap8.toString();
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator29);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap23);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str41 = defaultedMap23.toString();
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        filterIterator44.setPredicate(predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str50 = defaultedMap49.toString();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap23.put((java.lang.Object) filterIterator44, (java.lang.Object) defaultedMap49);
        java.lang.String str54 = defaultedMap49.toString();
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap27.get(obj28);
        java.util.Set set30 = defaultedMap27.keySet();
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator31, predicate34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        filterIterator35.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator46 = filterIterator44.getIterator();
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(iterator46);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator8, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate19);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator12);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection23 = defaultedMap6.values();
        boolean b24 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        defaultedMap8.clear();
        java.lang.String str29 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) str29);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator8, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate19);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator12);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set23 = defaultedMap6.entrySet();
        java.util.Set set24 = defaultedMap6.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        int i5 = defaultedMap1.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj6);
        boolean b8 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator32, predicate35);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = null;
        filterIterator39.setPredicate(predicate40);
        filterIterator36.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate43);
        java.lang.Object obj45 = defaultedMap30.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator36);
        filterIterator20.setIterator((java.util.Iterator) filterIterator36);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate58);
        filterIterator12.setIterator((java.util.Iterator) filterIterator60);
        try {
            java.lang.Object obj62 = filterIterator60.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate58);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator17, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        filterIterator21.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate30);
        filterIterator4.setPredicate(predicate28);
        try {
            boolean b33 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator29);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap23);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str41 = defaultedMap23.toString();
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str45 = defaultedMap44.toString();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) 100.0f);
        java.lang.Object obj50 = null;
        boolean b51 = defaultedMap44.containsKey(obj50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b54 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator58, predicate61);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = null;
        filterIterator65.setPredicate(predicate66);
        filterIterator62.setIterator((java.util.Iterator) filterIterator65);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate69);
        java.lang.Object obj71 = defaultedMap56.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator62);
        boolean b72 = defaultedMap53.containsKey((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str76 = defaultedMap75.toString();
        java.util.Collection collection77 = defaultedMap75.values();
        java.lang.Object obj78 = defaultedMap53.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap75);
        java.util.Iterator iterator79 = null;
        collections.Predicate predicate80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator79, predicate80);
        collections.Predicate predicate82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator79, predicate82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        collections.Predicate predicate87 = null;
        filterIterator86.setPredicate(predicate87);
        filterIterator83.setIterator((java.util.Iterator) filterIterator86);
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate90);
        java.lang.Object obj92 = defaultedMap44.put((java.lang.Object) (short) 10, (java.lang.Object) predicate90);
        java.lang.Object obj93 = defaultedMap23.remove((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0.0d + "'", obj49.equals(0.0d));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Collection collection16 = defaultedMap14.values();
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator17, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        filterIterator21.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate28, predicate30);
        filterIterator4.setPredicate(predicate28);
        java.util.Iterator iterator33 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator6, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate17);
        java.lang.Object obj19 = defaultedMap4.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator10);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str6 = defaultedMap5.toString();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (short) -1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b17 = defaultedMap12.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection20 = defaultedMap5.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate31 = filterIterator4.getPredicate();
        java.util.Iterator iterator32 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Iterator iterator0 = null;
        java.util.Iterator iterator1 = null;
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator1, predicate2);
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = null;
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator17, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        filterIterator21.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        java.lang.Object obj30 = defaultedMap15.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator21);
        filterIterator5.setIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator32, predicate35);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = null;
        filterIterator39.setPredicate(predicate40);
        filterIterator36.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator0, predicate43);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate43);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        try {
            boolean b12 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.Predicate predicate13 = filterIterator4.getPredicate();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(predicate13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate31 = filterIterator20.getPredicate();
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(predicate31);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str38 = defaultedMap37.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (short) -1);
        int i41 = defaultedMap37.size();
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) 1.0f);
        java.util.Collection collection44 = defaultedMap37.values();
        java.util.Set set45 = defaultedMap37.keySet();
        java.lang.Object obj46 = defaultedMap35.remove((java.lang.Object) set45);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0.0d + "'", obj43.equals(0.0d));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap27.get(obj28);
        boolean b30 = defaultedMap27.isEmpty();
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        defaultedMap8.clear();
        java.lang.String str29 = defaultedMap8.toString();
        boolean b30 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator17, predicate20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        filterIterator21.setIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate28);
        java.lang.Object obj30 = defaultedMap15.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator21);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap15);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj33 = null;
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, obj33);
        java.util.Set set35 = defaultedMap15.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator8, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate19);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator12);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set23 = defaultedMap6.entrySet();
        java.util.Set set24 = defaultedMap6.entrySet();
        java.lang.String str25 = defaultedMap6.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.util.Set set33 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator41, predicate44);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = null;
        filterIterator48.setPredicate(predicate49);
        filterIterator45.setIterator((java.util.Iterator) filterIterator48);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator54, predicate57);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        filterIterator58.setIterator((java.util.Iterator) filterIterator61);
        filterIterator45.setIterator((java.util.Iterator) filterIterator58);
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap35.put((java.lang.Object) filterIterator58, obj66);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator68, predicate71);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = null;
        filterIterator75.setPredicate(predicate76);
        filterIterator72.setIterator((java.util.Iterator) filterIterator75);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) filterIterator80);
        collections.Predicate predicate82 = filterIterator80.getPredicate();
        filterIterator58.setPredicate(predicate82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        collections.Predicate predicate87 = null;
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator(iterator84, predicate87);
        java.util.Iterator iterator89 = null;
        collections.Predicate predicate90 = null;
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator(iterator89, predicate90);
        collections.Predicate predicate92 = null;
        filterIterator91.setPredicate(predicate92);
        filterIterator88.setIterator((java.util.Iterator) filterIterator91);
        filterIterator58.setIterator((java.util.Iterator) filterIterator91);
        java.lang.Object obj96 = defaultedMap1.put((java.lang.Object) set33, (java.lang.Object) filterIterator91);
        try {
            boolean b97 = filterIterator91.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        java.util.Collection collection28 = defaultedMap8.values();
        java.lang.String str29 = defaultedMap8.toString();
        defaultedMap8.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        java.util.Collection collection28 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) 100.0f);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap30.containsKey(obj36);
        java.lang.String str38 = defaultedMap30.toString();
        boolean b39 = defaultedMap8.containsValue((java.lang.Object) defaultedMap30);
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        defaultedMap1.clear();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) "");
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        java.lang.Object obj33 = defaultedMap18.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator24);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator47, predicate50);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        filterIterator51.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate58);
        filterIterator40.setPredicate(predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate35, predicate58);
        boolean b62 = defaultedMap6.containsValue((java.lang.Object) predicate58);
        java.lang.Object obj64 = defaultedMap6.remove((java.lang.Object) (-1.0f));
        defaultedMap6.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator13, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate25);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator29);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap23);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str41 = defaultedMap23.toString();
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        filterIterator44.setPredicate(predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str50 = defaultedMap49.toString();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (short) -1);
        java.lang.Object obj53 = defaultedMap23.put((java.lang.Object) filterIterator44, (java.lang.Object) defaultedMap49);
        int i54 = defaultedMap23.size();
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator7, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        filterIterator11.setIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) filterIterator24, obj32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator34, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        filterIterator38.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        collections.Predicate predicate48 = filterIterator46.getPredicate();
        filterIterator24.setPredicate(predicate48);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator50, predicate53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        filterIterator54.setIterator((java.util.Iterator) filterIterator57);
        filterIterator24.setIterator((java.util.Iterator) filterIterator57);
        try {
            filterIterator24.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate48);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        int i10 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str13 = defaultedMap12.toString();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b17 = defaultedMap7.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj24 = defaultedMap12.remove((java.lang.Object) defaultedMap19);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str28 = defaultedMap27.toString();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator34, predicate37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        filterIterator38.setIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate45);
        java.lang.Object obj47 = defaultedMap32.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator38);
        defaultedMap27.putAll((java.util.Map) defaultedMap32);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator50, predicate53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        filterIterator54.setIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator61, predicate64);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.Predicate predicate69 = null;
        filterIterator68.setPredicate(predicate69);
        filterIterator65.setIterator((java.util.Iterator) filterIterator68);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate72);
        filterIterator54.setPredicate(predicate72);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate49, predicate72);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map75);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator13, predicate16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = null;
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator33, predicate36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        filterIterator37.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate44);
        java.lang.Object obj46 = defaultedMap31.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator37);
        defaultedMap26.putAll((java.util.Map) defaultedMap31);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator49, predicate52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        java.util.Iterator iterator60 = null;
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator60, predicate63);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        filterIterator64.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate71);
        filterIterator53.setPredicate(predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate48, predicate71);
        filterIterator4.setPredicate(predicate71);
        java.util.Iterator iterator76 = filterIterator4.getIterator();
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(iterator76);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = filterIterator4.getPredicate();
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator16, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator20);
        filterIterator4.setIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator4.setIterator((java.util.Iterator) filterIterator33);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj18 = defaultedMap6.remove((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str24 = defaultedMap23.toString();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator30, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate41);
        java.lang.Object obj43 = defaultedMap28.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator34);
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        java.util.Set set45 = defaultedMap28.entrySet();
        java.lang.Object obj46 = defaultedMap21.get((java.lang.Object) defaultedMap28);
        java.util.Collection collection47 = defaultedMap28.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str52 = defaultedMap51.toString();
        java.util.Collection collection53 = defaultedMap51.values();
        int i54 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str57 = defaultedMap56.toString();
        java.lang.Object obj60 = defaultedMap56.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b61 = defaultedMap51.containsKey((java.lang.Object) defaultedMap56);
        defaultedMap51.clear();
        java.lang.Object obj64 = defaultedMap51.remove((java.lang.Object) 10);
        java.util.Collection collection65 = defaultedMap51.values();
        java.lang.Object obj66 = defaultedMap49.get((java.lang.Object) collection65);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0.0d + "'", obj46.equals(0.0d));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator10, predicate13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        filterIterator14.setIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator14);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.util.Set set25 = defaultedMap8.entrySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection27 = defaultedMap8.values();
        java.util.Collection collection28 = defaultedMap8.values();
        java.util.Set set29 = defaultedMap8.keySet();
        defaultedMap8.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator12, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator16);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap10);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        boolean b32 = defaultedMap8.containsValue((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) b32, (java.lang.Object) "{}");
        collections.Predicate predicate35 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str38 = defaultedMap37.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (short) -1);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator43, predicate46);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        filterIterator47.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate54);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator56, predicate59);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = null;
        filterIterator63.setPredicate(predicate64);
        filterIterator60.setIterator((java.util.Iterator) filterIterator63);
        filterIterator47.setIterator((java.util.Iterator) filterIterator60);
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap37.put((java.lang.Object) filterIterator60, obj68);
        java.util.Iterator iterator70 = filterIterator60.getIterator();
        java.util.Iterator iterator71 = null;
        collections.Predicate predicate72 = null;
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator71, predicate72);
        collections.Predicate predicate74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator71, predicate74);
        java.util.Iterator iterator76 = null;
        collections.Predicate predicate77 = null;
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76, predicate77);
        collections.Predicate predicate79 = null;
        filterIterator78.setPredicate(predicate79);
        filterIterator75.setIterator((java.util.Iterator) filterIterator78);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate82);
        filterIterator60.setPredicate(predicate82);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate82);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0.0d + "'", obj6.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj18 = defaultedMap6.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator24, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        filterIterator31.setPredicate(predicate32);
        filterIterator28.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate35);
        java.lang.Object obj37 = defaultedMap22.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator28);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap22);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        boolean b44 = defaultedMap20.containsValue((java.lang.Object) filterIterator41);
        java.util.Set set45 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap46.get(obj47);
        defaultedMap6.putAll((java.util.Map) defaultedMap46);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        defaultedMap1.clear();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str17 = defaultedMap16.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (short) -1);
        int i20 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Collection collection24 = defaultedMap22.values();
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str28 = defaultedMap27.toString();
        java.lang.Object obj31 = defaultedMap27.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        boolean b32 = defaultedMap22.containsKey((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj38 = defaultedMap34.put((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        java.lang.Object obj39 = defaultedMap27.remove((java.lang.Object) defaultedMap34);
        java.lang.Object obj40 = defaultedMap16.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str43 = defaultedMap42.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator49, predicate52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        filterIterator53.setIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate60);
        java.lang.Object obj62 = defaultedMap47.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator53);
        defaultedMap42.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection64 = defaultedMap47.values();
        java.lang.Object obj65 = defaultedMap1.put(obj40, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set67 = defaultedMap66.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set67);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str16 = defaultedMap15.toString();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (short) -1);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap15.containsKey(obj21);
        defaultedMap15.clear();
        java.lang.Object obj24 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str28 = defaultedMap27.toString();
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) 0, (java.lang.Object) str28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator3, predicate6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator7);
        java.util.Iterator iterator17 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator26, predicate29);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        filterIterator30.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate37);
        java.lang.Object obj39 = defaultedMap24.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator30);
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator42, predicate45);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        filterIterator46.setIterator((java.util.Iterator) filterIterator49);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator53, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate64);
        filterIterator46.setPredicate(predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate41, predicate64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator17, predicate64);
        collections.Predicate predicate69 = filterIterator68.getPredicate();
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate69);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator3 = null;
        collections.Predicate predicate4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3, predicate4);
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator3, predicate6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator7);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator8, predicate11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate19);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator12);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set23 = defaultedMap6.keySet();
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator24, predicate27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = null;
        filterIterator31.setPredicate(predicate32);
        filterIterator28.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate35);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator37, predicate40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = null;
        filterIterator44.setPredicate(predicate45);
        filterIterator41.setIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator48, predicate51);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = null;
        filterIterator55.setPredicate(predicate56);
        filterIterator52.setIterator((java.util.Iterator) filterIterator55);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate59);
        filterIterator41.setPredicate(predicate59);
        filterIterator28.setPredicate(predicate59);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str68 = defaultedMap67.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator74 = null;
        collections.Predicate predicate75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator74, predicate75);
        collections.Predicate predicate77 = null;
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator74, predicate77);
        java.util.Iterator iterator79 = null;
        collections.Predicate predicate80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator79, predicate80);
        collections.Predicate predicate82 = null;
        filterIterator81.setPredicate(predicate82);
        filterIterator78.setIterator((java.util.Iterator) filterIterator81);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78, predicate85);
        java.lang.Object obj87 = defaultedMap72.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator78);
        defaultedMap67.putAll((java.util.Map) defaultedMap72);
        java.util.Set set89 = defaultedMap72.entrySet();
        java.lang.Object obj90 = defaultedMap65.get((java.lang.Object) defaultedMap72);
        java.util.Collection collection91 = defaultedMap72.values();
        java.util.Collection collection92 = defaultedMap72.values();
        java.util.Set set93 = defaultedMap72.keySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap72);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0.0d + "'", obj90.equals(0.0d));
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNotNull(set93);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate16);
        java.lang.Object obj18 = defaultedMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator9);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator25, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator29);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap23);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str41 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b44 = defaultedMap43.isEmpty();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (byte) 100);
        defaultedMap23.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str50 = defaultedMap49.toString();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator56, predicate59);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = null;
        filterIterator63.setPredicate(predicate64);
        filterIterator60.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate67);
        java.lang.Object obj69 = defaultedMap54.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator60);
        defaultedMap49.putAll((java.util.Map) defaultedMap54);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator72 = null;
        collections.Predicate predicate73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator72, predicate73);
        collections.Predicate predicate75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator72, predicate75);
        java.util.Iterator iterator77 = null;
        collections.Predicate predicate78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = null;
        filterIterator79.setPredicate(predicate80);
        filterIterator76.setIterator((java.util.Iterator) filterIterator79);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        collections.Predicate predicate86 = null;
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator83, predicate86);
        java.util.Iterator iterator88 = null;
        collections.Predicate predicate89 = null;
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator(iterator88, predicate89);
        collections.Predicate predicate91 = null;
        filterIterator90.setPredicate(predicate91);
        filterIterator87.setIterator((java.util.Iterator) filterIterator90);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator87, predicate94);
        filterIterator76.setPredicate(predicate94);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate71, predicate94);
        java.lang.String str98 = defaultedMap49.toString();
        boolean b99 = defaultedMap43.equals((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator2.setPredicate(predicate4);
        try {
            java.lang.Object obj6 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator4, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate15);
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator20, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator36, predicate39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        filterIterator40.setIterator((java.util.Iterator) filterIterator43);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate47);
        java.lang.Object obj49 = defaultedMap34.put((java.lang.Object) (byte) 10, (java.lang.Object) filterIterator40);
        filterIterator24.setIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.Predicate predicate54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator51, predicate54);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = null;
        filterIterator58.setPredicate(predicate59);
        filterIterator55.setIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map18, predicate19, predicate62);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map65);
    }
}

