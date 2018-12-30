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
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.Predicate predicate6 = filterIterator1.getPredicate();
        try {
            boolean b7 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            boolean b2 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
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
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator5.setPredicate(predicate6);
        try {
            filterIterator5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        try {
            java.lang.Object obj7 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate20);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) iterator27);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.lang.Object obj34 = defaultedMap26.put((java.lang.Object) 0L, (java.lang.Object) filterIterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) predicate37, obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator43);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) iterator43);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.lang.Object obj50 = defaultedMap42.put((java.lang.Object) 0L, (java.lang.Object) filterIterator49);
        java.util.Set set51 = defaultedMap42.entrySet();
        defaultedMap26.putAll((java.util.Map) defaultedMap42);
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) iterator56);
        java.util.Set set60 = defaultedMap55.keySet();
        java.util.Set set61 = defaultedMap55.keySet();
        boolean b62 = defaultedMap42.containsKey((java.lang.Object) set61);
        boolean b64 = defaultedMap42.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) b64);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) 100 + "'", obj30.equals((byte) 100));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (byte) 100 + "'", obj46.equals((byte) 100));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (byte) 100 + "'", obj59.equals((byte) 100));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 100 + "'", obj65.equals((byte) 100));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        java.util.Set set29 = defaultedMap1.keySet();
        java.util.Set set30 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        try {
            java.lang.Object obj13 = filterIterator12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        try {
            boolean b11 = filterIterator8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        java.util.Set set16 = defaultedMap1.keySet();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate22);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) predicate22);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        java.util.Set set29 = defaultedMap1.keySet();
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate40);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) filterIterator42);
        boolean b44 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 100 + "'", obj43.equals((byte) 100));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) iterator6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) iterator12);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) 0L, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) predicate22, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) iterator28);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) 0L, (java.lang.Object) filterIterator34);
        java.util.Set set36 = defaultedMap27.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap27);
        int i38 = defaultedMap11.size();
        java.util.Set set39 = defaultedMap11.keySet();
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        filterIterator45.setPredicate(predicate46);
        java.lang.Object obj48 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator45);
        try {
            boolean b52 = filterIterator45.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 100 + "'", obj9.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Set set28 = defaultedMap1.entrySet();
        java.util.Set set29 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator3);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) iterator3);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate12);
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) iterator17);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) 0L, (java.lang.Object) filterIterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate29);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate35);
        java.lang.Object obj39 = defaultedMap16.put((java.lang.Object) predicate35, (java.lang.Object) 100.0f);
        try {
            java.util.Map map40 = collections.map.PredicatedMap.decorate(map0, predicate7, predicate35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 100 + "'", obj6.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 100 + "'", obj20.equals((byte) 100));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) iterator47);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.lang.Object obj54 = defaultedMap46.put((java.lang.Object) 0L, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) iterator57);
        java.lang.Object obj63 = defaultedMap56.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Collection collection64 = defaultedMap56.values();
        boolean b65 = defaultedMap46.containsKey((java.lang.Object) collection64);
        defaultedMap7.putAll((java.util.Map) defaultedMap46);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 100 + "'", obj60.equals((byte) 100));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.String str6 = defaultedMap1.toString();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 0);
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) iterator12);
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) collection19);
        java.util.Set set21 = defaultedMap1.entrySet();
        java.util.Set set22 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) set22);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Set set35 = defaultedMap30.keySet();
        java.util.Set set36 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) iterator40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) iterator46);
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.lang.Object obj53 = defaultedMap45.put((java.lang.Object) 0L, (java.lang.Object) filterIterator52);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) predicate56, obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62);
        java.lang.Object obj65 = defaultedMap61.get((java.lang.Object) iterator62);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        java.lang.Object obj69 = defaultedMap61.put((java.lang.Object) 0L, (java.lang.Object) filterIterator68);
        java.util.Set set70 = defaultedMap61.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap61);
        int i72 = defaultedMap45.size();
        java.util.Set set73 = defaultedMap45.keySet();
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        filterIterator79.setPredicate(predicate80);
        java.lang.Object obj82 = defaultedMap39.put((java.lang.Object) defaultedMap45, (java.lang.Object) filterIterator79);
        java.lang.Object obj83 = defaultedMap30.put((java.lang.Object) 0L, (java.lang.Object) defaultedMap39);
        boolean b84 = defaultedMap1.containsKey((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (byte) 100 + "'", obj43.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) 100 + "'", obj49.equals((byte) 100));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 100 + "'", obj65.equals((byte) 100));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) iterator6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) iterator12);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) 0L, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) predicate22, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) iterator28);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) 0L, (java.lang.Object) filterIterator34);
        java.util.Set set36 = defaultedMap27.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap27);
        int i38 = defaultedMap11.size();
        java.util.Set set39 = defaultedMap11.keySet();
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        filterIterator45.setPredicate(predicate46);
        java.lang.Object obj48 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator45);
        java.util.Set set52 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 100 + "'", obj9.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        java.util.Iterator iterator45 = filterIterator41.getIterator();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(iterator45);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b16 = defaultedMap14.equals((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) iterator19);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj26 = defaultedMap18.put((java.lang.Object) 0L, (java.lang.Object) filterIterator25);
        collections.Predicate predicate27 = filterIterator25.getPredicate();
        collections.Predicate predicate28 = filterIterator25.getPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.lang.Object obj38 = defaultedMap30.put((java.lang.Object) 0L, (java.lang.Object) filterIterator37);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap30.put((java.lang.Object) predicate41, obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) iterator47);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.lang.Object obj54 = defaultedMap46.put((java.lang.Object) 0L, (java.lang.Object) filterIterator53);
        java.util.Set set55 = defaultedMap46.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap46);
        int i57 = defaultedMap30.size();
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) iterator61);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        java.lang.Object obj68 = defaultedMap60.put((java.lang.Object) 0L, (java.lang.Object) filterIterator67);
        java.util.Set set69 = defaultedMap60.entrySet();
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator71.setPredicate(predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) filterIterator71);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) predicate77);
        java.lang.Object obj79 = defaultedMap60.get((java.lang.Object) predicate77);
        java.lang.Object obj80 = defaultedMap30.get(obj79);
        java.lang.Object obj81 = defaultedMap14.put((java.lang.Object) filterIterator25, obj79);
        try {
            java.lang.Object obj82 = filterIterator25.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 100 + "'", obj22.equals((byte) 100));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (byte) 100 + "'", obj64.equals((byte) 100));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) 100 + "'", obj79.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (byte) 100 + "'", obj80.equals((byte) 100));
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Set set35 = defaultedMap30.keySet();
        java.util.Set set36 = defaultedMap30.keySet();
        boolean b37 = defaultedMap17.containsKey((java.lang.Object) set36);
        boolean b39 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set40 = defaultedMap17.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate12);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator15);
        java.util.Collection collection17 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) iterator20);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.lang.Object obj27 = defaultedMap19.put((java.lang.Object) 0L, (java.lang.Object) filterIterator26);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) predicate30, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) iterator36);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.lang.Object obj43 = defaultedMap35.put((java.lang.Object) 0L, (java.lang.Object) filterIterator42);
        java.util.Set set44 = defaultedMap35.entrySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap35);
        java.util.Set set46 = defaultedMap19.entrySet();
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 100 + "'", obj23.equals((byte) 100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 100 + "'", obj39.equals((byte) 100));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 100 + "'", obj47.equals((byte) 100));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) iterator6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) iterator12);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) 0L, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) predicate22, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) iterator28);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) 0L, (java.lang.Object) filterIterator34);
        java.util.Set set36 = defaultedMap27.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap27);
        int i38 = defaultedMap11.size();
        java.util.Set set39 = defaultedMap11.keySet();
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        filterIterator45.setPredicate(predicate46);
        java.lang.Object obj48 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator45);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 100 + "'", obj9.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        try {
            filterIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate45);
        java.util.Iterator iterator47 = null;
        filterIterator46.setIterator(iterator47);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        boolean b28 = defaultedMap17.isEmpty();
        java.util.Collection collection29 = defaultedMap17.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate11);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Set set35 = defaultedMap30.keySet();
        java.util.Set set36 = defaultedMap30.keySet();
        boolean b37 = defaultedMap17.containsKey((java.lang.Object) set36);
        boolean b39 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        boolean b40 = defaultedMap17.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) iterator33);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.lang.Object obj40 = defaultedMap32.put((java.lang.Object) 0L, (java.lang.Object) filterIterator39);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap32.put((java.lang.Object) predicate43, obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) iterator49);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.lang.Object obj56 = defaultedMap48.put((java.lang.Object) 0L, (java.lang.Object) filterIterator55);
        java.util.Set set57 = defaultedMap48.entrySet();
        defaultedMap32.putAll((java.util.Map) defaultedMap48);
        int i59 = defaultedMap32.size();
        java.util.Set set60 = defaultedMap32.keySet();
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate65);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        filterIterator68.setPredicate(predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate71);
        java.lang.Object obj74 = defaultedMap32.get((java.lang.Object) filterIterator73);
        boolean b75 = defaultedMap30.containsValue((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 100 + "'", obj52.equals((byte) 100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 100 + "'", obj74.equals((byte) 100));
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) iterator29);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate25, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 1.0d);
        int i46 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap15.get((java.lang.Object) defaultedMap43);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.lang.String str49 = defaultedMap15.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 100 + "'", obj32.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 100 + "'", obj45.equals((byte) 100));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicate7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) iterator20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator26.setPredicate(predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate16, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 1.0d);
        int i37 = defaultedMap34.size();
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap40.entrySet();
        java.util.Set set42 = defaultedMap40.keySet();
        java.lang.Object obj43 = defaultedMap6.remove((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) iterator46);
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.lang.Object obj53 = defaultedMap45.put((java.lang.Object) 0L, (java.lang.Object) filterIterator52);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) predicate56, obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator62);
        java.lang.Object obj65 = defaultedMap61.get((java.lang.Object) iterator62);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        java.lang.Object obj69 = defaultedMap61.put((java.lang.Object) 0L, (java.lang.Object) filterIterator68);
        java.util.Set set70 = defaultedMap61.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap61);
        int i72 = defaultedMap45.size();
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator76 = null;
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator76);
        java.lang.Object obj79 = defaultedMap75.get((java.lang.Object) iterator76);
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        java.lang.Object obj83 = defaultedMap75.put((java.lang.Object) 0L, (java.lang.Object) filterIterator82);
        java.util.Set set84 = defaultedMap75.entrySet();
        java.util.Iterator iterator85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator85);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        filterIterator86.setPredicate(predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86, predicate89);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) filterIterator86);
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj93 = defaultedMap91.remove((java.lang.Object) predicate92);
        java.lang.Object obj94 = defaultedMap75.get((java.lang.Object) predicate92);
        java.lang.Object obj95 = defaultedMap45.get(obj94);
        defaultedMap40.putAll((java.util.Map) defaultedMap45);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 100 + "'", obj23.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) 100 + "'", obj49.equals((byte) 100));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 100 + "'", obj65.equals((byte) 100));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) 100 + "'", obj79.equals((byte) 100));
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + (byte) 100 + "'", obj94.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + (byte) 100 + "'", obj95.equals((byte) 100));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        boolean b34 = defaultedMap32.equals((java.lang.Object) predicateUtils33);
        java.util.Collection collection35 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) iterator38);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        java.lang.Object obj45 = defaultedMap37.put((java.lang.Object) 0L, (java.lang.Object) filterIterator44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) iterator48);
        java.lang.Object obj54 = defaultedMap47.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Collection collection55 = defaultedMap47.values();
        boolean b56 = defaultedMap37.containsKey((java.lang.Object) collection55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        boolean b60 = defaultedMap58.equals((java.lang.Object) predicateUtils59);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap58);
        boolean b62 = defaultedMap32.containsValue((java.lang.Object) defaultedMap37);
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (byte) 100 + "'", obj41.equals((byte) 100));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 100 + "'", obj51.equals((byte) 100));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (byte) 100 + "'", obj63.equals((byte) 100));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) iterator12);
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) collection19);
        java.lang.String str21 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        java.util.Set set4 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) predicate18);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.Predicate predicate27 = filterIterator22.getPredicate();
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate32);
        filterIterator22.setPredicate(predicate32);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) filterIterator22);
        try {
            filterIterator22.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 100 + "'", obj20.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) iterator32);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap31.entrySet();
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap31.get((java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap1.get(obj50);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) filterIterator53);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate59, predicate61);
        boolean b63 = defaultedMap1.isEmpty();
        java.util.Set set64 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 100 + "'", obj51.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.util.Set set45 = defaultedMap33.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Set set50 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate57);
        boolean b67 = defaultedMap65.equals((java.lang.Object) 0.0d);
        defaultedMap17.putAll((java.util.Map) defaultedMap65);
        int i69 = defaultedMap65.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i69 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        java.util.Iterator iterator4 = null;
        filterIterator1.setIterator(iterator4);
        collections.Predicate predicate6 = filterIterator1.getPredicate();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 1.0d);
        int i51 = defaultedMap48.size();
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) iterator32);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap31.entrySet();
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap31.get((java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap1.get(obj50);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) filterIterator53);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate59, predicate61);
        boolean b63 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66);
        java.lang.Object obj69 = defaultedMap65.get((java.lang.Object) iterator66);
        java.util.Iterator iterator71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator71);
        java.lang.Object obj73 = defaultedMap65.put((java.lang.Object) 0L, (java.lang.Object) filterIterator72);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        filterIterator75.setPredicate(predicate76);
        java.lang.Object obj78 = null;
        java.lang.Object obj79 = defaultedMap65.put((java.lang.Object) predicate76, obj78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82);
        java.lang.Object obj85 = defaultedMap81.get((java.lang.Object) iterator82);
        java.util.Iterator iterator87 = null;
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator(iterator87);
        java.lang.Object obj89 = defaultedMap81.put((java.lang.Object) 0L, (java.lang.Object) filterIterator88);
        java.util.Set set90 = defaultedMap81.entrySet();
        defaultedMap65.putAll((java.util.Map) defaultedMap81);
        java.util.Set set92 = defaultedMap65.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap65);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 100 + "'", obj51.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (byte) 100 + "'", obj69.equals((byte) 100));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (byte) 100 + "'", obj85.equals((byte) 100));
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(set92);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            boolean b3 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        try {
            filterIterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        java.util.Iterator iterator4 = null;
        filterIterator1.setIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator1.getIterator();
        java.util.Iterator iterator7 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) filterIterator31);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Set set28 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.lang.Object obj38 = defaultedMap30.put((java.lang.Object) 0L, (java.lang.Object) filterIterator37);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate43);
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate49);
        java.lang.Object obj53 = defaultedMap30.put((java.lang.Object) predicate49, (java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicate7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) iterator20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator26.setPredicate(predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate16, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 1.0d);
        int i37 = defaultedMap34.size();
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set41 = defaultedMap40.entrySet();
        java.util.Set set42 = defaultedMap40.keySet();
        java.lang.Object obj43 = defaultedMap6.remove((java.lang.Object) defaultedMap40);
        defaultedMap40.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 100 + "'", obj23.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) iterator15);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj22 = defaultedMap14.put((java.lang.Object) 0L, (java.lang.Object) filterIterator21);
        java.util.Set set23 = defaultedMap14.entrySet();
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap14.get((java.lang.Object) predicate31);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate38);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        filterIterator42.setPredicate(predicate45);
        filterIterator35.setPredicate(predicate45);
        java.lang.Object obj48 = defaultedMap14.get((java.lang.Object) filterIterator35);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate53);
        collections.Predicate predicate55 = filterIterator50.getPredicate();
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        filterIterator57.setPredicate(predicate60);
        filterIterator50.setPredicate(predicate60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate60);
        java.lang.Object obj64 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) filterIterator35);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) 100 + "'", obj33.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (byte) 100 + "'", obj48.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate45);
        try {
            filterIterator41.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap30);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) predicate40);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) filterIterator43);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate49, predicate62);
        java.lang.Object obj66 = defaultedMap30.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate49);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate14);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) filterIterator16);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicate7);
        defaultedMap6.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Set set50 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.lang.Object obj60 = defaultedMap52.put((java.lang.Object) 0L, (java.lang.Object) filterIterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) predicate63, obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69);
        java.lang.Object obj72 = defaultedMap68.get((java.lang.Object) iterator69);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        java.lang.Object obj76 = defaultedMap68.put((java.lang.Object) 0L, (java.lang.Object) filterIterator75);
        java.util.Set set77 = defaultedMap68.entrySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap68);
        defaultedMap68.clear();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82);
        java.lang.Object obj85 = defaultedMap81.get((java.lang.Object) iterator82);
        java.util.Set set86 = defaultedMap81.keySet();
        java.util.Set set87 = defaultedMap81.keySet();
        boolean b88 = defaultedMap68.containsKey((java.lang.Object) set87);
        java.lang.Object obj89 = defaultedMap17.get((java.lang.Object) b88);
        java.util.Collection collection90 = defaultedMap17.values();
        java.lang.String str91 = defaultedMap17.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 100 + "'", obj72.equals((byte) 100));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (byte) 100 + "'", obj85.equals((byte) 100));
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (byte) 100 + "'", obj89.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection90);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        java.util.Iterator iterator4 = null;
        filterIterator1.setIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator1.getIterator();
        collections.Predicate predicate7 = filterIterator1.getPredicate();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        boolean b44 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        java.util.Set set29 = defaultedMap1.keySet();
        int i30 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set33 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap34.get(obj35);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) filterIterator51);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) predicate57);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) filterIterator60);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator70);
        java.lang.Object obj73 = defaultedMap69.get((java.lang.Object) iterator70);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        filterIterator76.setPredicate(predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        filterIterator76.setPredicate(predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate79);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate66, predicate79);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj86 = defaultedMap84.get((java.lang.Object) 1.0d);
        int i87 = defaultedMap84.size();
        java.lang.Object obj88 = defaultedMap56.get((java.lang.Object) defaultedMap84);
        boolean b89 = defaultedMap17.equals(obj88);
        java.lang.String str90 = defaultedMap17.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (byte) 100 + "'", obj73.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (byte) 100 + "'", obj86.equals((byte) 100));
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) iterator49);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.lang.Object obj56 = defaultedMap48.put((java.lang.Object) 0L, (java.lang.Object) filterIterator55);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) predicate59, obj61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator65);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) iterator65);
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        java.lang.Object obj72 = defaultedMap64.put((java.lang.Object) 0L, (java.lang.Object) filterIterator71);
        java.util.Set set73 = defaultedMap64.entrySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap64);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator81);
        java.lang.Object obj84 = defaultedMap80.get((java.lang.Object) iterator81);
        java.util.Iterator iterator86 = null;
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator86);
        java.lang.Object obj88 = defaultedMap80.put((java.lang.Object) 0L, (java.lang.Object) filterIterator87);
        java.util.Iterator iterator89 = null;
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator(iterator89);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        filterIterator90.setPredicate(predicate91);
        java.lang.Object obj93 = null;
        java.lang.Object obj94 = defaultedMap80.put((java.lang.Object) predicate91, obj93);
        java.util.Set set95 = defaultedMap80.keySet();
        java.lang.Object obj96 = defaultedMap77.get((java.lang.Object) set95);
        java.lang.Object obj97 = defaultedMap1.get((java.lang.Object) defaultedMap77);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 100 + "'", obj52.equals((byte) 100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (byte) 100 + "'", obj68.equals((byte) 100));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) 100 + "'", obj84.equals((byte) 100));
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertNotNull(obj96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + (byte) 100 + "'", obj97.equals((byte) 100));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Set set35 = defaultedMap30.keySet();
        java.util.Set set36 = defaultedMap30.keySet();
        boolean b37 = defaultedMap17.containsKey((java.lang.Object) set36);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) predicate45);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58);
        java.lang.Object obj61 = defaultedMap57.get((java.lang.Object) iterator58);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator64.setPredicate(predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate62, predicate67);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate54, predicate67);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 1.0d);
        int i75 = defaultedMap72.size();
        java.lang.Object obj76 = defaultedMap44.get((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator79);
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) iterator79);
        java.util.Iterator iterator84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator84);
        java.lang.Object obj86 = defaultedMap78.put((java.lang.Object) 0L, (java.lang.Object) filterIterator85);
        java.util.Iterator iterator87 = null;
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator(iterator87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        filterIterator88.setPredicate(predicate89);
        java.lang.Object obj91 = null;
        java.lang.Object obj92 = defaultedMap78.put((java.lang.Object) predicate89, obj91);
        java.util.Set set93 = defaultedMap78.keySet();
        java.util.Set set94 = defaultedMap78.keySet();
        java.lang.Object obj95 = defaultedMap17.put(obj76, (java.lang.Object) set94);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (byte) 100 + "'", obj61.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (byte) 100 + "'", obj74.equals((byte) 100));
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (byte) 100 + "'", obj82.equals((byte) 100));
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = defaultedMap7.equals((java.lang.Object) predicateUtils8);
        java.util.Collection collection10 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) iterator13);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) 0L, (java.lang.Object) filterIterator19);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) predicate23, obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) iterator29);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj36 = defaultedMap28.put((java.lang.Object) 0L, (java.lang.Object) filterIterator35);
        java.util.Set set37 = defaultedMap28.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap28);
        java.util.Set set39 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42);
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) iterator42);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.lang.Object obj49 = defaultedMap41.put((java.lang.Object) 0L, (java.lang.Object) filterIterator48);
        java.util.Set set50 = defaultedMap41.entrySet();
        boolean b51 = defaultedMap12.containsValue((java.lang.Object) set50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap12);
        java.lang.Object obj53 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) map52);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) 100 + "'", obj16.equals((byte) 100));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 100 + "'", obj32.equals((byte) 100));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 100 + "'", obj45.equals((byte) 100));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.keySet();
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        defaultedMap1.clear();
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) predicate18);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate25);
        collections.Predicate predicate27 = filterIterator22.getPredicate();
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate32);
        filterIterator22.setPredicate(predicate32);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) filterIterator22);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = filterIterator37.getPredicate();
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        filterIterator44.setPredicate(predicate47);
        filterIterator37.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate47);
        try {
            boolean b51 = filterIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 100 + "'", obj20.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Collection collection50 = defaultedMap17.values();
        java.lang.String str51 = defaultedMap17.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) iterator7);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj14 = defaultedMap6.put((java.lang.Object) 0L, (java.lang.Object) filterIterator13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap6.put((java.lang.Object) predicate17, obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) iterator23);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.lang.Object obj30 = defaultedMap22.put((java.lang.Object) 0L, (java.lang.Object) filterIterator29);
        java.util.Set set31 = defaultedMap22.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap22);
        java.util.Set set33 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) iterator36);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.lang.Object obj43 = defaultedMap35.put((java.lang.Object) 0L, (java.lang.Object) filterIterator42);
        java.util.Set set44 = defaultedMap35.entrySet();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) set44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Factory factory47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate(map46, factory47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 100 + "'", obj10.equals((byte) 100));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 100 + "'", obj26.equals((byte) 100));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) 100 + "'", obj39.equals((byte) 100));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) iterator15);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj22 = defaultedMap14.put((java.lang.Object) 0L, (java.lang.Object) filterIterator21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) predicate25, obj27);
        java.util.Set set29 = defaultedMap14.keySet();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate35);
        java.lang.Object obj37 = defaultedMap14.put((java.lang.Object) 0.0f, (java.lang.Object) predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate35);
        java.util.Iterator iterator39 = filterIterator1.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(iterator39);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) iterator15);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj22 = defaultedMap14.put((java.lang.Object) 0L, (java.lang.Object) filterIterator21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) predicate25, obj27);
        java.util.Set set29 = defaultedMap14.keySet();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate35);
        java.lang.Object obj37 = defaultedMap14.put((java.lang.Object) 0.0f, (java.lang.Object) predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate35);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        collections.Predicate predicate10 = filterIterator8.getPredicate();
        try {
            boolean b11 = filterIterator8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) iterator49);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.lang.Object obj56 = defaultedMap48.put((java.lang.Object) 0L, (java.lang.Object) filterIterator55);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) predicate59, obj61);
        java.lang.Object obj63 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) predicate59);
        filterIterator14.setPredicate(predicate59);
        java.util.Iterator iterator65 = filterIterator14.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 100 + "'", obj52.equals((byte) 100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(iterator65);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) iterator32);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.lang.Object obj39 = defaultedMap31.put((java.lang.Object) 0L, (java.lang.Object) filterIterator38);
        java.util.Set set40 = defaultedMap31.entrySet();
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap31.get((java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap1.get(obj50);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) filterIterator53);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate59, predicate61);
        collections.Factory factory63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate(map62, factory63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (byte) 100 + "'", obj35.equals((byte) 100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (byte) 100 + "'", obj51.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) iterator17);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) 0L, (java.lang.Object) filterIterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) predicate27, obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) iterator33);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.lang.Object obj40 = defaultedMap32.put((java.lang.Object) 0L, (java.lang.Object) filterIterator39);
        java.util.Set set41 = defaultedMap32.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap32);
        int i43 = defaultedMap16.size();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) iterator47);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.lang.Object obj54 = defaultedMap46.put((java.lang.Object) 0L, (java.lang.Object) filterIterator53);
        java.util.Set set55 = defaultedMap46.entrySet();
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate60);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) filterIterator57);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) predicate63);
        java.lang.Object obj65 = defaultedMap46.get((java.lang.Object) predicate63);
        java.lang.Object obj66 = defaultedMap16.get(obj65);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) filterIterator68);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate74, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate76);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 100 + "'", obj20.equals((byte) 100));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (byte) 100 + "'", obj65.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (byte) 100 + "'", obj66.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) iterator9);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.lang.Object obj16 = defaultedMap8.put((java.lang.Object) 0L, (java.lang.Object) filterIterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) predicate19, obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) iterator25);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.lang.Object obj32 = defaultedMap24.put((java.lang.Object) 0L, (java.lang.Object) filterIterator31);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator34.setPredicate(predicate35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) predicate35, obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41);
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) iterator41);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.lang.Object obj48 = defaultedMap40.put((java.lang.Object) 0L, (java.lang.Object) filterIterator47);
        java.util.Set set49 = defaultedMap40.entrySet();
        defaultedMap24.putAll((java.util.Map) defaultedMap40);
        int i51 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        boolean b55 = defaultedMap53.equals((java.lang.Object) predicateUtils54);
        java.lang.Object obj56 = defaultedMap8.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap53);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate61);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) filterIterator58);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) predicate64);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) filterIterator67);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator77 = null;
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77);
        java.lang.Object obj80 = defaultedMap76.get((java.lang.Object) iterator77);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        filterIterator83.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate81, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate73, predicate86);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj93 = defaultedMap91.get((java.lang.Object) 1.0d);
        int i94 = defaultedMap91.size();
        java.lang.Object obj95 = defaultedMap63.get((java.lang.Object) defaultedMap91);
        boolean b96 = defaultedMap24.equals(obj95);
        java.util.Set set97 = defaultedMap24.entrySet();
        java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 100 + "'", obj12.equals((byte) 100));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) 100 + "'", obj28.equals((byte) 100));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (byte) 100 + "'", obj44.equals((byte) 100));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(i51 == 2);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (byte) 100 + "'", obj80.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + (byte) 100 + "'", obj93.equals((byte) 100));
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        boolean b28 = defaultedMap17.isEmpty();
        boolean b29 = defaultedMap17.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Set set50 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.lang.Object obj60 = defaultedMap52.put((java.lang.Object) 0L, (java.lang.Object) filterIterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) predicate63, obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69);
        java.lang.Object obj72 = defaultedMap68.get((java.lang.Object) iterator69);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        java.lang.Object obj76 = defaultedMap68.put((java.lang.Object) 0L, (java.lang.Object) filterIterator75);
        java.util.Set set77 = defaultedMap68.entrySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap68);
        defaultedMap68.clear();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82);
        java.lang.Object obj85 = defaultedMap81.get((java.lang.Object) iterator82);
        java.util.Set set86 = defaultedMap81.keySet();
        java.util.Set set87 = defaultedMap81.keySet();
        boolean b88 = defaultedMap68.containsKey((java.lang.Object) set87);
        java.lang.Object obj89 = defaultedMap17.get((java.lang.Object) b88);
        java.util.Collection collection90 = defaultedMap17.values();
        java.util.Set set91 = defaultedMap17.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 100 + "'", obj72.equals((byte) 100));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (byte) 100 + "'", obj85.equals((byte) 100));
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (byte) 100 + "'", obj89.equals((byte) 100));
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(set91);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) iterator12);
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) collection19);
        java.util.Set set21 = defaultedMap1.entrySet();
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        try {
            boolean b28 = filterIterator27.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte) 100 + "'", obj15.equals((byte) 100));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (byte) 100 + "'", obj26.equals((byte) 100));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) iterator47);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate51, predicate56);
        filterIterator41.setPredicate(predicate56);
        try {
            boolean b60 = filterIterator41.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (byte) 100 + "'", obj50.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        int i28 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) filterIterator31);
        try {
            filterIterator31.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        try {
            boolean b16 = filterIterator14.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(predicate15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        java.util.Set set30 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicate7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) iterator20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator26.setPredicate(predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate16, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 1.0d);
        int i37 = defaultedMap34.size();
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator40);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        defaultedMap34.putAll((java.util.Map) defaultedMap45);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte) 100 + "'", obj23.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicate16);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) iterator29);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate25, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 1.0d);
        int i46 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap15.get((java.lang.Object) defaultedMap43);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 1.0d);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 10);
        java.lang.Object obj55 = defaultedMap15.remove((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (byte) 100 + "'", obj32.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 100 + "'", obj45.equals((byte) 100));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 100 + "'", obj52.equals((byte) 100));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate20);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate26);
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) predicate26, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) iterator33);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate26, predicate37);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte) 100 + "'", obj3.equals((byte) 100));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte) 100 + "'", obj36.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap17.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) iterator31);
        java.util.Set set35 = defaultedMap30.keySet();
        java.util.Set set36 = defaultedMap30.keySet();
        boolean b37 = defaultedMap17.containsKey((java.lang.Object) set36);
        boolean b39 = defaultedMap17.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42);
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) iterator42);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.lang.Object obj49 = defaultedMap41.put((java.lang.Object) 0L, (java.lang.Object) filterIterator48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        java.lang.Object obj51 = defaultedMap17.remove((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) 100 + "'", obj34.equals((byte) 100));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 100 + "'", obj45.equals((byte) 100));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.Predicate predicate6 = filterIterator1.getPredicate();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate11);
        filterIterator1.setPredicate(predicate11);
        collections.Predicate predicate14 = filterIterator1.getPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate15);
        collections.Predicate predicate17 = filterIterator1.getPredicate();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 1.0d);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) iterator17);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) 0L, (java.lang.Object) filterIterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate29);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate35);
        java.lang.Object obj39 = defaultedMap16.put((java.lang.Object) predicate35, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42);
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) iterator42);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate35, predicate46);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        java.util.Iterator iterator60 = null;
        filterIterator57.setIterator(iterator60);
        boolean b62 = defaultedMap10.containsValue((java.lang.Object) iterator60);
        java.lang.Object obj63 = defaultedMap1.remove((java.lang.Object) iterator60);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) 100 + "'", obj12.equals((byte) 100));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) 100 + "'", obj20.equals((byte) 100));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (byte) 100 + "'", obj45.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Set set17 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap14.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) iterator22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) iterator28);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) 0L, (java.lang.Object) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) predicate38, obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) iterator44);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.lang.Object obj51 = defaultedMap43.put((java.lang.Object) 0L, (java.lang.Object) filterIterator50);
        java.util.Set set52 = defaultedMap43.entrySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap43);
        int i54 = defaultedMap27.size();
        java.util.Set set55 = defaultedMap27.keySet();
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj64 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) filterIterator61);
        boolean b65 = defaultedMap14.containsKey(obj64);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) 100 + "'", obj25.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 100 + "'", obj47.equals((byte) 100));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) true);
        java.lang.String str11 = defaultedMap6.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1.0d);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte) 100 + "'", obj3.equals((byte) 100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Collection collection50 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.lang.Object obj60 = defaultedMap52.put((java.lang.Object) 0L, (java.lang.Object) filterIterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) predicate63, obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69);
        java.lang.Object obj72 = defaultedMap68.get((java.lang.Object) iterator69);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        java.lang.Object obj76 = defaultedMap68.put((java.lang.Object) 0L, (java.lang.Object) filterIterator75);
        java.util.Set set77 = defaultedMap68.entrySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap68);
        int i79 = defaultedMap52.size();
        java.util.Set set80 = defaultedMap52.keySet();
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        filterIterator82.setPredicate(predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate85);
        java.util.Iterator iterator87 = null;
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator(iterator87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        filterIterator88.setPredicate(predicate89);
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        filterIterator88.setPredicate(predicate91);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate91);
        java.lang.Object obj94 = defaultedMap52.get((java.lang.Object) filterIterator93);
        boolean b95 = defaultedMap17.equals((java.lang.Object) defaultedMap52);
        int i96 = defaultedMap17.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 100 + "'", obj72.equals((byte) 100));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(i79 == 2);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + (byte) 100 + "'", obj94.equals((byte) 100));
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(i96 == 2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.lang.Object obj13 = defaultedMap5.put((java.lang.Object) 0L, (java.lang.Object) filterIterator12);
        java.util.Set set14 = defaultedMap5.entrySet();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) predicate22);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) predicate22);
        filterIterator2.setPredicate(predicate22);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 100 + "'", obj9.equals((byte) 100));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) 100 + "'", obj24.equals((byte) 100));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        java.util.Set set16 = defaultedMap1.keySet();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate22);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) predicate22);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate29);
        collections.Predicate predicate31 = filterIterator26.getPredicate();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) iterator35);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) iterator35);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (byte) 100 + "'", obj38.equals((byte) 100));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) iterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) iterator10);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.lang.Object obj17 = defaultedMap9.put((java.lang.Object) 0L, (java.lang.Object) filterIterator16);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap9.put((java.lang.Object) predicate20, obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) iterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.lang.Object obj33 = defaultedMap25.put((java.lang.Object) 0L, (java.lang.Object) filterIterator32);
        java.util.Set set34 = defaultedMap25.entrySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap25);
        int i36 = defaultedMap9.size();
        java.util.Set set37 = defaultedMap9.keySet();
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        filterIterator43.setPredicate(predicate44);
        java.lang.Object obj46 = defaultedMap3.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) iterator49);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        filterIterator55.setPredicate(predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate58);
        filterIterator43.setPredicate(predicate58);
        filterIterator1.setPredicate(predicate58);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 100 + "'", obj7.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (byte) 100 + "'", obj13.equals((byte) 100));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 100 + "'", obj29.equals((byte) 100));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (byte) 100 + "'", obj52.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Set set50 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.lang.Object obj60 = defaultedMap52.put((java.lang.Object) 0L, (java.lang.Object) filterIterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) predicate63, obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69);
        java.lang.Object obj72 = defaultedMap68.get((java.lang.Object) iterator69);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        java.lang.Object obj76 = defaultedMap68.put((java.lang.Object) 0L, (java.lang.Object) filterIterator75);
        java.util.Set set77 = defaultedMap68.entrySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap68);
        defaultedMap68.clear();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator82);
        java.lang.Object obj85 = defaultedMap81.get((java.lang.Object) iterator82);
        java.util.Set set86 = defaultedMap81.keySet();
        java.util.Set set87 = defaultedMap81.keySet();
        boolean b88 = defaultedMap68.containsKey((java.lang.Object) set87);
        java.lang.Object obj89 = defaultedMap17.get((java.lang.Object) b88);
        java.util.Iterator iterator90 = null;
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator(iterator90);
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        filterIterator91.setPredicate(predicate92);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator91, predicate94);
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) filterIterator91);
        boolean b97 = defaultedMap17.equals((java.lang.Object) filterIterator91);
        collections.iterators.FilterIterator filterIterator98 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator91);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (byte) 100 + "'", obj72.equals((byte) 100));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (byte) 100 + "'", obj85.equals((byte) 100));
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (byte) 100 + "'", obj89.equals((byte) 100));
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.lang.String str6 = defaultedMap1.toString();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 0);
        defaultedMap1.clear();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) false);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) iterator8);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.lang.Object obj15 = defaultedMap7.put((java.lang.Object) 0L, (java.lang.Object) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) predicate18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) iterator24);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.lang.Object obj31 = defaultedMap23.put((java.lang.Object) 0L, (java.lang.Object) filterIterator30);
        java.util.Set set32 = defaultedMap23.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap23);
        int i34 = defaultedMap7.size();
        java.util.Set set35 = defaultedMap7.keySet();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) 100 + "'", obj11.equals((byte) 100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        java.util.Set set16 = defaultedMap1.keySet();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate22);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) predicate22);
        int i25 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) iterator28);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) 0L, (java.lang.Object) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) predicate38, obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) iterator44);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.lang.Object obj51 = defaultedMap43.put((java.lang.Object) 0L, (java.lang.Object) filterIterator50);
        java.util.Set set52 = defaultedMap43.entrySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) iterator57);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        java.lang.Object obj64 = defaultedMap56.put((java.lang.Object) 0L, (java.lang.Object) filterIterator63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) filterIterator63);
        defaultedMap1.putAll((java.util.Map) defaultedMap65);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 3);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 100 + "'", obj47.equals((byte) 100));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (byte) 100 + "'", obj54.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (byte) 100 + "'", obj60.equals((byte) 100));
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) iterator2);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) predicate12, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) iterator18);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.lang.Object obj25 = defaultedMap17.put((java.lang.Object) 0L, (java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) predicate28, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) iterator34);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.lang.Object obj41 = defaultedMap33.put((java.lang.Object) 0L, (java.lang.Object) filterIterator40);
        java.util.Set set42 = defaultedMap33.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap33);
        int i44 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        collections.PredicateUtils predicateUtils47 = new collections.PredicateUtils();
        boolean b48 = defaultedMap46.equals((java.lang.Object) predicateUtils47);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap46);
        java.util.Set set50 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator53);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) iterator53);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.lang.Object obj60 = defaultedMap52.put((java.lang.Object) 0L, (java.lang.Object) filterIterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) predicate63, obj65);
        java.lang.Object obj67 = defaultedMap17.remove((java.lang.Object) defaultedMap52);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (byte) 100 + "'", obj21.equals((byte) 100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte) 100 + "'", obj37.equals((byte) 100));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) 100 + "'", obj56.equals((byte) 100));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
    }
}

