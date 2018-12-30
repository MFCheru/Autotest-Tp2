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
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        try {
            boolean b3 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
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
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) true);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 100 + "'", obj6.equals((byte) 100));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        try {
            java.lang.Object obj3 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) (-1));
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.equals(obj8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            boolean b2 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        try {
            boolean b13 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.lang.String str8 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        try {
            filterIterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator12, predicate17);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate17);
        java.util.Map map21 = null;
        try {
            defaultedMap1.putAll(map21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) true);
        defaultedMap1.clear();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 100 + "'", obj6.equals((byte) 100));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            boolean b3 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        boolean b7 = defaultedMap4.equals((java.lang.Object) predicate6);
        java.util.Set set8 = defaultedMap4.entrySet();
        java.util.Set set9 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator15, predicate20);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate20);
        filterIterator0.setPredicate(predicate12);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        try {
            java.lang.Object obj8 = filterIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator12 = filterIterator6.getIterator();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) filterIterator7);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate13);
        java.util.Collection collection17 = defaultedMap6.values();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate16);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator13 = filterIterator10.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(iterator13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 10);
        java.util.Collection collection8 = defaultedMap5.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 100 + "'", obj9.equals((byte) 100));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate6);
        collections.Predicate predicate8 = filterIterator2.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) filterIterator7);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate13);
        java.lang.String str17 = defaultedMap6.toString();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        boolean b11 = defaultedMap8.equals((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) true);
        defaultedMap8.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 100 + "'", obj13.equals((byte) 100));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        boolean b7 = defaultedMap6.isEmpty();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        filterIterator3.setPredicate(predicate7);
        filterIterator0.setPredicate(predicate7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str5 = defaultedMap4.toString();
        int i6 = defaultedMap4.size();
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        boolean b13 = defaultedMap10.equals((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap10.entrySet();
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator21, predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate26);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) map29);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 100 + "'", obj30.equals((byte) 100));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        boolean b7 = defaultedMap4.equals((java.lang.Object) predicate6);
        java.util.Set set8 = defaultedMap4.entrySet();
        java.util.Set set9 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator15, predicate20);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate20);
        filterIterator0.setPredicate(predicate12);
        java.util.Iterator iterator25 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(iterator25);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        try {
            java.lang.Object obj4 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate35);
        boolean b37 = defaultedMap25.containsValue((java.lang.Object) predicate35);
        boolean b38 = defaultedMap16.equals((java.lang.Object) predicate35);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator5.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate9);
        try {
            java.lang.Object obj13 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        boolean b14 = defaultedMap11.equals((java.lang.Object) predicate13);
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) true);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        filterIterator17.setPredicate(predicate21);
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate21, predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map25);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap3.containsKey((java.lang.Object) 100);
        java.lang.String str9 = defaultedMap3.toString();
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) 100L);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap8.remove((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator15.setPredicate(predicate19);
        collections.Predicate predicate22 = filterIterator15.getPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate25);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0d + "'", obj10.equals(10.0d));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        filterIterator0.setPredicate(predicate2);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate35);
        boolean b37 = defaultedMap25.containsValue((java.lang.Object) predicate35);
        boolean b38 = defaultedMap16.equals((java.lang.Object) predicate35);
        java.lang.String str39 = defaultedMap16.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate19);
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        filterIterator0.setIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate28);
        filterIterator0.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str26 = defaultedMap25.toString();
        java.util.Set set27 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        boolean b32 = defaultedMap29.equals((java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap29.values();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap25, (java.lang.Object) filterIterator40);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator5, predicate10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) iterator20);
        java.lang.Object obj22 = defaultedMap4.put((java.lang.Object) predicate10, (java.lang.Object) iterator20);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) predicate11);
        boolean b14 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        int i20 = defaultedMap13.size();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate5);
        try {
            java.lang.Object obj7 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        boolean b16 = defaultedMap13.equals((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) true);
        defaultedMap13.clear();
        java.util.Set set20 = defaultedMap13.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator8);
        try {
            java.lang.Object obj12 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        boolean b19 = defaultedMap16.equals((java.lang.Object) predicate18);
        java.util.Set set20 = defaultedMap16.entrySet();
        java.util.Set set21 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b24 = defaultedMap16.containsKey((java.lang.Object) defaultedMap23);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str27 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 100 + "'", obj26.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap11.equals((java.lang.Object) '4');
        defaultedMap11.clear();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        filterIterator20.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate24);
        boolean b28 = defaultedMap11.containsValue((java.lang.Object) filterIterator19);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) filterIterator19);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 100 + "'", obj29.equals((byte) 100));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.equals((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 0.0f);
        defaultedMap23.clear();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = filterIterator37.getPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator37.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator36, predicate41);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        filterIterator35.setIterator((java.util.Iterator) filterIterator43);
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) defaultedMap23, (java.lang.Object) filterIterator43);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator6, predicate11);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator13);
        try {
            boolean b16 = filterIterator5.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(iterator14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap3.containsKey((java.lang.Object) 100);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) predicate11);
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str5 = defaultedMap4.toString();
        int i6 = defaultedMap4.size();
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        boolean b16 = defaultedMap13.equals((java.lang.Object) predicate15);
        java.util.Collection collection17 = defaultedMap13.values();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) filterIterator18);
        java.lang.String str20 = defaultedMap13.toString();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate(map8, predicate10, predicate28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 100 + "'", obj19.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator9, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        boolean b24 = defaultedMap21.equals((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap21.entrySet();
        java.util.Set set26 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator32, predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate37);
        filterIterator17.setPredicate(predicate29);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate14, predicate29);
        java.lang.String str43 = defaultedMap3.toString();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) ' ');
        boolean b17 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap26.keySet();
        java.lang.Object obj31 = defaultedMap26.remove((java.lang.Object) 100.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap26);
        defaultedMap11.putAll((java.util.Map) defaultedMap26);
        int i34 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object obj38 = defaultedMap26.remove((java.lang.Object) collection37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate41);
        boolean b43 = defaultedMap26.containsValue((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10.0d + "'", obj28.equals(10.0d));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        filterIterator11.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        filterIterator19.setPredicate(predicate23);
        filterIterator16.setPredicate(predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate30);
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator33);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        boolean b16 = defaultedMap13.equals((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) true);
        defaultedMap13.clear();
        java.util.Set set20 = defaultedMap13.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        int i22 = defaultedMap13.size();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setPredicate(predicate11);
        collections.Predicate predicate14 = filterIterator7.getPredicate();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator26.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator24, predicate28);
        filterIterator19.setPredicate(predicate28);
        collections.Predicate predicate32 = filterIterator19.getPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate32);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator12);
        java.util.Iterator iterator15 = filterIterator12.getIterator();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10.0d + "'", obj14.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap5.entrySet();
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) defaultedMap5);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator11, predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        boolean b26 = defaultedMap23.equals((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Set set28 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = filterIterator35.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator34, predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate39);
        filterIterator19.setPredicate(predicate31);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate31);
        boolean b45 = defaultedMap1.containsValue((java.lang.Object) predicate31);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 100 + "'", obj10.equals((byte) 100));
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        boolean b12 = defaultedMap9.equals((java.lang.Object) predicate11);
        java.util.Collection collection13 = defaultedMap9.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) filterIterator14);
        int i16 = defaultedMap9.size();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) (short) -1);
        java.lang.String str19 = defaultedMap9.toString();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) str19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        boolean b32 = defaultedMap29.equals((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap29.entrySet();
        java.util.Set set34 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b37 = defaultedMap29.containsKey((java.lang.Object) defaultedMap36);
        defaultedMap22.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        boolean b43 = defaultedMap40.equals((java.lang.Object) predicate42);
        java.util.Set set44 = defaultedMap40.entrySet();
        java.util.Set set45 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = filterIterator52.getPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        filterIterator52.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator51, predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate48, predicate56);
        boolean b60 = defaultedMap36.containsKey((java.lang.Object) predicate56);
        boolean b61 = defaultedMap1.containsKey((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        boolean b7 = defaultedMap4.equals((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap4.values();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) filterIterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        filterIterator9.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        filterIterator2.setIterator((java.util.Iterator) filterIterator12);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 100 + "'", obj10.equals((byte) 100));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.equals(obj8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap12.equals(obj19);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        int i22 = defaultedMap12.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate15);
        filterIterator6.setPredicate(predicate15);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        try {
            boolean b5 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate13 = filterIterator10.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(predicate13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str4 = defaultedMap3.toString();
        int i5 = defaultedMap3.size();
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Set set7 = defaultedMap3.keySet();
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setPredicate(predicate11);
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        boolean b20 = defaultedMap17.equals((java.lang.Object) predicate19);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) filterIterator22);
        int i24 = defaultedMap17.size();
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 100 + "'", obj23.equals((byte) 100));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 100 + "'", obj26.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator0, predicate5);
        try {
            boolean b8 = filterIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate6);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) filterIterator7);
        defaultedMap1.clear();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap1.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 10.0d + "'", obj12.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator12, predicate17);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate17);
        java.lang.String str21 = defaultedMap1.toString();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 1.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator12, predicate17);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate17);
        boolean b21 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str9 = defaultedMap8.toString();
        int i10 = defaultedMap8.size();
        boolean b11 = defaultedMap8.isEmpty();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        int i14 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str17 = defaultedMap16.toString();
        int i18 = defaultedMap16.size();
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        boolean b21 = defaultedMap3.equals((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 1.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj12 = defaultedMap7.remove((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator19, predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate24);
        filterIterator8.setPredicate(predicate24);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) predicate11);
        boolean b14 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str17 = defaultedMap16.toString();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) set18);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str9 = defaultedMap8.toString();
        int i10 = defaultedMap8.size();
        boolean b11 = defaultedMap8.isEmpty();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b20 = defaultedMap15.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate25);
        boolean b27 = defaultedMap15.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        boolean b32 = defaultedMap29.equals((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap29.entrySet();
        java.util.Set set34 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b37 = defaultedMap29.containsKey((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap15.get((java.lang.Object) defaultedMap29);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        java.util.Set set40 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 100 + "'", obj38.equals((byte) 100));
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate14);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator9);
        collections.Predicate predicate19 = filterIterator9.getPredicate();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(predicate19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator6, predicate11);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        filterIterator5.setIterator((java.util.Iterator) filterIterator13);
        try {
            java.lang.Object obj16 = filterIterator5.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(iterator14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 1.0f);
        int i6 = defaultedMap3.size();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 100);
        java.lang.String str15 = defaultedMap9.toString();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) str15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator17.setPredicate(predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        boolean b25 = defaultedMap22.equals((java.lang.Object) predicate24);
        java.util.Collection collection26 = defaultedMap22.values();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) filterIterator27);
        filterIterator17.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        boolean b36 = defaultedMap33.equals((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap33.entrySet();
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) defaultedMap33);
        java.util.Collection collection39 = defaultedMap31.values();
        int i40 = defaultedMap31.size();
        int i41 = defaultedMap31.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b48 = defaultedMap43.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        filterIterator49.setPredicate(predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate53);
        boolean b55 = defaultedMap43.containsValue((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = filterIterator58.getPredicate();
        boolean b60 = defaultedMap57.equals((java.lang.Object) predicate59);
        java.util.Set set61 = defaultedMap57.entrySet();
        java.util.Set set62 = defaultedMap57.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b65 = defaultedMap57.containsKey((java.lang.Object) defaultedMap64);
        java.lang.Object obj66 = defaultedMap43.get((java.lang.Object) defaultedMap57);
        java.lang.String str67 = defaultedMap43.toString();
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        collections.Predicate predicate70 = filterIterator69.getPredicate();
        collections.Predicate predicate71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        filterIterator69.setPredicate(predicate73);
        java.lang.Object obj75 = defaultedMap31.put((java.lang.Object) defaultedMap43, (java.lang.Object) predicate73);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate73);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = filterIterator77.getPredicate();
        collections.Predicate predicate79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.Predicate predicate83 = filterIterator82.getPredicate();
        java.util.Iterator iterator84 = filterIterator82.getIterator();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        filterIterator85.setPredicate(predicate86);
        filterIterator82.setPredicate(predicate86);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81, predicate86);
        java.lang.Object obj90 = defaultedMap1.put((java.lang.Object) filterIterator27, (java.lang.Object) filterIterator81);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 100 + "'", obj16.equals((byte) 100));
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 100 + "'", obj28.equals((byte) 100));
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 100 + "'", obj38.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (byte) 100 + "'", obj66.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(predicate70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(predicate78);
        org.junit.Assert.assertNull(predicate83);
        org.junit.Assert.assertNull(iterator84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str9 = defaultedMap8.toString();
        int i10 = defaultedMap8.size();
        boolean b11 = defaultedMap8.isEmpty();
        java.util.Set set12 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        java.lang.String str14 = defaultedMap8.toString();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) iterator7);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) ' ');
        boolean b11 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.util.Set set23 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) 100.0f);
        defaultedMap13.putAll((java.util.Map) defaultedMap20);
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        int i28 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj32 = defaultedMap20.remove((java.lang.Object) collection31);
        defaultedMap20.clear();
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d + "'", obj3.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0d + "'", obj22.equals(10.0d));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 10.0d + "'", obj34.equals(10.0d));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap8.remove((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        boolean b19 = defaultedMap8.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        boolean b26 = defaultedMap23.equals((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) defaultedMap23);
        java.util.Collection collection29 = defaultedMap21.values();
        int i30 = defaultedMap21.size();
        int i31 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate43);
        boolean b45 = defaultedMap33.containsValue((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = filterIterator48.getPredicate();
        boolean b50 = defaultedMap47.equals((java.lang.Object) predicate49);
        java.util.Set set51 = defaultedMap47.entrySet();
        java.util.Set set52 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b55 = defaultedMap47.containsKey((java.lang.Object) defaultedMap54);
        java.lang.Object obj56 = defaultedMap33.get((java.lang.Object) defaultedMap47);
        java.lang.String str57 = defaultedMap33.toString();
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.Predicate predicate60 = filterIterator59.getPredicate();
        collections.Predicate predicate61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator59.setPredicate(predicate63);
        java.lang.Object obj65 = defaultedMap21.put((java.lang.Object) defaultedMap33, (java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        java.lang.Object obj67 = defaultedMap8.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0d + "'", obj10.equals(10.0d));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 100 + "'", obj28.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 10.0d + "'", obj67.equals(10.0d));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap8.remove((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        boolean b19 = defaultedMap8.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str22 = defaultedMap21.toString();
        int i23 = defaultedMap21.size();
        boolean b24 = defaultedMap21.isEmpty();
        java.util.Set set25 = defaultedMap21.keySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection27 = defaultedMap21.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0d + "'", obj10.equals(10.0d));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator9, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        boolean b24 = defaultedMap21.equals((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap21.entrySet();
        java.util.Set set26 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator32, predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate37);
        filterIterator17.setPredicate(predicate29);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate14, predicate29);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 100.0f);
        java.util.Set set47 = defaultedMap44.keySet();
        java.lang.Object obj49 = defaultedMap44.remove((java.lang.Object) 100.0f);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        filterIterator50.setPredicate(predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = filterIterator56.getPredicate();
        java.util.Iterator iterator58 = filterIterator56.getIterator();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = filterIterator61.getPredicate();
        boolean b63 = defaultedMap60.equals((java.lang.Object) predicate62);
        java.util.Set set64 = defaultedMap60.entrySet();
        java.util.Set set65 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        java.util.Iterator iterator71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = filterIterator72.getPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        filterIterator72.setPredicate(predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator71, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate68, predicate76);
        filterIterator56.setPredicate(predicate68);
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map42, predicate53, predicate68);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 10.0d + "'", obj46.equals(10.0d));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) filterIterator12);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        boolean b29 = defaultedMap26.equals((java.lang.Object) predicate28);
        java.util.Set set30 = defaultedMap26.entrySet();
        java.util.Set set31 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator37, predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate42);
        filterIterator22.setPredicate(predicate34);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate34);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        boolean b9 = defaultedMap6.equals((java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) filterIterator11);
        java.lang.String str13 = defaultedMap6.toString();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator17.setPredicate(predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate15, predicate21);
        java.util.Collection collection24 = defaultedMap6.values();
        boolean b25 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        java.lang.Object obj30 = defaultedMap27.get((java.lang.Object) predicate29);
        boolean b31 = defaultedMap27.isEmpty();
        java.util.Set set32 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1L));
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = filterIterator40.getPredicate();
        boolean b42 = defaultedMap39.equals((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) true);
        defaultedMap39.clear();
        java.util.Set set46 = defaultedMap39.entrySet();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap39);
        java.lang.Object obj48 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj49 = defaultedMap1.remove((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 100 + "'", obj12.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 100 + "'", obj30.equals((byte) 100));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (byte) 100 + "'", obj44.equals((byte) 100));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        filterIterator7.setPredicate(predicate11);
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate14);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str26 = defaultedMap25.toString();
        java.util.Set set27 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        boolean b32 = defaultedMap29.equals((java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap29.values();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap25, (java.lang.Object) filterIterator40);
        java.util.Collection collection42 = defaultedMap25.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate35);
        boolean b37 = defaultedMap25.containsValue((java.lang.Object) predicate35);
        boolean b38 = defaultedMap16.equals((java.lang.Object) predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = filterIterator42.getPredicate();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        filterIterator45.setPredicate(predicate46);
        filterIterator42.setPredicate(predicate46);
        filterIterator39.setPredicate(predicate46);
        java.util.Iterator iterator50 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate61);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) filterIterator57);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = filterIterator64.getPredicate();
        boolean b66 = defaultedMap63.containsKey((java.lang.Object) filterIterator64);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate67, predicate70);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate54, predicate67);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) map74);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        boolean b15 = defaultedMap12.equals((java.lang.Object) predicate14);
        java.util.Set set16 = defaultedMap12.entrySet();
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) defaultedMap12);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) 100 + "'", obj17.equals((byte) 100));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) ' ');
        boolean b14 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.keySet();
        java.lang.Object obj28 = defaultedMap23.remove((java.lang.Object) 100.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = filterIterator37.getPredicate();
        boolean b39 = defaultedMap36.equals((java.lang.Object) predicate38);
        java.util.Collection collection40 = defaultedMap36.values();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator41);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        filterIterator41.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.lang.Object obj48 = defaultedMap8.put((java.lang.Object) defaultedMap32, (java.lang.Object) filterIterator47);
        filterIterator2.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate50 = filterIterator2.getPredicate();
        collections.Predicate predicate51 = filterIterator2.getPredicate();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10.0d + "'", obj25.equals(10.0d));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 100 + "'", obj42.equals((byte) 100));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate4);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setPredicate(predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate23);
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        filterIterator26.setPredicate(predicate32);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate16);
        filterIterator12.setPredicate(predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate23);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator27, predicate31);
        filterIterator26.setPredicate(predicate31);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) predicate11);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator14, predicate19);
        boolean b22 = defaultedMap1.equals((java.lang.Object) predicate19);
        java.util.Set set23 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator9 = filterIterator5.getIterator();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(iterator9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) filterIterator22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) ' ');
        boolean b34 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 100.0f);
        java.util.Set set46 = defaultedMap43.keySet();
        java.lang.Object obj48 = defaultedMap43.remove((java.lang.Object) 100.0f);
        defaultedMap36.putAll((java.util.Map) defaultedMap43);
        defaultedMap28.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str53 = defaultedMap52.toString();
        java.util.Set set54 = defaultedMap52.entrySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        boolean b59 = defaultedMap56.equals((java.lang.Object) predicate58);
        java.util.Collection collection60 = defaultedMap56.values();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        java.lang.Object obj62 = defaultedMap56.get((java.lang.Object) filterIterator61);
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        filterIterator61.setIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        java.lang.Object obj68 = defaultedMap28.put((java.lang.Object) defaultedMap52, (java.lang.Object) filterIterator67);
        filterIterator22.setIterator((java.util.Iterator) filterIterator67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator67);
        try {
            boolean b71 = filterIterator67.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0d + "'", obj45.equals(10.0d));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (byte) 100 + "'", obj62.equals((byte) 100));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.equals((java.lang.Object) false);
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        boolean b12 = defaultedMap9.equals((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap9.entrySet();
        java.util.Set set14 = defaultedMap9.entrySet();
        boolean b15 = defaultedMap7.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str18 = defaultedMap17.toString();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj21 = defaultedMap1.put((java.lang.Object) b15, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        boolean b31 = defaultedMap28.equals((java.lang.Object) predicate30);
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) true);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = filterIterator35.getPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 1.0f);
        java.util.Set set40 = defaultedMap37.entrySet();
        boolean b42 = defaultedMap37.equals((java.lang.Object) 1L);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) b42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = filterIterator46.getPredicate();
        boolean b48 = defaultedMap45.equals((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) true);
        defaultedMap45.clear();
        boolean b52 = defaultedMap28.containsValue((java.lang.Object) defaultedMap45);
        java.lang.Object obj53 = defaultedMap23.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = filterIterator56.getPredicate();
        boolean b58 = defaultedMap55.equals((java.lang.Object) predicate57);
        java.lang.Object obj60 = defaultedMap55.get((java.lang.Object) true);
        defaultedMap55.clear();
        java.util.Collection collection62 = defaultedMap55.values();
        java.lang.Object obj63 = defaultedMap1.put(obj53, (java.lang.Object) collection62);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 100 + "'", obj26.equals((byte) 100));
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 100 + "'", obj43.equals((byte) 100));
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) 100 + "'", obj53.equals((byte) 100));
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 100 + "'", obj60.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) filterIterator22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10.0d + "'", obj24.equals(10.0d));
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap5.entrySet();
        java.util.Set set10 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator17.setPredicate(predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator16, predicate21);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate13, predicate21);
        boolean b25 = defaultedMap3.containsValue((java.lang.Object) defaultedMap5);
        java.util.Collection collection26 = defaultedMap3.values();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.equals(obj8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap12.equals(obj19);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection22 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        boolean b31 = defaultedMap28.equals((java.lang.Object) predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) filterIterator33);
        filterIterator23.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = filterIterator36.getPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator36.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) filterIterator43);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate49);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) filterIterator53);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 100 + "'", obj54.equals((byte) 100));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        filterIterator3.setPredicate(predicate7);
        filterIterator0.setPredicate(predicate7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = null;
        filterIterator17.setPredicate(predicate19);
        filterIterator16.setIterator((java.util.Iterator) filterIterator17);
        try {
            boolean b22 = filterIterator17.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(predicate18);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator26.setPredicate(predicate28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        java.util.Set set33 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap9);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) predicate19);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate16);
        java.util.Collection collection19 = defaultedMap1.values();
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) predicate24);
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Set set27 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1L));
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = filterIterator35.getPredicate();
        boolean b37 = defaultedMap34.equals((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) true);
        defaultedMap34.clear();
        java.util.Set set41 = defaultedMap34.entrySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap34);
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) defaultedMap22);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.Predicate predicate46 = filterIterator45.getPredicate();
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator49.setPredicate(predicate50);
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = filterIterator56.getPredicate();
        java.util.Iterator iterator58 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        filterIterator59.setPredicate(predicate60);
        filterIterator56.setPredicate(predicate60);
        filterIterator53.setPredicate(predicate60);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate67);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate67);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 100.0f);
        java.util.Set set75 = defaultedMap72.keySet();
        java.lang.Object obj77 = defaultedMap72.remove((java.lang.Object) 100.0f);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate81);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) predicate81);
        filterIterator70.setPredicate(predicate81);
        java.lang.Object obj85 = defaultedMap1.get((java.lang.Object) predicate81);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 100 + "'", obj25.equals((byte) 100));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 100 + "'", obj39.equals((byte) 100));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 10.0d + "'", obj74.equals(10.0d));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (byte) 100 + "'", obj85.equals((byte) 100));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        boolean b9 = defaultedMap6.equals((java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) filterIterator11);
        java.lang.String str13 = defaultedMap6.toString();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator17.setPredicate(predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate15, predicate21);
        java.util.Collection collection24 = defaultedMap6.values();
        boolean b25 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 100 + "'", obj12.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        boolean b18 = defaultedMap15.equals((java.lang.Object) predicate17);
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Set set20 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b23 = defaultedMap15.containsKey((java.lang.Object) defaultedMap22);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.String str25 = defaultedMap1.toString();
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 100 + "'", obj24.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Collection collection9 = defaultedMap1.values();
        int i10 = defaultedMap1.size();
        int i11 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b25 = defaultedMap13.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        boolean b30 = defaultedMap27.equals((java.lang.Object) predicate29);
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Set set32 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b35 = defaultedMap27.containsKey((java.lang.Object) defaultedMap34);
        java.lang.Object obj36 = defaultedMap13.get((java.lang.Object) defaultedMap27);
        java.lang.String str37 = defaultedMap13.toString();
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate43);
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) predicate43);
        boolean b47 = defaultedMap13.containsValue((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) filterIterator7);
        java.lang.String str10 = defaultedMap6.toString();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) true);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator6, predicate11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate11);
        try {
            java.lang.Object obj15 = filterIterator14.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 10.0d + "'", obj12.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 100 + "'", obj13.equals((byte) 100));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str4 = defaultedMap3.toString();
        int i5 = defaultedMap3.size();
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Set set7 = defaultedMap3.keySet();
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        boolean b15 = defaultedMap12.equals((java.lang.Object) predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        filterIterator24.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate28);
        filterIterator17.setIterator((java.util.Iterator) filterIterator23);
        java.lang.Object obj33 = defaultedMap3.remove((java.lang.Object) filterIterator23);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate27);
        java.lang.Object obj31 = defaultedMap16.get((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10.0d + "'", obj31.equals(10.0d));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        int i24 = defaultedMap16.size();
        defaultedMap16.clear();
        defaultedMap16.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 1.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str4 = defaultedMap3.toString();
        int i5 = defaultedMap3.size();
        boolean b6 = defaultedMap3.isEmpty();
        java.util.Set set7 = defaultedMap3.keySet();
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str26 = defaultedMap25.toString();
        java.util.Set set27 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        boolean b32 = defaultedMap29.equals((java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap29.values();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap25, (java.lang.Object) filterIterator40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b48 = defaultedMap43.containsValue((java.lang.Object) ' ');
        boolean b49 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        boolean b56 = defaultedMap51.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 100.0f);
        java.util.Set set61 = defaultedMap58.keySet();
        java.lang.Object obj63 = defaultedMap58.remove((java.lang.Object) 100.0f);
        defaultedMap51.putAll((java.util.Map) defaultedMap58);
        defaultedMap43.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str68 = defaultedMap67.toString();
        java.util.Set set69 = defaultedMap67.entrySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = filterIterator72.getPredicate();
        boolean b74 = defaultedMap71.equals((java.lang.Object) predicate73);
        java.util.Collection collection75 = defaultedMap71.values();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        java.lang.Object obj77 = defaultedMap71.get((java.lang.Object) filterIterator76);
        java.util.Iterator iterator78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        filterIterator76.setIterator((java.util.Iterator) filterIterator79);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        java.lang.Object obj83 = defaultedMap43.put((java.lang.Object) defaultedMap67, (java.lang.Object) filterIterator82);
        java.lang.Object obj84 = defaultedMap25.get((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 10.0d + "'", obj60.equals(10.0d));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (byte) 100 + "'", obj77.equals((byte) 100));
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) 100 + "'", obj84.equals((byte) 100));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        boolean b16 = defaultedMap13.equals((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) true);
        defaultedMap13.clear();
        java.util.Set set20 = defaultedMap13.entrySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        java.lang.String str22 = defaultedMap1.toString();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) filterIterator20);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate26);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b37 = defaultedMap32.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = filterIterator40.getPredicate();
        boolean b42 = defaultedMap39.equals((java.lang.Object) predicate41);
        java.util.Set set43 = defaultedMap39.entrySet();
        java.util.Set set44 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b47 = defaultedMap39.containsKey((java.lang.Object) defaultedMap46);
        defaultedMap32.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        boolean b53 = defaultedMap50.equals((java.lang.Object) predicate52);
        java.util.Set set54 = defaultedMap50.entrySet();
        java.util.Set set55 = defaultedMap50.entrySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = filterIterator62.getPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator61, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate66);
        boolean b70 = defaultedMap46.containsKey((java.lang.Object) predicate66);
        filterIterator30.setPredicate(predicate66);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator11.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator9, predicate13);
        filterIterator4.setPredicate(predicate13);
        collections.Predicate predicate17 = filterIterator4.getPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        boolean b24 = defaultedMap19.containsValue((java.lang.Object) ' ');
        boolean b25 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 100.0f);
        java.util.Set set37 = defaultedMap34.keySet();
        java.lang.Object obj39 = defaultedMap34.remove((java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        defaultedMap19.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate45);
        filterIterator4.setPredicate(predicate45);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 10.0d + "'", obj36.equals(10.0d));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 10);
        boolean b9 = defaultedMap1.equals(obj8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 10);
        boolean b20 = defaultedMap12.equals(obj19);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        boolean b22 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate6);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator9, predicate14);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) predicate14);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        defaultedMap1.clear();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate18);
        boolean b20 = defaultedMap8.containsValue((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        boolean b25 = defaultedMap22.equals((java.lang.Object) predicate24);
        java.util.Set set26 = defaultedMap22.entrySet();
        java.util.Set set27 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) defaultedMap22);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = filterIterator35.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate39);
        collections.Predicate predicate41 = filterIterator35.getPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        filterIterator44.setPredicate(predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate48);
        collections.Predicate predicate50 = filterIterator44.getPredicate();
        filterIterator43.setPredicate(predicate50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        boolean b58 = defaultedMap53.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = filterIterator61.getPredicate();
        boolean b63 = defaultedMap60.equals((java.lang.Object) predicate62);
        java.util.Set set64 = defaultedMap60.entrySet();
        java.util.Set set65 = defaultedMap60.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b68 = defaultedMap60.containsKey((java.lang.Object) defaultedMap67);
        defaultedMap53.putAll((java.util.Map) defaultedMap67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = filterIterator72.getPredicate();
        boolean b74 = defaultedMap71.equals((java.lang.Object) predicate73);
        java.util.Set set75 = defaultedMap71.entrySet();
        java.util.Set set76 = defaultedMap71.entrySet();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = filterIterator83.getPredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        filterIterator83.setPredicate(predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator82, predicate87);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate79, predicate87);
        boolean b91 = defaultedMap67.containsKey((java.lang.Object) predicate87);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate50, predicate87);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap5.equals((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        java.util.Set set11 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b25 = defaultedMap13.containsValue((java.lang.Object) predicate23);
        boolean b26 = defaultedMap13.isEmpty();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) filterIterator12);
        try {
            java.lang.Object obj15 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10.0d + "'", obj14.equals(10.0d));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate4);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator2);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) ' ');
        boolean b14 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.keySet();
        java.lang.Object obj28 = defaultedMap23.remove((java.lang.Object) 100.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = filterIterator37.getPredicate();
        boolean b39 = defaultedMap36.equals((java.lang.Object) predicate38);
        java.util.Collection collection40 = defaultedMap36.values();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator41);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        filterIterator41.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.lang.Object obj48 = defaultedMap8.put((java.lang.Object) defaultedMap32, (java.lang.Object) filterIterator47);
        filterIterator2.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10.0d + "'", obj25.equals(10.0d));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) 100 + "'", obj42.equals((byte) 100));
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = filterIterator5.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        boolean b12 = defaultedMap9.equals((java.lang.Object) predicate11);
        java.util.Collection collection13 = defaultedMap9.values();
        java.util.Set set14 = defaultedMap9.keySet();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 1.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap10.equals((java.lang.Object) 1L);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) b15);
        java.lang.String str17 = defaultedMap1.toString();
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 100 + "'", obj16.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        boolean b12 = defaultedMap9.equals((java.lang.Object) predicate11);
        java.util.Collection collection13 = defaultedMap9.values();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) filterIterator14);
        int i16 = defaultedMap9.size();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) (short) -1);
        java.lang.String str19 = defaultedMap9.toString();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) str19);
        java.util.Set set21 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte) 100 + "'", obj4.equals((byte) 100));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        boolean b6 = defaultedMap3.equals((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap3.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator9, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        boolean b24 = defaultedMap21.equals((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap21.entrySet();
        java.util.Set set26 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator32, predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate37);
        filterIterator17.setPredicate(predicate29);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate14, predicate29);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) 0.0f);
        java.lang.String str50 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b54 = defaultedMap52.equals((java.lang.Object) '4');
        defaultedMap44.putAll((java.util.Map) defaultedMap52);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = filterIterator56.getPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate60);
        collections.Predicate predicate62 = filterIterator56.getPredicate();
        boolean b63 = defaultedMap44.equals((java.lang.Object) predicate62);
        java.util.Iterator iterator64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator64);
        collections.Predicate predicate66 = filterIterator65.getPredicate();
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        filterIterator69.setPredicate(predicate70);
        filterIterator68.setIterator((java.util.Iterator) filterIterator69);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.Predicate predicate77 = filterIterator76.getPredicate();
        java.util.Iterator iterator78 = filterIterator76.getIterator();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        filterIterator79.setPredicate(predicate80);
        filterIterator76.setPredicate(predicate80);
        filterIterator73.setPredicate(predicate80);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate87);
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate87);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate62, predicate87);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(predicate66);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(predicate77);
        org.junit.Assert.assertNull(iterator78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        filterIterator10.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate14);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) filterIterator9);
        int i19 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) 0L);
        java.util.Set set7 = defaultedMap3.keySet();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '4');
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        boolean b4 = defaultedMap1.equals((java.lang.Object) predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate17);
        filterIterator6.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 1.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.lang.Object obj12 = defaultedMap7.remove((java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator15);
        java.lang.Object obj20 = defaultedMap7.get((java.lang.Object) filterIterator15);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        boolean b8 = defaultedMap5.equals((java.lang.Object) predicate7);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator10);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) filterIterator20);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate26);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate26);
        try {
            java.lang.Object obj31 = filterIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }
}

