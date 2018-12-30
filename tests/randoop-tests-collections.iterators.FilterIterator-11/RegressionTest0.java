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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
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
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            java.lang.Object obj2 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) 0L);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj5 = defaultedMap2.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap2.entrySet();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate10, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap2.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set21 = defaultedMap17.entrySet();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        try {
            java.util.Map map29 = collections.map.PredicatedMap.decorate(map0, predicate14, predicate25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.containsValue(obj3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        java.util.Set set21 = defaultedMap15.keySet();
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        try {
            java.lang.Object obj7 = filterIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj17 = new java.lang.Object();
        boolean b18 = defaultedMap15.containsValue(obj17);
        java.lang.Object obj19 = defaultedMap11.get(obj17);
        boolean b20 = defaultedMap11.isEmpty();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        try {
            java.lang.Object obj4 = filterIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        try {
            boolean b7 = filterIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        try {
            boolean b9 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        java.util.Iterator iterator8 = filterIterator4.getIterator();
        try {
            java.lang.Object obj9 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        try {
            java.lang.Object obj28 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        java.util.Iterator iterator6 = null;
        filterIterator2.setIterator(iterator6);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.containsValue(obj3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.clear();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        java.lang.String str9 = defaultedMap1.toString();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap4.clear();
        java.lang.Object obj7 = defaultedMap4.get((java.lang.Object) (short) 0);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap10.entrySet();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        try {
            java.lang.Object obj28 = filterIterator27.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) defaultedMap24);
        boolean b26 = defaultedMap1.containsKey(obj25);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) 0L);
        java.util.Set set12 = defaultedMap4.keySet();
        defaultedMap4.clear();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        try {
            java.lang.Object obj15 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.clear();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        java.lang.String str9 = defaultedMap3.toString();
        boolean b11 = defaultedMap3.equals((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        defaultedMap3.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj18);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap4.get(obj14);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap7.entrySet();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map19, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) predicate13);
        filterIterator1.setPredicate(predicate13);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.clear();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) 0);
        boolean b14 = defaultedMap3.containsValue((java.lang.Object) defaultedMap10);
        java.util.Collection collection15 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        java.util.Iterator iterator11 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(iterator11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        int i6 = defaultedMap1.size();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        java.util.Iterator iterator14 = filterIterator11.getIterator();
        collections.Predicate predicate15 = filterIterator11.getPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator17 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap19.get((java.lang.Object) (short) 0);
        defaultedMap19.clear();
        java.util.Collection collection24 = defaultedMap19.values();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) iterator17, (java.lang.Object) map26);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1 + "'", obj22.equals(1));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        try {
            filterIterator27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap7.clear();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 0);
        defaultedMap7.clear();
        java.util.Collection collection12 = defaultedMap7.values();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 0L);
        defaultedMap3.putAll(map14);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1 + "'", obj10.equals(1));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate16);
        java.lang.Object obj20 = defaultedMap7.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        java.util.Iterator iterator28 = filterIterator25.getIterator();
        collections.Predicate predicate29 = filterIterator25.getPredicate();
        java.lang.Object obj30 = defaultedMap7.remove((java.lang.Object) filterIterator25);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 10.0f);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap16.entrySet();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate39);
        int i42 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.clear();
        java.lang.Object obj46 = new java.lang.Object();
        boolean b47 = defaultedMap44.containsValue(obj46);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap50.clear();
        int i52 = defaultedMap50.size();
        boolean b53 = defaultedMap1.equals((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap4.clear();
        java.lang.Object obj7 = defaultedMap4.get((java.lang.Object) (short) 0);
        java.lang.String str8 = defaultedMap4.toString();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        java.lang.Object obj16 = defaultedMap4.get((java.lang.Object) filterIterator15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set22 = defaultedMap18.entrySet();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate28);
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap34.clear();
        java.lang.Object obj37 = defaultedMap34.get((java.lang.Object) (short) 0);
        java.lang.String str38 = defaultedMap34.toString();
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate44);
        java.lang.Object obj46 = defaultedMap34.get((java.lang.Object) filterIterator45);
        collections.Predicate predicate47 = filterIterator45.getPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate47);
        filterIterator2.setPredicate(predicate47);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1 + "'", obj16.equals(1));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1 + "'", obj37.equals(1));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1 + "'", obj46.equals(1));
        org.junit.Assert.assertNotNull(predicate47);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) 0);
        defaultedMap10.clear();
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) defaultedMap10);
        java.lang.String str16 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap18.clear();
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap18.containsValue(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b28 = defaultedMap18.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set35 = defaultedMap31.entrySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate39, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj44 = defaultedMap31.get((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate43);
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap48.clear();
        boolean b50 = defaultedMap1.containsValue((java.lang.Object) defaultedMap48);
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        java.lang.String str25 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{1.0=-1.0}" + "'", str25.equals("{1.0=-1.0}"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap9.values();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b14 = defaultedMap9.isEmpty();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) 0L);
        java.util.Collection collection12 = defaultedMap4.values();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate40);
        java.lang.Object obj44 = defaultedMap31.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        java.util.Iterator iterator52 = filterIterator49.getIterator();
        collections.Predicate predicate53 = filterIterator49.getPredicate();
        java.lang.Object obj54 = defaultedMap31.remove((java.lang.Object) filterIterator49);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 10.0f);
        java.util.Set set57 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap59.clear();
        java.lang.Object obj62 = defaultedMap59.get((java.lang.Object) (short) 0);
        java.lang.String str63 = defaultedMap59.toString();
        java.util.Iterator iterator64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator64);
        java.util.Iterator iterator66 = filterIterator65.getIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate69);
        java.lang.Object obj71 = defaultedMap59.get((java.lang.Object) filterIterator70);
        collections.Predicate predicate72 = filterIterator70.getPredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj78 = defaultedMap75.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set79 = defaultedMap75.entrySet();
        java.util.Iterator iterator80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator80);
        java.util.Iterator iterator82 = filterIterator81.getIterator();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate83, predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj88 = defaultedMap75.get((java.lang.Object) predicate87);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate72, predicate87);
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate72);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 1 + "'", obj62.equals(1));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1 + "'", obj71.equals(1));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(iterator82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 1 + "'", obj88.equals(1));
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set10 = defaultedMap6.entrySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set25 = defaultedMap21.entrySet();
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate31);
        java.lang.Object obj33 = defaultedMap6.get((java.lang.Object) predicate31);
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set42 = defaultedMap38.entrySet();
        java.util.Set set43 = defaultedMap38.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap38);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1 + "'", obj33.equals(1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        boolean b5 = defaultedMap3.isEmpty();
        java.util.Collection collection6 = defaultedMap3.values();
        java.util.Set set7 = defaultedMap3.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap9.values();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Collection collection14 = defaultedMap9.values();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap16.entrySet();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate39);
        int i42 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.clear();
        java.lang.Object obj46 = new java.lang.Object();
        boolean b47 = defaultedMap44.containsValue(obj46);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap44);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        defaultedMap1.clear();
        java.util.Set set52 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.clear();
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap14.containsValue(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b24 = defaultedMap14.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj40 = defaultedMap27.get((java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate25, predicate39);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj47 = defaultedMap44.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set48 = defaultedMap44.entrySet();
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate52, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap57.clear();
        java.lang.Object obj59 = new java.lang.Object();
        boolean b60 = defaultedMap57.containsValue(obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap62.clear();
        java.lang.Object obj66 = defaultedMap62.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b67 = defaultedMap57.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj73 = defaultedMap70.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set74 = defaultedMap70.entrySet();
        java.util.Iterator iterator75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator75);
        java.util.Iterator iterator77 = filterIterator76.getIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate78, predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj83 = defaultedMap70.get((java.lang.Object) predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate68, predicate82);
        defaultedMap44.putAll((java.util.Map) defaultedMap57);
        boolean b86 = defaultedMap1.containsKey((java.lang.Object) defaultedMap57);
        int i87 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(iterator77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 1 + "'", obj83.equals(1));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(i87 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) defaultedMap9);
        java.util.Collection collection11 = defaultedMap9.values();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.util.Set set14 = defaultedMap9.keySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap10.entrySet();
        boolean b15 = defaultedMap7.containsKey((java.lang.Object) defaultedMap10);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) 0L);
        int i12 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate23);
        java.lang.Object obj27 = defaultedMap14.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Iterator iterator35 = filterIterator32.getIterator();
        collections.Predicate predicate36 = filterIterator32.getPredicate();
        java.lang.Object obj37 = defaultedMap14.remove((java.lang.Object) filterIterator32);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10.0f);
        java.util.Set set40 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap42.clear();
        java.lang.Object obj45 = defaultedMap42.get((java.lang.Object) (short) 0);
        java.lang.String str46 = defaultedMap42.toString();
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate52);
        java.lang.Object obj54 = defaultedMap42.get((java.lang.Object) filterIterator53);
        collections.Predicate predicate55 = filterIterator53.getPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj61 = defaultedMap58.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set62 = defaultedMap58.entrySet();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate66, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj71 = defaultedMap58.get((java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate55, predicate70);
        java.lang.Object obj73 = defaultedMap4.get((java.lang.Object) map72);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1 + "'", obj45.equals(1));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1 + "'", obj54.equals(1));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1 + "'", obj71.equals(1));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 1 + "'", obj73.equals(1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap7.entrySet();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set25 = defaultedMap21.entrySet();
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) set25);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        try {
            filterIterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        try {
            java.lang.Object obj16 = filterIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        collections.Predicate predicate10 = null;
        filterIterator4.setPredicate(predicate10);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set18 = defaultedMap14.entrySet();
        boolean b19 = defaultedMap11.containsKey((java.lang.Object) defaultedMap14);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) b19);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1 + "'", obj20.equals(1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        filterIterator12.setIterator((java.util.Iterator) filterIterator19);
        try {
            filterIterator19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        collections.Predicate predicate27 = filterIterator23.getPredicate();
        filterIterator17.setPredicate(predicate27);
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        filterIterator34.setIterator((java.util.Iterator) filterIterator41);
        filterIterator12.setIterator((java.util.Iterator) filterIterator41);
        try {
            boolean b44 = filterIterator12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        try {
            boolean b7 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        org.junit.Assert.assertNull(predicate3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set27 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap29.clear();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) (short) 0);
        java.lang.String str33 = defaultedMap29.toString();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        java.lang.Object obj41 = defaultedMap29.get((java.lang.Object) filterIterator40);
        collections.Predicate predicate42 = filterIterator40.getPredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set49 = defaultedMap45.entrySet();
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate53, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj58 = defaultedMap45.get((java.lang.Object) predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate42, predicate57);
        boolean b60 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set62 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1 + "'", obj58.equals(1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set62);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        defaultedMap1.clear();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        collections.Predicate predicate28 = filterIterator12.getPredicate();
        java.util.Iterator iterator29 = filterIterator12.getIterator();
        try {
            filterIterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate29);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate29, predicate32);
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) predicate29);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        java.util.Iterator iterator15 = filterIterator12.getIterator();
        java.util.Iterator iterator16 = filterIterator12.getIterator();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set23 = defaultedMap19.entrySet();
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj32 = defaultedMap19.get((java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set38 = defaultedMap34.entrySet();
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        java.lang.Object obj46 = defaultedMap19.get((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate57);
        int i60 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap62.clear();
        java.lang.Object obj64 = new java.lang.Object();
        boolean b65 = defaultedMap62.containsValue(obj64);
        java.lang.Object obj66 = defaultedMap19.put((java.lang.Object) defaultedMap48, (java.lang.Object) defaultedMap62);
        boolean b67 = defaultedMap19.isEmpty();
        java.lang.Object obj68 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1 + "'", obj46.equals(1));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        boolean b16 = defaultedMap11.containsValue((java.lang.Object) predicate14);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.clear();
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap14.containsValue(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b24 = defaultedMap14.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj40 = defaultedMap27.get((java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate25, predicate39);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.clear();
        java.lang.Object obj47 = defaultedMap44.get((java.lang.Object) (short) 0);
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set54 = defaultedMap50.entrySet();
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate60);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj67 = defaultedMap64.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate73);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap64);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap78.clear();
        java.lang.Object obj81 = defaultedMap78.get((java.lang.Object) (short) 0);
        java.util.Set set82 = defaultedMap78.keySet();
        java.lang.Object obj83 = defaultedMap44.put((java.lang.Object) defaultedMap76, (java.lang.Object) defaultedMap78);
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) defaultedMap78);
        java.util.Set set85 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1 + "'", obj47.equals(1));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 1 + "'", obj81.equals(1));
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 1 + "'", obj84.equals(1));
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.containsValue(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (short) -1);
        java.lang.String str12 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.clear();
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) (short) 0);
        java.lang.String str18 = defaultedMap14.toString();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) defaultedMap37);
        java.util.Collection collection39 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap41.clear();
        java.lang.Object obj43 = new java.lang.Object();
        boolean b44 = defaultedMap41.containsValue(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap46.clear();
        java.lang.Object obj50 = defaultedMap46.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b51 = defaultedMap41.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj57 = defaultedMap54.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set58 = defaultedMap54.entrySet();
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate62, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj67 = defaultedMap54.get((java.lang.Object) predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate52, predicate66);
        java.lang.Object obj69 = defaultedMap14.put((java.lang.Object) defaultedMap37, (java.lang.Object) map68);
        boolean b70 = defaultedMap1.containsKey((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1 + "'", obj67.equals(1));
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set5 = defaultedMap3.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set16 = defaultedMap12.entrySet();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate20, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        java.lang.Object obj39 = defaultedMap12.get((java.lang.Object) predicate37);
        boolean b40 = defaultedMap7.containsKey((java.lang.Object) predicate37);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.util.Set set42 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1 + "'", obj39.equals(1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap16.entrySet();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate39);
        int i42 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.clear();
        java.lang.Object obj46 = new java.lang.Object();
        boolean b47 = defaultedMap44.containsValue(obj46);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap44);
        java.util.Collection collection49 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap51.clear();
        java.lang.Object obj54 = defaultedMap51.get((java.lang.Object) (short) 0);
        java.lang.String str55 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap57.clear();
        java.lang.Object obj60 = defaultedMap57.get((java.lang.Object) (short) 0);
        java.lang.String str61 = defaultedMap57.toString();
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) str61, (java.lang.Object) 10L);
        java.lang.Object obj64 = defaultedMap30.get((java.lang.Object) 10L);
        collections.Factory factory65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, factory65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1 + "'", obj54.equals(1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1 + "'", obj60.equals(1));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1 + "'", obj64.equals(1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        java.util.Iterator iterator8 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) iterator8);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        int i25 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate36);
        java.lang.Object obj40 = defaultedMap27.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate46);
        java.util.Iterator iterator48 = filterIterator45.getIterator();
        collections.Predicate predicate49 = filterIterator45.getPredicate();
        java.lang.Object obj50 = defaultedMap27.remove((java.lang.Object) filterIterator45);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10.0f);
        java.util.Set set53 = defaultedMap27.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap55.clear();
        java.lang.Object obj58 = defaultedMap55.get((java.lang.Object) (short) 0);
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate65);
        java.lang.Object obj67 = defaultedMap55.get((java.lang.Object) filterIterator66);
        collections.Predicate predicate68 = filterIterator66.getPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap70.clear();
        java.lang.Object obj73 = defaultedMap70.get((java.lang.Object) (short) 0);
        defaultedMap70.clear();
        java.util.Collection collection75 = defaultedMap70.values();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) 0L);
        java.lang.Object obj78 = defaultedMap27.put((java.lang.Object) predicate68, (java.lang.Object) map77);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) predicate80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap83.clear();
        java.lang.Object obj86 = defaultedMap83.get((java.lang.Object) (short) 0);
        defaultedMap83.clear();
        boolean b88 = defaultedMap81.containsKey((java.lang.Object) defaultedMap83);
        java.lang.String str89 = defaultedMap83.toString();
        java.lang.Object obj90 = defaultedMap27.get((java.lang.Object) defaultedMap83);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1 + "'", obj58.equals(1));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1 + "'", obj67.equals(1));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 1 + "'", obj73.equals(1));
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 1 + "'", obj86.equals(1));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{}" + "'", str89.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 1 + "'", obj90.equals(1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Iterator iterator12 = filterIterator9.getIterator();
        filterIterator4.setIterator(iterator12);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        try {
            boolean b30 = filterIterator27.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) 0L);
        int i12 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.clear();
        java.lang.Object obj18 = defaultedMap14.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        int i19 = defaultedMap14.size();
        int i20 = defaultedMap14.size();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        java.util.Iterator iterator28 = filterIterator25.getIterator();
        java.util.Iterator iterator29 = filterIterator25.getIterator();
        java.lang.Object obj30 = defaultedMap14.get((java.lang.Object) filterIterator25);
        boolean b31 = defaultedMap4.equals((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.containsValue(obj3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap6.clear();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set16 = defaultedMap12.entrySet();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate20, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        java.lang.Object obj39 = defaultedMap12.get((java.lang.Object) predicate37);
        boolean b40 = defaultedMap7.containsKey((java.lang.Object) predicate37);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        filterIterator47.setIterator((java.util.Iterator) filterIterator54);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) 100, (java.lang.Object) filterIterator54);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1 + "'", obj39.equals(1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        java.util.Set set21 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (short) 0);
        java.lang.String str27 = defaultedMap23.toString();
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) filterIterator34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, obj40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        java.lang.Object obj47 = defaultedMap44.remove((java.lang.Object) defaultedMap46);
        java.util.Collection collection48 = defaultedMap46.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap50.clear();
        java.lang.Object obj52 = new java.lang.Object();
        boolean b53 = defaultedMap50.containsValue(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap55.clear();
        java.lang.Object obj59 = defaultedMap55.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b60 = defaultedMap50.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj66 = defaultedMap63.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set67 = defaultedMap63.entrySet();
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate71, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj76 = defaultedMap63.get((java.lang.Object) predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate61, predicate75);
        java.lang.Object obj78 = defaultedMap23.put((java.lang.Object) defaultedMap46, (java.lang.Object) map77);
        java.lang.Object obj79 = defaultedMap15.get(obj78);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 1 + "'", obj76.equals(1));
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 1 + "'", obj79.equals(1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj3 = new java.lang.Object();
        boolean b4 = defaultedMap1.containsValue(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (short) -1);
        java.lang.String str12 = defaultedMap1.toString();
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Set set20 = defaultedMap15.keySet();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        collections.Predicate predicate27 = filterIterator23.getPredicate();
        filterIterator17.setPredicate(predicate27);
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        filterIterator34.setIterator((java.util.Iterator) filterIterator41);
        filterIterator12.setIterator((java.util.Iterator) filterIterator41);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate49);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator56);
        filterIterator51.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate55);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set30 = defaultedMap26.entrySet();
        java.util.Set set31 = defaultedMap26.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap35.clear();
        java.lang.Object obj38 = defaultedMap35.get((java.lang.Object) (short) 0);
        defaultedMap35.clear();
        boolean b40 = defaultedMap33.containsKey((java.lang.Object) defaultedMap35);
        java.lang.String str41 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap43.clear();
        java.lang.Object obj45 = new java.lang.Object();
        boolean b46 = defaultedMap43.containsValue(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap48.clear();
        java.lang.Object obj52 = defaultedMap48.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b53 = defaultedMap43.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set60 = defaultedMap56.entrySet();
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate64, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj69 = defaultedMap56.get((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate54, predicate68);
        java.lang.Object obj71 = defaultedMap26.put((java.lang.Object) defaultedMap33, (java.lang.Object) predicate54);
        defaultedMap1.putAll((java.util.Map) defaultedMap26);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1 + "'", obj38.equals(1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1 + "'", obj69.equals(1));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap14.clear();
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap14.containsValue(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b24 = defaultedMap14.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj40 = defaultedMap27.get((java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate25, predicate39);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap11.clear();
        boolean b13 = defaultedMap4.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        java.util.Set set21 = defaultedMap15.keySet();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap15.containsValue(obj22);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        collections.Predicate predicate27 = filterIterator23.getPredicate();
        filterIterator17.setPredicate(predicate27);
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        filterIterator34.setIterator((java.util.Iterator) filterIterator41);
        filterIterator12.setIterator((java.util.Iterator) filterIterator41);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap53.clear();
        java.lang.Object obj57 = defaultedMap53.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        int i58 = defaultedMap53.size();
        int i59 = defaultedMap53.size();
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate65);
        java.util.Iterator iterator67 = filterIterator64.getIterator();
        java.util.Iterator iterator68 = filterIterator64.getIterator();
        java.lang.Object obj69 = defaultedMap53.get((java.lang.Object) filterIterator64);
        filterIterator51.setIterator((java.util.Iterator) filterIterator64);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertNull(iterator68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1 + "'", obj69.equals(1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) iterator2);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap17.clear();
        java.lang.Object obj19 = new java.lang.Object();
        boolean b20 = defaultedMap17.containsValue(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.clear();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b27 = defaultedMap17.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set34 = defaultedMap30.entrySet();
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate38, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj43 = defaultedMap30.get((java.lang.Object) predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate28, predicate42);
        filterIterator15.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate42);
        collections.Predicate predicate47 = filterIterator46.getPredicate();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap7.clear();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 0);
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) str11, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Set set20 = defaultedMap15.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap24.clear();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) (short) 0);
        defaultedMap24.clear();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) defaultedMap24);
        java.lang.String str30 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap32.clear();
        java.lang.Object obj34 = new java.lang.Object();
        boolean b35 = defaultedMap32.containsValue(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap37.clear();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b42 = defaultedMap32.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set49 = defaultedMap45.entrySet();
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate53, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj58 = defaultedMap45.get((java.lang.Object) predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate43, predicate57);
        java.lang.Object obj60 = defaultedMap15.put((java.lang.Object) defaultedMap22, (java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap62.clear();
        boolean b64 = defaultedMap15.containsValue((java.lang.Object) defaultedMap62);
        java.lang.Object obj65 = defaultedMap1.remove((java.lang.Object) b64);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1 + "'", obj10.equals(1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1 + "'", obj58.equals(1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.clear();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 0);
        java.lang.String str7 = defaultedMap3.toString();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        java.lang.Object obj15 = defaultedMap3.get((java.lang.Object) filterIterator14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj20 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set21 = defaultedMap17.entrySet();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate27);
        filterIterator1.setPredicate(predicate27);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set10 = defaultedMap6.entrySet();
        java.util.Set set11 = defaultedMap6.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (short) 0);
        defaultedMap15.clear();
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) defaultedMap15);
        java.lang.String str21 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap23.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap28.clear();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b33 = defaultedMap23.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set40 = defaultedMap36.entrySet();
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate44, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj49 = defaultedMap36.get((java.lang.Object) predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate34, predicate48);
        java.lang.Object obj51 = defaultedMap6.put((java.lang.Object) defaultedMap13, (java.lang.Object) predicate34);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) predicate34);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1 + "'", obj49.equals(1));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 0);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set24 = defaultedMap20.entrySet();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate30);
        filterIterator4.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj43 = defaultedMap40.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap40.entrySet();
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate48, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj53 = defaultedMap40.get((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj58 = defaultedMap55.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set59 = defaultedMap55.entrySet();
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate63, predicate65);
        java.lang.Object obj67 = defaultedMap40.get((java.lang.Object) predicate65);
        boolean b68 = defaultedMap35.containsKey((java.lang.Object) predicate65);
        filterIterator4.setPredicate(predicate65);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1 + "'", obj53.equals(1));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1 + "'", obj67.equals(1));
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap7.entrySet();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (short) 0);
        java.lang.String str35 = defaultedMap31.toString();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) filterIterator42);
        collections.Predicate predicate44 = filterIterator42.getPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate44);
        try {
            boolean b47 = filterIterator29.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertNotNull(predicate44);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        filterIterator4.setPredicate(predicate17);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        java.lang.String str10 = defaultedMap4.toString();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{1.0=-1.0}" + "'", str10.equals("{1.0=-1.0}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate25);
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        try {
            java.lang.Object obj31 = filterIterator29.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(predicate30);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        filterIterator12.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap24.clear();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) (short) 0);
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) filterIterator35);
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        java.util.Iterator iterator49 = filterIterator46.getIterator();
        collections.Predicate predicate50 = filterIterator46.getPredicate();
        filterIterator40.setPredicate(predicate50);
        filterIterator35.setIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator60, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate63);
        filterIterator57.setIterator((java.util.Iterator) filterIterator64);
        filterIterator35.setIterator((java.util.Iterator) filterIterator64);
        filterIterator12.setIterator((java.util.Iterator) filterIterator64);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1 + "'", obj36.equals(1));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        collections.Predicate predicate27 = filterIterator23.getPredicate();
        filterIterator17.setPredicate(predicate27);
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        try {
            java.lang.Object obj30 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate27);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.clear();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap10.clear();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) 0);
        boolean b14 = defaultedMap3.containsValue((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        java.util.Iterator iterator18 = filterIterator15.getIterator();
        collections.Predicate predicate19 = filterIterator15.getPredicate();
        filterIterator9.setPredicate(predicate19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) predicate19);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        java.util.Collection collection25 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        java.util.Iterator iterator15 = filterIterator12.getIterator();
        java.util.Iterator iterator16 = filterIterator12.getIterator();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) filterIterator12);
        int i18 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (short) 0);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) filterIterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) (short) 0);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        java.lang.Object obj32 = defaultedMap20.get((java.lang.Object) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertNotNull(predicate33);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap9.entrySet();
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) defaultedMap9);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1 + "'", obj15.equals(1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.clear();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (short) 0);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1 + "'", obj20.equals(1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        filterIterator2.setPredicate(predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (short) 0);
        java.lang.String str19 = defaultedMap15.toString();
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        java.lang.Object obj27 = defaultedMap15.get((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set33 = defaultedMap29.entrySet();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate39);
        filterIterator2.setPredicate(predicate39);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap3.clear();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        java.lang.String str9 = defaultedMap1.toString();
        java.util.Set set10 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (short) 0);
        java.lang.String str9 = defaultedMap5.toString();
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) filterIterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) (short) 0);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        java.lang.Object obj32 = defaultedMap20.get((java.lang.Object) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) (short) 0);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        java.lang.Object obj46 = defaultedMap37.remove((java.lang.Object) predicate44);
        filterIterator35.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1 + "'", obj23.equals(1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1 + "'", obj32.equals(1));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1 + "'", obj40.equals(1));
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.String str9 = defaultedMap8.toString();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) predicate8);
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.Predicate predicate14 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap17.clear();
        java.lang.Object obj19 = new java.lang.Object();
        boolean b20 = defaultedMap17.containsValue(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.clear();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b27 = defaultedMap17.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set34 = defaultedMap30.entrySet();
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate38, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj43 = defaultedMap30.get((java.lang.Object) predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate28, predicate42);
        filterIterator15.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate42);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate15);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) defaultedMap29);
        java.util.Collection collection31 = defaultedMap29.values();
        java.util.Collection collection32 = defaultedMap29.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        java.util.Map map34 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) map19);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap13.clear();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) (short) 0);
        java.lang.String str17 = defaultedMap13.toString();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate36);
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.Predicate predicate39 = filterIterator35.getPredicate();
        filterIterator29.setPredicate(predicate39);
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate52);
        filterIterator46.setIterator((java.util.Iterator) filterIterator53);
        filterIterator24.setIterator((java.util.Iterator) filterIterator53);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        java.util.Iterator iterator58 = filterIterator57.getIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap65.clear();
        java.lang.Object obj68 = defaultedMap65.get((java.lang.Object) (short) 0);
        java.lang.String str69 = defaultedMap65.toString();
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        java.util.Iterator iterator72 = filterIterator71.getIterator();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator72, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74, predicate75);
        java.lang.Object obj77 = defaultedMap65.get((java.lang.Object) filterIterator76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj82 = defaultedMap79.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set83 = defaultedMap79.entrySet();
        java.util.Iterator iterator84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator84);
        java.util.Iterator iterator86 = filterIterator85.getIterator();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator(iterator86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate87, predicate89);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator76, predicate89);
        collections.Predicate predicate92 = null;
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator91, predicate92);
        collections.Predicate predicate94 = filterIterator93.getPredicate();
        filterIterator24.setIterator((java.util.Iterator) filterIterator93);
        filterIterator9.setIterator((java.util.Iterator) filterIterator93);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator93);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1 + "'", obj16.equals(1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1 + "'", obj25.equals(1));
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 1 + "'", obj68.equals(1));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNull(iterator72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 1 + "'", obj77.equals(1));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(iterator86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNull(predicate94);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set27 = defaultedMap1.entrySet();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (short) 0);
        defaultedMap31.clear();
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap38.clear();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap31.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 0);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj23 = defaultedMap20.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set24 = defaultedMap20.entrySet();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate30);
        filterIterator4.setIterator((java.util.Iterator) filterIterator17);
        try {
            java.lang.Object obj34 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1 + "'", obj9.equals(1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1 + "'", obj18.equals(1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set8 = defaultedMap4.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate20);
        java.lang.Object obj24 = defaultedMap11.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        java.util.Iterator iterator32 = filterIterator29.getIterator();
        collections.Predicate predicate33 = filterIterator29.getPredicate();
        java.lang.Object obj34 = defaultedMap11.remove((java.lang.Object) filterIterator29);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 10.0f);
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        java.util.Collection collection6 = defaultedMap3.values();
        java.util.Set set7 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set27 = defaultedMap1.entrySet();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (short) 0);
        defaultedMap31.clear();
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap38.clear();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap31.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        java.lang.String str44 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{1.0=-1.0}" + "'", str44.equals("{1.0=-1.0}"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate10);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        collections.Predicate predicate23 = filterIterator19.getPredicate();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) filterIterator19);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        java.util.Set set27 = defaultedMap1.entrySet();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (short) 0);
        defaultedMap31.clear();
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap38.clear();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap31.containsValue((java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        java.util.Set set44 = defaultedMap38.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1 + "'", obj41.equals(1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1 + "'", obj43.equals(1));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap7.entrySet();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj24 = defaultedMap21.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap35.clear();
        java.lang.Object obj38 = defaultedMap35.get((java.lang.Object) (short) 0);
        java.util.Set set39 = defaultedMap35.keySet();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap33, (java.lang.Object) defaultedMap35);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.clear();
        java.lang.Object obj47 = defaultedMap44.get((java.lang.Object) (short) 0);
        defaultedMap44.clear();
        boolean b49 = defaultedMap42.containsKey((java.lang.Object) defaultedMap44);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap44);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1 + "'", obj38.equals(1));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1 + "'", obj47.equals(1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap16.entrySet();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate39);
        int i42 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap44.clear();
        java.lang.Object obj46 = new java.lang.Object();
        boolean b47 = defaultedMap44.containsValue(obj46);
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap50.clear();
        java.lang.Object obj53 = defaultedMap50.get((java.lang.Object) (short) 0);
        java.lang.String str54 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap56.clear();
        java.lang.Object obj59 = defaultedMap56.get((java.lang.Object) (short) 0);
        java.lang.String str60 = defaultedMap56.toString();
        java.lang.Object obj62 = defaultedMap50.put((java.lang.Object) str60, (java.lang.Object) 10L);
        java.lang.Object obj63 = defaultedMap30.remove((java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1 + "'", obj14.equals(1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1 + "'", obj28.equals(1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1 + "'", obj53.equals(1));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1 + "'", obj59.equals(1));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        java.lang.String str5 = defaultedMap3.toString();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap3.containsValue(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap9.entrySet();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap22.clear();
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap22.containsValue(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap27.clear();
        java.lang.Object obj31 = defaultedMap27.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b32 = defaultedMap22.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set39 = defaultedMap35.entrySet();
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate33, predicate47);
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj55 = defaultedMap52.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set56 = defaultedMap52.entrySet();
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate60, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap65.clear();
        java.lang.Object obj67 = new java.lang.Object();
        boolean b68 = defaultedMap65.containsValue(obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap70.clear();
        java.lang.Object obj74 = defaultedMap70.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b75 = defaultedMap65.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj81 = defaultedMap78.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set82 = defaultedMap78.entrySet();
        java.util.Iterator iterator83 = null;
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator83);
        java.util.Iterator iterator85 = filterIterator84.getIterator();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate86, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj91 = defaultedMap78.get((java.lang.Object) predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate76, predicate90);
        defaultedMap52.putAll((java.util.Map) defaultedMap65);
        boolean b94 = defaultedMap9.containsKey((java.lang.Object) defaultedMap65);
        defaultedMap3.putAll((java.util.Map) defaultedMap65);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1 + "'", obj48.equals(1));
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(iterator85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 1 + "'", obj91.equals(1));
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap16.clear();
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap16.containsValue(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) (short) -1, (java.lang.Object) 100);
        boolean b26 = defaultedMap16.containsValue((java.lang.Object) (short) -1);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set33 = defaultedMap29.entrySet();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj42 = defaultedMap29.get((java.lang.Object) predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate27, predicate41);
        filterIterator14.setPredicate(predicate41);
        filterIterator12.setPredicate(predicate41);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1 + "'", obj13.equals(1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1 + "'", obj42.equals(1));
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate15);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1);
        defaultedMap23.clear();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (short) 0);
        java.lang.String str27 = defaultedMap23.toString();
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) filterIterator34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.lang.Object obj40 = defaultedMap37.put((java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
        java.util.Set set41 = defaultedMap37.entrySet();
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate47);
        java.lang.Object obj50 = defaultedMap21.remove((java.lang.Object) filterIterator49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate(map19, obj50);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1 + "'", obj26.equals(1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1 + "'", obj35.equals(1));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
    }
}

