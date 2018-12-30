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
        java.util.Iterator iterator1 = null;
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator1, predicate2);
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) iterator1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            boolean b3 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        try {
            java.util.Map map5 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        try {
            boolean b5 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Set set17 = defaultedMap15.keySet();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        try {
            java.lang.Object obj11 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap22.clear();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        java.util.Set set25 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        int i34 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator19);
        try {
            filterIterator19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap1.entrySet();
        boolean b13 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        try {
            java.lang.Object obj16 = filterIterator13.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate35);
        filterIterator16.setPredicate(predicate35);
        filterIterator8.setPredicate(predicate35);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate5);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        filterIterator2.setPredicate(predicate21);
        java.util.Iterator iterator24 = filterIterator2.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator24);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate5);
        try {
            boolean b7 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = filterIterator10.getIterator();
        filterIterator5.setIterator(iterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj36 = defaultedMap27.put((java.lang.Object) predicate33, (java.lang.Object) (-1.0d));
        filterIterator23.setPredicate(predicate33);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate41);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        java.lang.Object obj61 = defaultedMap52.put((java.lang.Object) predicate58, (java.lang.Object) (-1.0d));
        filterIterator48.setPredicate(predicate58);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate66);
        collections.Factory factory70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate(map69, factory70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) filterIterator21);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) -1 + "'", obj23.equals((byte) -1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        java.util.Iterator iterator11 = null;
        filterIterator4.setIterator(iterator11);
        try {
            java.lang.Object obj13 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator2.setPredicate(predicate5);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        filterIterator11.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        filterIterator2.setPredicate(predicate21);
        try {
            java.lang.Object obj24 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        try {
            filterIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i5 = defaultedMap4.size();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i5);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i15 = defaultedMap14.size();
        java.util.Collection collection16 = defaultedMap14.values();
        boolean b18 = defaultedMap14.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        filterIterator29.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator35 = filterIterator29.getIterator();
        filterIterator24.setIterator(iterator35);
        boolean b37 = defaultedMap20.equals((java.lang.Object) iterator35);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj55 = defaultedMap46.put((java.lang.Object) predicate52, (java.lang.Object) (-1.0d));
        filterIterator42.setPredicate(predicate52);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate60);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator72, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        filterIterator76.setPredicate(predicate77);
        java.lang.Object obj80 = defaultedMap71.put((java.lang.Object) predicate77, (java.lang.Object) (-1.0d));
        filterIterator67.setPredicate(predicate77);
        java.util.Iterator iterator82 = null;
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate85);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate85);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate60, predicate85);
        boolean b89 = defaultedMap14.containsKey((java.lang.Object) predicate85);
        java.lang.String str90 = defaultedMap14.toString();
        java.util.Iterator iterator91 = null;
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator(iterator91, predicate92);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator93, predicate94);
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator93);
        defaultedMap1.putAll(map96);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate11);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        java.util.Iterator iterator30 = filterIterator24.getIterator();
        filterIterator19.setIterator(iterator30);
        collections.Predicate predicate32 = filterIterator19.getPredicate();
        java.util.Iterator iterator33 = filterIterator19.getIterator();
        filterIterator15.setIterator(iterator33);
        try {
            filterIterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        filterIterator25.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        filterIterator35.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate42);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate42);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        java.lang.Object obj29 = defaultedMap20.put((java.lang.Object) predicate26, (java.lang.Object) (-1.0d));
        filterIterator16.setPredicate(predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) predicate39, (java.lang.Object) (-1.0d));
        filterIterator16.setPredicate(predicate39);
        try {
            java.lang.Object obj44 = filterIterator16.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) filterIterator21);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj41 = defaultedMap32.put((java.lang.Object) predicate38, (java.lang.Object) (-1.0d));
        filterIterator28.setPredicate(predicate38);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate46);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        filterIterator53.setPredicate(predicate54);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) filterIterator28, (java.lang.Object) filterIterator53);
        java.lang.String str57 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = filterIterator10.getIterator();
        filterIterator5.setIterator(iterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj36 = defaultedMap27.put((java.lang.Object) predicate33, (java.lang.Object) (-1.0d));
        filterIterator23.setPredicate(predicate33);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate41);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        java.lang.Object obj61 = defaultedMap52.put((java.lang.Object) predicate58, (java.lang.Object) (-1.0d));
        filterIterator48.setPredicate(predicate58);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate66);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) map69);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            java.lang.Object obj3 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap22.clear();
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj35 = defaultedMap26.put((java.lang.Object) predicate32, (java.lang.Object) (-1.0d));
        int i36 = defaultedMap26.size();
        defaultedMap26.clear();
        boolean b38 = defaultedMap22.containsValue((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap1.entrySet();
        int i12 = defaultedMap1.size();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        java.util.Iterator iterator11 = null;
        filterIterator4.setIterator(iterator11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate20);
        java.lang.Object obj23 = defaultedMap14.put((java.lang.Object) predicate20, (java.lang.Object) (-1.0d));
        int i24 = defaultedMap14.size();
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) predicate39, (java.lang.Object) (-1.0d));
        filterIterator29.setPredicate(predicate39);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator29);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj55 = defaultedMap46.put((java.lang.Object) predicate52, (java.lang.Object) (-1.0d));
        filterIterator29.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator11, predicate52);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        int i15 = defaultedMap5.size();
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj35 = defaultedMap26.put((java.lang.Object) predicate32, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate32);
        boolean b37 = defaultedMap5.equals((java.lang.Object) filterIterator24);
        java.util.Set set38 = defaultedMap5.keySet();
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) -1 + "'", obj17.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        java.lang.Object obj29 = defaultedMap20.put((java.lang.Object) predicate26, (java.lang.Object) (-1.0d));
        filterIterator16.setPredicate(predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        java.lang.String str32 = defaultedMap1.toString();
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        try {
            boolean b9 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj25 = defaultedMap16.put((java.lang.Object) predicate22, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap16.size();
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        java.lang.Object obj39 = defaultedMap30.put((java.lang.Object) predicate36, (java.lang.Object) (-1.0d));
        int i40 = defaultedMap30.size();
        java.lang.Object obj42 = defaultedMap30.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap30.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj46 = defaultedMap14.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap44);
        java.lang.String str47 = defaultedMap14.toString();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) -1 + "'", obj28.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) -1 + "'", obj42.equals((byte) -1));
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        int i15 = defaultedMap5.size();
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        java.lang.Object obj33 = defaultedMap24.put((java.lang.Object) predicate30, (java.lang.Object) (-1.0d));
        filterIterator20.setPredicate(predicate30);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator20.setPredicate(predicate43);
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) filterIterator20);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte) -1 + "'", obj3.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate9 = filterIterator4.getPredicate();
        try {
            java.lang.Object obj10 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        try {
            boolean b9 = filterIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i36 = defaultedMap35.size();
        java.util.Collection collection37 = defaultedMap35.values();
        boolean b39 = defaultedMap35.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj65 = defaultedMap56.put((java.lang.Object) predicate62, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate62);
        boolean b67 = defaultedMap1.equals((java.lang.Object) filterIterator53);
        try {
            boolean b68 = filterIterator53.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj34 = defaultedMap25.put((java.lang.Object) predicate31, (java.lang.Object) (-1.0d));
        int i35 = defaultedMap25.size();
        java.lang.Object obj37 = defaultedMap25.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj55 = defaultedMap46.put((java.lang.Object) predicate52, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate52);
        boolean b57 = defaultedMap25.equals((java.lang.Object) filterIterator44);
        java.util.Set set58 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i61 = defaultedMap60.size();
        java.util.Collection collection62 = defaultedMap60.values();
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) set58, (java.lang.Object) defaultedMap60);
        collections.Transformer transformer64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) -1 + "'", obj37.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        java.util.Set set34 = defaultedMap1.keySet();
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator48.setPredicate(predicate49);
        java.lang.Object obj52 = defaultedMap43.put((java.lang.Object) predicate49, (java.lang.Object) (-1.0d));
        filterIterator39.setPredicate(predicate49);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate57);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate60);
        int i62 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i62 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj28 = defaultedMap19.put((java.lang.Object) predicate25, (java.lang.Object) (-1.0d));
        int i29 = defaultedMap19.size();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap15.remove((java.lang.Object) defaultedMap19);
        defaultedMap19.clear();
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = filterIterator20.getIterator();
        filterIterator15.setIterator(iterator26);
        boolean b28 = defaultedMap11.equals((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate51, predicate76);
        boolean b80 = defaultedMap5.containsKey((java.lang.Object) predicate76);
        boolean b81 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        int i82 = defaultedMap1.size();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) predicate83);
        java.util.Collection collection85 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) -1 + "'", obj84.equals((byte) -1));
        org.junit.Assert.assertNotNull(collection85);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        java.lang.Object obj16 = defaultedMap7.put((java.lang.Object) predicate13, (java.lang.Object) (-1.0d));
        int i17 = defaultedMap7.size();
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj37 = defaultedMap28.put((java.lang.Object) predicate34, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate34);
        boolean b39 = defaultedMap7.equals((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i42 = defaultedMap41.size();
        java.util.Collection collection43 = defaultedMap41.values();
        boolean b45 = defaultedMap41.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        filterIterator50.setIterator((java.util.Iterator) filterIterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) filterIterator59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate68);
        boolean b73 = defaultedMap7.equals((java.lang.Object) filterIterator59);
        filterIterator5.setIterator((java.util.Iterator) filterIterator59);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) -1 + "'", obj19.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate14 = filterIterator8.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        int i15 = defaultedMap5.size();
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b22 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) -1 + "'", obj17.equals((byte) -1));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator14 = filterIterator8.getIterator();
        filterIterator3.setIterator(iterator14);
        try {
            boolean b16 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = filterIterator10.getIterator();
        filterIterator5.setIterator(iterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj37 = defaultedMap28.put((java.lang.Object) predicate34, (java.lang.Object) (-1.0d));
        java.util.Set set38 = defaultedMap28.entrySet();
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) set38);
        boolean b40 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i36 = defaultedMap35.size();
        java.util.Collection collection37 = defaultedMap35.values();
        boolean b39 = defaultedMap35.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj65 = defaultedMap56.put((java.lang.Object) predicate62, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate62);
        boolean b67 = defaultedMap1.equals((java.lang.Object) filterIterator53);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate71);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        filterIterator72.setIterator((java.util.Iterator) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate79);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator77);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator85, predicate86);
        java.lang.Object obj88 = defaultedMap1.get((java.lang.Object) filterIterator87);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (byte) -1 + "'", obj88.equals((byte) -1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) (-1.0d));
        filterIterator4.setPredicate(predicate14);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate22);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate25);
        try {
            boolean b27 = filterIterator24.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator14 = filterIterator8.getIterator();
        filterIterator3.setIterator(iterator14);
        collections.Predicate predicate16 = filterIterator3.getPredicate();
        java.util.Iterator iterator17 = filterIterator3.getIterator();
        collections.Predicate predicate18 = filterIterator3.getPredicate();
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator40 = filterIterator34.getIterator();
        filterIterator29.setIterator(iterator40);
        boolean b42 = defaultedMap25.equals((java.lang.Object) iterator40);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate57);
        java.lang.Object obj60 = defaultedMap51.put((java.lang.Object) predicate57, (java.lang.Object) (-1.0d));
        filterIterator47.setPredicate(predicate57);
        java.util.Iterator iterator62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate65);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        filterIterator72.setPredicate(predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator77 = null;
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79, predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        filterIterator81.setPredicate(predicate82);
        java.lang.Object obj85 = defaultedMap76.put((java.lang.Object) predicate82, (java.lang.Object) (-1.0d));
        filterIterator72.setPredicate(predicate82);
        java.util.Iterator iterator87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator89, predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate90);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate65, predicate90);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate90);
        collections.Predicate predicate95 = filterIterator94.getPredicate();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate95);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = filterIterator20.getIterator();
        filterIterator15.setIterator(iterator26);
        boolean b28 = defaultedMap11.equals((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate51, predicate76);
        boolean b80 = defaultedMap5.containsKey((java.lang.Object) predicate76);
        boolean b81 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        java.util.Iterator iterator82 = null;
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate85);
        java.util.Iterator iterator87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator87, predicate88);
        filterIterator86.setIterator((java.util.Iterator) filterIterator89);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) filterIterator89);
        java.util.Collection collection92 = defaultedMap91.values();
        boolean b93 = defaultedMap1.equals((java.lang.Object) collection92);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = filterIterator20.getIterator();
        filterIterator15.setIterator(iterator26);
        boolean b28 = defaultedMap11.equals((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate51, predicate76);
        boolean b80 = defaultedMap5.containsKey((java.lang.Object) predicate76);
        boolean b81 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i84 = defaultedMap83.size();
        java.util.Collection collection85 = defaultedMap83.values();
        boolean b87 = defaultedMap83.equals((java.lang.Object) 100.0d);
        boolean b88 = defaultedMap5.containsKey((java.lang.Object) b87);
        java.lang.String str89 = defaultedMap5.toString();
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{}" + "'", str89.equals("{}"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        boolean b12 = defaultedMap1.equals((java.lang.Object) filterIterator11);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj26 = defaultedMap17.put((java.lang.Object) predicate23, (java.lang.Object) (-1.0d));
        filterIterator13.setPredicate(predicate23);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate31);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator36);
        filterIterator7.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate40 = filterIterator33.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNotNull(predicate40);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        java.lang.Object obj29 = defaultedMap20.put((java.lang.Object) predicate26, (java.lang.Object) (-1.0d));
        filterIterator16.setPredicate(predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        java.lang.String str32 = defaultedMap1.toString();
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator43.setPredicate(predicate44);
        java.lang.Object obj47 = defaultedMap38.put((java.lang.Object) predicate44, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate44);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator63 = filterIterator57.getIterator();
        filterIterator52.setIterator(iterator63);
        collections.Predicate predicate65 = filterIterator52.getPredicate();
        java.util.Iterator iterator66 = filterIterator52.getIterator();
        filterIterator48.setIterator(iterator66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator66);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate29);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        filterIterator30.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate37);
        filterIterator15.setPredicate(predicate37);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate37);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i36 = defaultedMap35.size();
        java.util.Collection collection37 = defaultedMap35.values();
        boolean b39 = defaultedMap35.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj65 = defaultedMap56.put((java.lang.Object) predicate62, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate62);
        boolean b67 = defaultedMap1.equals((java.lang.Object) filterIterator53);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate71);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        filterIterator72.setIterator((java.util.Iterator) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate79);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator77);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = filterIterator20.getIterator();
        filterIterator15.setIterator(iterator26);
        boolean b28 = defaultedMap11.equals((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate51, predicate76);
        boolean b80 = defaultedMap5.containsKey((java.lang.Object) predicate76);
        boolean b81 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        int i82 = defaultedMap1.size();
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Collection collection85 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) -1 + "'", obj84.equals((byte) -1));
        org.junit.Assert.assertNotNull(collection85);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        java.util.Set set34 = defaultedMap1.keySet();
        java.lang.String str35 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = filterIterator10.getIterator();
        filterIterator5.setIterator(iterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = filterIterator10.getIterator();
        filterIterator5.setIterator(iterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator16);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate31 = filterIterator27.getPredicate();
        filterIterator21.setIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj44 = defaultedMap35.put((java.lang.Object) predicate41, (java.lang.Object) (-1.0d));
        int i45 = defaultedMap35.size();
        java.lang.Object obj47 = defaultedMap35.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate55);
        java.lang.Object obj58 = defaultedMap49.put((java.lang.Object) predicate55, (java.lang.Object) (-1.0d));
        int i59 = defaultedMap49.size();
        java.lang.Object obj61 = defaultedMap49.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap49.putAll((java.util.Map) defaultedMap63);
        java.lang.Object obj65 = defaultedMap33.put((java.lang.Object) defaultedMap35, (java.lang.Object) defaultedMap63);
        java.lang.Object obj67 = defaultedMap33.get((java.lang.Object) "");
        boolean b68 = defaultedMap1.containsValue((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) -1 + "'", obj47.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (byte) -1 + "'", obj61.equals((byte) -1));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate11);
        try {
            filterIterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) (-1.0d));
        filterIterator4.setPredicate(predicate14);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator30 = filterIterator27.getIterator();
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        filterIterator27.setIterator((java.util.Iterator) filterIterator33);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        java.util.Collection collection9 = defaultedMap7.values();
        boolean b11 = defaultedMap7.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        filterIterator22.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator28 = filterIterator22.getIterator();
        filterIterator17.setIterator(iterator28);
        boolean b30 = defaultedMap13.equals((java.lang.Object) iterator28);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        filterIterator44.setPredicate(predicate45);
        java.lang.Object obj48 = defaultedMap39.put((java.lang.Object) predicate45, (java.lang.Object) (-1.0d));
        filterIterator35.setPredicate(predicate45);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate53);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        filterIterator69.setPredicate(predicate70);
        java.lang.Object obj73 = defaultedMap64.put((java.lang.Object) predicate70, (java.lang.Object) (-1.0d));
        filterIterator60.setPredicate(predicate70);
        java.util.Iterator iterator75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate78);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate53, predicate78);
        boolean b82 = defaultedMap7.containsKey((java.lang.Object) predicate78);
        boolean b83 = defaultedMap3.containsKey((java.lang.Object) defaultedMap7);
        int i84 = defaultedMap3.size();
        java.lang.Object obj86 = defaultedMap3.get((java.lang.Object) 1.0d);
        java.util.Iterator iterator87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator89, predicate90);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        filterIterator89.setPredicate(predicate92);
        java.lang.Object obj94 = defaultedMap3.remove((java.lang.Object) predicate92);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) -1 + "'", obj86.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = filterIterator10.getIterator();
        filterIterator5.setIterator(iterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator16);
        java.util.Collection collection19 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator8.setIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator14 = filterIterator8.getIterator();
        filterIterator3.setIterator(iterator14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate21);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj28 = defaultedMap19.put((java.lang.Object) predicate25, (java.lang.Object) (-1.0d));
        int i29 = defaultedMap19.size();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap15.remove((java.lang.Object) defaultedMap19);
        java.util.Collection collection33 = defaultedMap15.values();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator22 = filterIterator16.getIterator();
        filterIterator11.setIterator(iterator22);
        boolean b24 = defaultedMap7.equals((java.lang.Object) iterator22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) predicate39, (java.lang.Object) (-1.0d));
        filterIterator29.setPredicate(predicate39);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate47);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        filterIterator63.setPredicate(predicate64);
        java.lang.Object obj67 = defaultedMap58.put((java.lang.Object) predicate64, (java.lang.Object) (-1.0d));
        filterIterator54.setPredicate(predicate64);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate72);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate47, predicate72);
        boolean b76 = defaultedMap1.containsKey((java.lang.Object) predicate72);
        java.util.Collection collection77 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(collection77);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate6 = filterIterator2.getPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) filterIterator2);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 100);
        boolean b15 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.String str16 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        filterIterator10.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate28);
        collections.Predicate predicate33 = filterIterator19.getPredicate();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj34 = defaultedMap25.put((java.lang.Object) predicate31, (java.lang.Object) (-1.0d));
        int i35 = defaultedMap25.size();
        java.lang.Object obj37 = defaultedMap25.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap39);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj55 = defaultedMap46.put((java.lang.Object) predicate52, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate52);
        boolean b57 = defaultedMap25.equals((java.lang.Object) filterIterator44);
        java.util.Set set58 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i61 = defaultedMap60.size();
        java.util.Collection collection62 = defaultedMap60.values();
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) set58, (java.lang.Object) defaultedMap60);
        boolean b64 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) -1 + "'", obj37.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        java.util.Collection collection9 = defaultedMap7.values();
        boolean b11 = defaultedMap7.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        filterIterator22.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator28 = filterIterator22.getIterator();
        filterIterator17.setIterator(iterator28);
        boolean b30 = defaultedMap13.equals((java.lang.Object) iterator28);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        filterIterator44.setPredicate(predicate45);
        java.lang.Object obj48 = defaultedMap39.put((java.lang.Object) predicate45, (java.lang.Object) (-1.0d));
        filterIterator35.setPredicate(predicate45);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate53);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        filterIterator69.setPredicate(predicate70);
        java.lang.Object obj73 = defaultedMap64.put((java.lang.Object) predicate70, (java.lang.Object) (-1.0d));
        filterIterator60.setPredicate(predicate70);
        java.util.Iterator iterator75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate78);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate53, predicate78);
        boolean b82 = defaultedMap7.containsKey((java.lang.Object) predicate78);
        boolean b83 = defaultedMap3.containsKey((java.lang.Object) defaultedMap7);
        int i84 = defaultedMap3.size();
        java.lang.Object obj86 = defaultedMap3.get((java.lang.Object) 1.0d);
        java.util.Iterator iterator87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator89, predicate90);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        filterIterator89.setPredicate(predicate92);
        java.lang.Object obj94 = defaultedMap3.remove((java.lang.Object) predicate92);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection96 = defaultedMap3.values();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) -1 + "'", obj86.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(collection96);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        java.util.Iterator iterator30 = filterIterator24.getIterator();
        filterIterator19.setIterator(iterator30);
        boolean b32 = defaultedMap15.equals((java.lang.Object) iterator30);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        java.lang.Object obj50 = defaultedMap41.put((java.lang.Object) predicate47, (java.lang.Object) (-1.0d));
        filterIterator37.setPredicate(predicate47);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate55);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        filterIterator71.setPredicate(predicate72);
        java.lang.Object obj75 = defaultedMap66.put((java.lang.Object) predicate72, (java.lang.Object) (-1.0d));
        filterIterator62.setPredicate(predicate72);
        java.util.Iterator iterator77 = null;
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79, predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate80);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate55, predicate80);
        filterIterator9.setPredicate(predicate55);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        java.lang.Object obj29 = defaultedMap20.put((java.lang.Object) predicate26, (java.lang.Object) (-1.0d));
        filterIterator16.setPredicate(predicate26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        java.lang.String str32 = defaultedMap1.toString();
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator43.setPredicate(predicate44);
        java.lang.Object obj47 = defaultedMap38.put((java.lang.Object) predicate44, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate44);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        filterIterator57.setIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator63 = filterIterator57.getIterator();
        filterIterator52.setIterator(iterator63);
        collections.Predicate predicate65 = filterIterator52.getPredicate();
        java.util.Iterator iterator66 = filterIterator52.getIterator();
        filterIterator48.setIterator(iterator66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator66);
        collections.Factory factory69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj27 = defaultedMap18.put((java.lang.Object) predicate24, (java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap1.containsKey(obj27);
        java.util.Collection collection29 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) filterIterator15);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) -1 + "'", obj20.equals((byte) -1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj25 = defaultedMap16.put((java.lang.Object) predicate22, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap16.size();
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        java.lang.Object obj39 = defaultedMap30.put((java.lang.Object) predicate36, (java.lang.Object) (-1.0d));
        int i40 = defaultedMap30.size();
        java.lang.Object obj42 = defaultedMap30.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap30.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj46 = defaultedMap14.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap44);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = defaultedMap16.get(obj47);
        java.util.Set set49 = defaultedMap16.keySet();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) -1 + "'", obj28.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) -1 + "'", obj42.equals((byte) -1));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte) -1 + "'", obj48.equals((byte) -1));
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) (-1.0d));
        filterIterator4.setPredicate(predicate14);
        java.util.Iterator iterator19 = filterIterator4.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap1.equals((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        filterIterator34.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator40 = filterIterator34.getIterator();
        filterIterator29.setIterator(iterator40);
        boolean b42 = defaultedMap25.equals((java.lang.Object) iterator40);
        java.util.Iterator iterator43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate57);
        java.lang.Object obj60 = defaultedMap51.put((java.lang.Object) predicate57, (java.lang.Object) (-1.0d));
        filterIterator47.setPredicate(predicate57);
        java.util.Iterator iterator62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate65);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        filterIterator72.setPredicate(predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator77 = null;
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79, predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        filterIterator81.setPredicate(predicate82);
        java.lang.Object obj85 = defaultedMap76.put((java.lang.Object) predicate82, (java.lang.Object) (-1.0d));
        filterIterator72.setPredicate(predicate82);
        java.util.Iterator iterator87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator89, predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate90);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate65, predicate90);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate90);
        try {
            filterIterator94.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate11);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        try {
            boolean b17 = filterIterator15.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj27 = defaultedMap18.put((java.lang.Object) predicate24, (java.lang.Object) (-1.0d));
        filterIterator14.setPredicate(predicate24);
        collections.Predicate predicate29 = filterIterator14.getPredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate29);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate29);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) (-1.0d));
        filterIterator4.setPredicate(predicate14);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        filterIterator24.setIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj44 = defaultedMap35.put((java.lang.Object) predicate41, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate41);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        filterIterator54.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        java.util.Iterator iterator60 = filterIterator54.getIterator();
        filterIterator49.setIterator(iterator60);
        collections.Predicate predicate62 = filterIterator49.getPredicate();
        java.util.Iterator iterator63 = filterIterator49.getIterator();
        filterIterator45.setIterator(iterator63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63);
        filterIterator27.setIterator(iterator63);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNull(predicate62);
        org.junit.Assert.assertNotNull(iterator63);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        java.util.Set set34 = defaultedMap1.keySet();
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator48.setPredicate(predicate49);
        java.lang.Object obj52 = defaultedMap43.put((java.lang.Object) predicate49, (java.lang.Object) (-1.0d));
        filterIterator39.setPredicate(predicate49);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate57);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate60);
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(iterator1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj24 = defaultedMap15.put((java.lang.Object) predicate21, (java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate(map13, predicate21, predicate25);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate(map13, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.util.Collection collection10 = defaultedMap9.values();
        java.util.Set set11 = defaultedMap9.entrySet();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj19 = defaultedMap10.put((java.lang.Object) predicate16, (java.lang.Object) (-1.0d));
        filterIterator7.setPredicate(predicate16);
        java.util.Iterator iterator21 = filterIterator7.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        int i17 = defaultedMap15.size();
        java.lang.String str18 = defaultedMap15.toString();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) -1 + "'", obj21.equals((byte) -1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = filterIterator20.getIterator();
        filterIterator15.setIterator(iterator26);
        boolean b28 = defaultedMap11.equals((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate51, predicate76);
        boolean b80 = defaultedMap5.containsKey((java.lang.Object) predicate76);
        boolean b81 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        int i82 = defaultedMap1.size();
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Iterator iterator85 = null;
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        filterIterator87.setPredicate(predicate90);
        java.lang.Object obj92 = defaultedMap1.remove((java.lang.Object) predicate90);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) -1 + "'", obj84.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj27 = defaultedMap18.put((java.lang.Object) predicate24, (java.lang.Object) (-1.0d));
        int i28 = defaultedMap18.size();
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) filterIterator33);
        java.lang.String str49 = defaultedMap18.toString();
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        filterIterator60.setPredicate(predicate61);
        java.lang.Object obj64 = defaultedMap55.put((java.lang.Object) predicate61, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate61);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator66);
        java.util.Iterator iterator70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate73);
        java.util.Iterator iterator75 = null;
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator75, predicate76);
        filterIterator74.setIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        java.util.Iterator iterator80 = filterIterator74.getIterator();
        filterIterator69.setIterator(iterator80);
        collections.Predicate predicate82 = filterIterator69.getPredicate();
        java.util.Iterator iterator83 = filterIterator69.getIterator();
        filterIterator65.setIterator(iterator83);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) iterator83);
        boolean b86 = defaultedMap15.equals((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertNull(predicate82);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        int i15 = defaultedMap5.size();
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set22 = defaultedMap1.keySet();
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj40 = defaultedMap31.put((java.lang.Object) predicate37, (java.lang.Object) (-1.0d));
        filterIterator27.setPredicate(predicate37);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate45);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        filterIterator47.setIterator((java.util.Iterator) filterIterator50);
        java.lang.Object obj53 = defaultedMap1.get((java.lang.Object) filterIterator47);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) -1 + "'", obj17.equals((byte) -1));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) -1 + "'", obj53.equals((byte) -1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.util.Set set11 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator13);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj35 = defaultedMap26.put((java.lang.Object) predicate32, (java.lang.Object) (-1.0d));
        filterIterator22.setPredicate(predicate32);
        collections.Predicate predicate37 = filterIterator22.getPredicate();
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate37);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        filterIterator16.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator22 = filterIterator16.getIterator();
        filterIterator11.setIterator(iterator22);
        boolean b24 = defaultedMap7.equals((java.lang.Object) iterator22);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) predicate39, (java.lang.Object) (-1.0d));
        filterIterator29.setPredicate(predicate39);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate47);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        filterIterator63.setPredicate(predicate64);
        java.lang.Object obj67 = defaultedMap58.put((java.lang.Object) predicate64, (java.lang.Object) (-1.0d));
        filterIterator54.setPredicate(predicate64);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate72);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate47, predicate72);
        boolean b76 = defaultedMap1.containsKey((java.lang.Object) predicate72);
        java.lang.String str77 = defaultedMap1.toString();
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80, predicate81);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator80);
        boolean b85 = defaultedMap1.containsValue((java.lang.Object) 1);
        java.util.Set set86 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set86);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj14 = defaultedMap5.put((java.lang.Object) predicate11, (java.lang.Object) (-1.0d));
        int i15 = defaultedMap5.size();
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        filterIterator26.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) filterIterator29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj43 = defaultedMap34.put((java.lang.Object) predicate40, (java.lang.Object) (-1.0d));
        int i44 = defaultedMap34.size();
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate48);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        filterIterator49.setIterator((java.util.Iterator) filterIterator52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Iterator iterator79 = null;
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator79, predicate80);
        java.util.Iterator iterator82 = filterIterator81.getIterator();
        filterIterator78.setIterator((java.util.Iterator) filterIterator81);
        filterIterator52.setIterator((java.util.Iterator) filterIterator78);
        boolean b85 = defaultedMap34.containsValue((java.lang.Object) filterIterator78);
        java.lang.Object obj86 = defaultedMap1.get((java.lang.Object) filterIterator78);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) -1 + "'", obj17.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNull(iterator82);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) -1 + "'", obj86.equals((byte) -1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 100);
        boolean b15 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate23);
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator19, predicate25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) filterIterator26);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator20.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator26 = filterIterator20.getIterator();
        filterIterator15.setIterator(iterator26);
        boolean b28 = defaultedMap11.equals((java.lang.Object) iterator26);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj46 = defaultedMap37.put((java.lang.Object) predicate43, (java.lang.Object) (-1.0d));
        filterIterator33.setPredicate(predicate43);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate51);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj71 = defaultedMap62.put((java.lang.Object) predicate68, (java.lang.Object) (-1.0d));
        filterIterator58.setPredicate(predicate68);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate51, predicate76);
        boolean b80 = defaultedMap5.containsKey((java.lang.Object) predicate76);
        boolean b81 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        int i82 = defaultedMap1.size();
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.lang.Object obj86 = defaultedMap1.get((java.lang.Object) true);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) -1 + "'", obj84.equals((byte) -1));
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) -1 + "'", obj86.equals((byte) -1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) (-1.0d));
        int i11 = defaultedMap1.size();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj31 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate28);
        boolean b33 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i36 = defaultedMap35.size();
        java.util.Collection collection37 = defaultedMap35.values();
        boolean b39 = defaultedMap35.equals((java.lang.Object) 100.0d);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator44.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj65 = defaultedMap56.put((java.lang.Object) predicate62, (java.lang.Object) (-1.0d));
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate62);
        boolean b67 = defaultedMap1.equals((java.lang.Object) filterIterator53);
        java.util.Iterator iterator68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate71);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        filterIterator72.setIterator((java.util.Iterator) filterIterator75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        java.util.Iterator iterator78 = null;
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator78, predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80, predicate81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        filterIterator82.setIterator((java.util.Iterator) filterIterator85);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        java.util.Iterator iterator88 = null;
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator(iterator88, predicate89);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator87, predicate89);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate89);
        boolean b93 = defaultedMap1.containsValue((java.lang.Object) filterIterator92);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) -1 + "'", obj13.equals((byte) -1));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue(b93 == false);
    }
}

