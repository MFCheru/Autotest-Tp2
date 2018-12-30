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
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        try {
            java.lang.Object obj3 = filterIterator2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        try {
            boolean b4 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate12);
        filterIterator6.setPredicate(predicate12);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate12);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate7);
        filterIterator1.setPredicate(predicate7);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        try {
            boolean b8 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        try {
            java.lang.Object obj17 = filterIterator14.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            boolean b9 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 10.0d + "'", obj12.equals(10.0d));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        try {
            filterIterator14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        try {
            boolean b8 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate12);
        filterIterator6.setPredicate(predicate12);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) predicate29);
        java.util.Set set33 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0d + "'", obj32.equals(10.0d));
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap10.keySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate21);
        filterIterator15.setPredicate(predicate21);
        boolean b25 = defaultedMap10.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate38);
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate38);
        try {
            boolean b43 = filterIterator8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b4 = defaultedMap2.containsKey((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap2.keySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        filterIterator12.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate13);
        filterIterator7.setPredicate(predicate13);
        boolean b17 = defaultedMap2.containsKey((java.lang.Object) predicate13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate25);
        filterIterator19.setPredicate(predicate25);
        try {
            java.util.Map map29 = collections.map.PredicatedMap.decorate(map0, predicate13, predicate25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b4 = defaultedMap2.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        filterIterator12.setPredicate(predicate13);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate8, predicate13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap26.keySet();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator36.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate37);
        filterIterator31.setPredicate(predicate37);
        boolean b41 = defaultedMap26.containsKey((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate49);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate49, predicate54);
        java.lang.Object obj57 = defaultedMap26.get((java.lang.Object) predicate54);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate54);
        try {
            java.util.Map map59 = collections.map.PredicatedMap.decorate(map0, predicate13, predicate54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10.0d + "'", obj23.equals(10.0d));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 10.0d + "'", obj57.equals(10.0d));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap19.remove((java.lang.Object) "hi!");
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicateUtils27);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate12);
        filterIterator6.setPredicate(predicate12);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) filterIterator41);
        boolean b46 = defaultedMap38.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.lang.Object obj49 = defaultedMap34.put((java.lang.Object) defaultedMap38, (java.lang.Object) filterIterator47);
        java.util.Set set50 = defaultedMap38.entrySet();
        java.lang.Object obj51 = defaultedMap1.remove((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0d + "'", obj32.equals(10.0d));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 10.0d + "'", obj44.equals(10.0d));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Set set18 = defaultedMap13.keySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d + "'", obj16.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.util.Set set14 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator19);
        try {
            boolean b27 = filterIterator19.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            java.lang.Object obj9 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) filterIterator17);
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) defaultedMap14, (java.lang.Object) filterIterator23);
        java.util.Set set26 = defaultedMap14.entrySet();
        java.lang.String str27 = defaultedMap14.toString();
        boolean b29 = defaultedMap14.containsKey((java.lang.Object) '#');
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) b29);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0d + "'", obj20.equals(10.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        int i2 = defaultedMap1.size();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) filterIterator10);
        java.util.Set set14 = defaultedMap5.keySet();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap18.keySet();
        java.lang.Object obj29 = defaultedMap5.put((java.lang.Object) set27, (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10.0d + "'", obj13.equals(10.0d));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0d + "'", obj26.equals(10.0d));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            boolean b9 = filterIterator8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) map3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator19);
        java.util.Iterator iterator27 = filterIterator19.getIterator();
        try {
            java.lang.Object obj28 = filterIterator19.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator3.setPredicate(predicate4);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.util.Collection collection18 = defaultedMap5.values();
        java.lang.String str19 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = defaultedMap21.get((java.lang.Object) filterIterator24);
        java.util.Set set28 = defaultedMap21.keySet();
        boolean b29 = defaultedMap21.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap21);
        java.util.Set set31 = defaultedMap21.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0d + "'", obj27.equals(10.0d));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) filterIterator15);
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) defaultedMap12, (java.lang.Object) filterIterator21);
        java.util.Set set24 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap26.keySet();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        java.util.Iterator iterator34 = null;
        collections.Predicate predicate35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator36.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate37);
        filterIterator31.setPredicate(predicate37);
        boolean b41 = defaultedMap26.containsKey((java.lang.Object) predicate37);
        java.util.Set set42 = defaultedMap26.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set46 = defaultedMap45.keySet();
        java.lang.Object obj48 = defaultedMap45.get((java.lang.Object) 1.0d);
        boolean b49 = defaultedMap12.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) b49, obj50);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 10.0d + "'", obj48.equals(10.0d));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate7);
        filterIterator1.setPredicate(predicate7);
        try {
            boolean b11 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) set3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) filterIterator9);
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) (byte) 1);
        int i15 = defaultedMap6.size();
        java.util.Collection collection16 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) 1.0d);
        java.lang.Object obj22 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap4.remove((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 10.0d + "'", obj12.equals(10.0d));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0d + "'", obj21.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0d + "'", obj22.equals(10.0d));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        try {
            filterIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap19.keySet();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        filterIterator24.setPredicate(predicate30);
        boolean b34 = defaultedMap19.containsKey((java.lang.Object) predicate30);
        java.util.Set set35 = defaultedMap19.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) defaultedMap38);
        java.lang.String str43 = defaultedMap5.toString();
        java.util.Set set44 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.Object obj4 = null;
        boolean b5 = defaultedMap1.equals(obj4);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        try {
            java.lang.Object obj10 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap18.keySet();
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) defaultedMap18, (java.lang.Object) 10L);
        boolean b30 = defaultedMap11.containsKey((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0d + "'", obj26.equals(10.0d));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        int i12 = defaultedMap1.size();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) filterIterator14);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        boolean b16 = defaultedMap13.isEmpty();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) filterIterator18);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '#');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap26.keySet();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj32 = defaultedMap26.remove((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj42 = defaultedMap34.get((java.lang.Object) filterIterator39);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) '#');
        java.util.Collection collection45 = defaultedMap34.values();
        int i46 = defaultedMap34.size();
        java.lang.Object obj47 = defaultedMap26.get((java.lang.Object) i46);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0d + "'", obj21.equals(10.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0d + "'", obj30.equals(10.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 10.0d + "'", obj42.equals(10.0d));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 10.0d + "'", obj47.equals(10.0d));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) filterIterator7);
        boolean b12 = defaultedMap4.containsValue((java.lang.Object) (byte) 1);
        int i13 = defaultedMap4.size();
        java.util.Collection collection14 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap4.put((java.lang.Object) b19, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) filterIterator30);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        java.lang.Object obj38 = defaultedMap23.put((java.lang.Object) defaultedMap27, (java.lang.Object) filterIterator36);
        boolean b39 = defaultedMap23.isEmpty();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        filterIterator44.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate45);
        boolean b48 = defaultedMap23.containsValue((java.lang.Object) filterIterator41);
        java.lang.Object obj49 = defaultedMap4.get((java.lang.Object) defaultedMap23);
        java.lang.String str50 = defaultedMap4.toString();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        java.lang.String str52 = defaultedMap4.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0d + "'", obj10.equals(10.0d));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10.0d + "'", obj33.equals(10.0d));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 10.0d + "'", obj49.equals(10.0d));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{false=null}" + "'", str50.equals("{false=null}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 10 + "'", obj51.equals(10));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{false=null}" + "'", str52.equals("{false=null}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        java.util.Iterator iterator10 = filterIterator1.getIterator();
        collections.Predicate predicate11 = filterIterator1.getPredicate();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(predicate11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap19.keySet();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        filterIterator24.setPredicate(predicate30);
        boolean b34 = defaultedMap19.containsKey((java.lang.Object) predicate30);
        java.util.Set set35 = defaultedMap19.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.Factory factory37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) filterIterator22);
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        int i28 = defaultedMap19.size();
        java.util.Collection collection29 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Set set31 = defaultedMap19.entrySet();
        java.util.Set set32 = defaultedMap19.keySet();
        java.lang.String str33 = defaultedMap19.toString();
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) str33);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d + "'", obj16.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10.0d + "'", obj25.equals(10.0d));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) filterIterator14);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b20 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) filterIterator14);
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.lang.Object obj22 = defaultedMap7.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator20);
        java.util.Set set23 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap25.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate36);
        filterIterator30.setPredicate(predicate36);
        boolean b40 = defaultedMap25.containsKey((java.lang.Object) predicate36);
        java.util.Set set41 = defaultedMap25.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        boolean b44 = defaultedMap1.isEmpty();
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 10.0d + "'", obj43.equals(10.0d));
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            boolean b13 = filterIterator12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator19);
        java.lang.String str27 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        org.junit.Assert.assertNull(predicate3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        filterIterator11.setPredicate(predicate17);
        try {
            boolean b21 = filterIterator11.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate12);
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate12);
        int i15 = defaultedMap1.size();
        java.lang.String str16 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap18.keySet();
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0d + "'", obj26.equals(10.0d));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10.0d + "'", obj28.equals(10.0d));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) filterIterator13);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        java.util.Iterator iterator12 = null;
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator12, predicate17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate17);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) filterIterator15);
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) defaultedMap12, (java.lang.Object) filterIterator21);
        java.util.Set set24 = defaultedMap12.entrySet();
        java.lang.String str25 = defaultedMap12.toString();
        defaultedMap12.clear();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator34.setPredicate(predicate35);
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) filterIterator34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap39.keySet();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        filterIterator49.setPredicate(predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate50);
        filterIterator44.setPredicate(predicate50);
        boolean b54 = defaultedMap39.containsKey((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator61.setPredicate(predicate62);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator66.setPredicate(predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate67);
        java.lang.Object obj70 = defaultedMap39.get((java.lang.Object) predicate67);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        java.util.Iterator iterator73 = null;
        collections.Predicate predicate74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        filterIterator75.setPredicate(predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate67, predicate76);
        java.lang.Object obj80 = defaultedMap12.get((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0d + "'", obj27.equals(10.0d));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10.0d + "'", obj37.equals(10.0d));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 10.0d + "'", obj70.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 10.0d + "'", obj80.equals(10.0d));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) filterIterator14);
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.lang.Object obj22 = defaultedMap7.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator20);
        java.util.Set set23 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap25.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate36);
        filterIterator30.setPredicate(predicate36);
        boolean b40 = defaultedMap25.containsKey((java.lang.Object) predicate36);
        java.util.Set set41 = defaultedMap25.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj43 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        boolean b44 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 10.0d + "'", obj43.equals(10.0d));
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator19);
        java.util.Iterator iterator27 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        filterIterator19.setIterator((java.util.Iterator) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator47 = null;
        collections.Predicate predicate48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        filterIterator49.setPredicate(predicate50);
        java.lang.Object obj52 = defaultedMap46.get((java.lang.Object) filterIterator49);
        boolean b54 = defaultedMap46.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        java.lang.Object obj57 = defaultedMap42.put((java.lang.Object) defaultedMap46, (java.lang.Object) filterIterator55);
        boolean b58 = defaultedMap42.isEmpty();
        int i59 = defaultedMap42.size();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 100L);
        java.util.Set set64 = defaultedMap61.keySet();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        filterIterator71.setPredicate(predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate72);
        filterIterator66.setPredicate(predicate72);
        boolean b76 = defaultedMap61.containsKey((java.lang.Object) predicate72);
        java.util.Iterator iterator77 = null;
        collections.Predicate predicate78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        filterIterator79.setPredicate(predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate72, predicate80);
        filterIterator39.setPredicate(predicate72);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10.0d + "'", obj35.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 10.0d + "'", obj52.equals(10.0d));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate13);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) filterIterator15);
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.lang.Object obj23 = defaultedMap8.put((java.lang.Object) defaultedMap12, (java.lang.Object) filterIterator21);
        java.util.Set set24 = defaultedMap12.entrySet();
        java.lang.String str25 = defaultedMap12.toString();
        defaultedMap12.clear();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.lang.String str28 = defaultedMap12.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0d + "'", obj27.equals(10.0d));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate20);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) filterIterator19);
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.lang.Object obj27 = defaultedMap12.put((java.lang.Object) defaultedMap16, (java.lang.Object) filterIterator25);
        boolean b28 = defaultedMap12.isEmpty();
        int i29 = defaultedMap12.size();
        java.lang.String str30 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100L);
        java.util.Set set44 = defaultedMap41.keySet();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate52);
        filterIterator46.setPredicate(predicate52);
        boolean b56 = defaultedMap41.containsKey((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator63.setPredicate(predicate64);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        filterIterator68.setPredicate(predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate69);
        java.lang.Object obj72 = defaultedMap41.get((java.lang.Object) predicate69);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate69);
        boolean b74 = defaultedMap12.containsValue((java.lang.Object) predicate69);
        java.lang.Object obj75 = defaultedMap1.put((java.lang.Object) filterIterator8, (java.lang.Object) predicate69);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate76);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0d + "'", obj22.equals(10.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 10.0d + "'", obj38.equals(10.0d));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 10.0d + "'", obj72.equals(10.0d));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate18);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection13 = defaultedMap12.values();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        java.lang.Object obj32 = defaultedMap24.get((java.lang.Object) filterIterator29);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) '#');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0d + "'", obj32.equals(10.0d));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10.0d + "'", obj35.equals(10.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) filterIterator18);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '#');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.util.Set set25 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator34.setPredicate(predicate35);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) filterIterator34);
        boolean b39 = defaultedMap31.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.lang.Object obj42 = defaultedMap27.put((java.lang.Object) defaultedMap31, (java.lang.Object) filterIterator40);
        boolean b43 = defaultedMap27.isEmpty();
        int i44 = defaultedMap27.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        filterIterator54.setPredicate(predicate55);
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) filterIterator54);
        boolean b59 = defaultedMap51.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        java.lang.Object obj62 = defaultedMap47.put((java.lang.Object) defaultedMap51, (java.lang.Object) filterIterator60);
        java.util.Set set63 = defaultedMap51.entrySet();
        java.lang.String str64 = defaultedMap51.toString();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1.0d));
        java.lang.Object obj67 = defaultedMap13.remove((java.lang.Object) map66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0d + "'", obj21.equals(10.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10.0d + "'", obj37.equals(10.0d));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 10.0d + "'", obj57.equals(10.0d));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Iterator iterator46 = filterIterator38.getIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate47);
        java.util.Iterator iterator51 = null;
        collections.Predicate predicate52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate54);
        java.util.Iterator iterator56 = filterIterator53.getIterator();
        filterIterator26.setIterator((java.util.Iterator) filterIterator53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 100L);
        java.util.Set set62 = defaultedMap59.keySet();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate70);
        filterIterator64.setPredicate(predicate70);
        boolean b74 = defaultedMap59.containsKey((java.lang.Object) predicate70);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b78 = defaultedMap76.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator79 = null;
        collections.Predicate predicate80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator79, predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        filterIterator81.setPredicate(predicate82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        filterIterator86.setPredicate(predicate87);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate82, predicate87);
        java.lang.Object obj90 = defaultedMap59.get((java.lang.Object) predicate87);
        filterIterator26.setPredicate(predicate87);
        java.lang.Object obj92 = defaultedMap5.get((java.lang.Object) predicate87);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 10.0d + "'", obj34.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 10.0d + "'", obj90.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 10.0d + "'", obj92.equals(10.0d));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = defaultedMap21.get((java.lang.Object) filterIterator24);
        boolean b29 = defaultedMap21.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        java.lang.Object obj32 = defaultedMap17.put((java.lang.Object) defaultedMap21, (java.lang.Object) filterIterator30);
        java.util.Set set33 = defaultedMap21.entrySet();
        java.lang.String str34 = defaultedMap21.toString();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator42 = null;
        collections.Predicate predicate43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        filterIterator44.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate45);
        java.lang.Object obj48 = defaultedMap21.put((java.lang.Object) map39, (java.lang.Object) filterIterator41);
        java.lang.Object obj49 = defaultedMap13.remove(obj48);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0d + "'", obj27.equals(10.0d));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        defaultedMap1.clear();
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap8.keySet();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate19);
        filterIterator13.setPredicate(predicate19);
        boolean b23 = defaultedMap8.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate36);
        java.lang.Object obj39 = defaultedMap8.get((java.lang.Object) predicate36);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set41 = defaultedMap8.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10.0d + "'", obj39.equals(10.0d));
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) filterIterator22);
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        int i28 = defaultedMap19.size();
        java.util.Collection collection29 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Set set31 = defaultedMap19.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        java.lang.String str33 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) filterIterator38);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        java.util.Iterator iterator53 = filterIterator45.getIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate54);
        boolean b57 = defaultedMap19.containsValue((java.lang.Object) filterIterator42);
        try {
            filterIterator42.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10.0d + "'", obj25.equals(10.0d));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator19);
        java.util.Iterator iterator27 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        filterIterator19.setIterator((java.util.Iterator) filterIterator39);
        try {
            filterIterator39.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10.0d + "'", obj35.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        filterIterator8.setIterator((java.util.Iterator) filterIterator12);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator34.setPredicate(predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate30);
        try {
            filterIterator21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator19 = filterIterator11.getIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        try {
            boolean b23 = filterIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(predicate20);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) b16, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator27);
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.lang.Object obj35 = defaultedMap20.put((java.lang.Object) defaultedMap24, (java.lang.Object) filterIterator33);
        boolean b36 = defaultedMap20.isEmpty();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.util.Iterator iterator39 = null;
        collections.Predicate predicate40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate42);
        boolean b45 = defaultedMap20.containsValue((java.lang.Object) filterIterator38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate52);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) filterIterator54);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0d + "'", obj30.equals(10.0d));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 10.0d + "'", obj46.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 10.0d + "'", obj55.equals(10.0d));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator28 = filterIterator20.getIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate29);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100L);
        java.util.Set set44 = defaultedMap41.keySet();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate52);
        filterIterator46.setPredicate(predicate52);
        boolean b56 = defaultedMap41.containsKey((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator63.setPredicate(predicate64);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        filterIterator68.setPredicate(predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate69);
        java.lang.Object obj72 = defaultedMap41.get((java.lang.Object) predicate69);
        filterIterator8.setPredicate(predicate69);
        try {
            java.lang.Object obj74 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d + "'", obj16.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 10.0d + "'", obj72.equals(10.0d));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap10.keySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate21);
        filterIterator15.setPredicate(predicate21);
        boolean b25 = defaultedMap10.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate38);
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate38);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate48);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        filterIterator56.setPredicate(predicate57);
        java.lang.Object obj59 = defaultedMap53.get((java.lang.Object) filterIterator56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator66.setPredicate(predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate67);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        java.util.Iterator iterator71 = filterIterator63.getIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate72);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate72);
        filterIterator42.setIterator((java.util.Iterator) filterIterator51);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 10.0d + "'", obj59.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNotNull(predicate72);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        filterIterator11.setPredicate(predicate17);
        collections.Predicate predicate21 = filterIterator11.getPredicate();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate20);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) filterIterator19);
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.lang.Object obj27 = defaultedMap12.put((java.lang.Object) defaultedMap16, (java.lang.Object) filterIterator25);
        boolean b28 = defaultedMap12.isEmpty();
        int i29 = defaultedMap12.size();
        java.lang.String str30 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100L);
        java.util.Set set44 = defaultedMap41.keySet();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate52);
        filterIterator46.setPredicate(predicate52);
        boolean b56 = defaultedMap41.containsKey((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator61 = null;
        collections.Predicate predicate62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator63.setPredicate(predicate64);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        filterIterator68.setPredicate(predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate69);
        java.lang.Object obj72 = defaultedMap41.get((java.lang.Object) predicate69);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate69);
        boolean b74 = defaultedMap12.containsValue((java.lang.Object) predicate69);
        java.lang.Object obj75 = defaultedMap1.put((java.lang.Object) filterIterator8, (java.lang.Object) predicate69);
        java.util.Iterator iterator76 = filterIterator8.getIterator();
        try {
            java.lang.Object obj77 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0d + "'", obj22.equals(10.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 10.0d + "'", obj38.equals(10.0d));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 10.0d + "'", obj72.equals(10.0d));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(iterator76);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) filterIterator14);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) filterIterator27, (java.lang.Object) true);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0d + "'", obj26.equals(10.0d));
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap1.toString();
        int i13 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap10.keySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate21);
        filterIterator15.setPredicate(predicate21);
        boolean b25 = defaultedMap10.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator30 = null;
        collections.Predicate predicate31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate33);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate38);
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate38);
        collections.Predicate predicate43 = filterIterator42.getPredicate();
        try {
            filterIterator42.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate43);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) "{}");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        java.util.Iterator iterator10 = filterIterator8.getIterator();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) "hi!");
        defaultedMap4.clear();
        java.lang.Object obj9 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) filterIterator18);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '#');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap26.keySet();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj32 = defaultedMap26.remove((java.lang.Object) 100);
        java.util.Set set33 = defaultedMap26.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0d + "'", obj21.equals(10.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0d + "'", obj30.equals(10.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap4.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b7 = defaultedMap4.equals((java.lang.Object) 100.0d);
        java.util.Set set8 = defaultedMap4.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.String str18 = defaultedMap5.toString();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Iterator iterator27 = null;
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator28);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator27, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator48 = null;
        collections.Predicate predicate49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        filterIterator50.setPredicate(predicate51);
        java.lang.Object obj53 = defaultedMap47.get((java.lang.Object) filterIterator50);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        filterIterator60.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate61);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator65 = filterIterator57.getIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate66);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate32, predicate66);
        java.lang.Object obj71 = defaultedMap5.get((java.lang.Object) predicate32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 10.0d + "'", obj42.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 10.0d + "'", obj53.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 10.0d + "'", obj71.equals(10.0d));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) filterIterator16);
        boolean b21 = defaultedMap13.containsValue((java.lang.Object) (byte) 1);
        int i22 = defaultedMap13.size();
        java.util.Collection collection23 = defaultedMap13.values();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) collection23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) filterIterator31);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) '#');
        int i37 = defaultedMap26.size();
        java.util.Set set38 = defaultedMap26.entrySet();
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10.0d + "'", obj19.equals(10.0d));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 10.0d + "'", obj34.equals(10.0d));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10.0d + "'", obj39.equals(10.0d));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate26);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator30 = filterIterator22.getIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate40);
        filterIterator34.setIterator((java.util.Iterator) filterIterator39);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d + "'", obj18.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate40);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator6, predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap25.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate36);
        filterIterator30.setPredicate(predicate36);
        boolean b40 = defaultedMap25.containsKey((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate48);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        filterIterator52.setPredicate(predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate53);
        java.lang.Object obj56 = defaultedMap25.get((java.lang.Object) predicate53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate53, predicate62);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate62);
        boolean b67 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10.0d + "'", obj23.equals(10.0d));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 10.0d + "'", obj56.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        try {
            filterIterator2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator11 = null;
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator28 = filterIterator20.getIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate40);
        filterIterator34.setPredicate(predicate40);
        filterIterator32.setPredicate(predicate40);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d + "'", obj16.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate40);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate9);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate12);
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate12);
        int i15 = defaultedMap1.size();
        java.lang.String str16 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) filterIterator21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.Predicate predicate27 = filterIterator25.getPredicate();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) filterIterator25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10.0d + "'", obj24.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        java.lang.Object obj32 = defaultedMap24.get((java.lang.Object) filterIterator29);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        java.util.Collection collection35 = defaultedMap24.values();
        int i36 = defaultedMap24.size();
        java.lang.String str37 = defaultedMap24.toString();
        boolean b38 = defaultedMap1.equals((java.lang.Object) str37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0d + "'", obj32.equals(10.0d));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap20.isEmpty();
        boolean b23 = defaultedMap20.equals((java.lang.Object) 100.0d);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10.0d + "'", obj24.equals(10.0d));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap19.keySet();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        filterIterator24.setPredicate(predicate30);
        boolean b34 = defaultedMap19.containsKey((java.lang.Object) predicate30);
        java.util.Set set35 = defaultedMap19.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b45 = defaultedMap44.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = defaultedMap21.get((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap30.keySet();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator40.setPredicate(predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b45 = defaultedMap30.containsKey((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        filterIterator52.setPredicate(predicate53);
        java.util.Iterator iterator55 = null;
        collections.Predicate predicate56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        filterIterator57.setPredicate(predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate58);
        java.lang.Object obj61 = defaultedMap30.get((java.lang.Object) predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate58);
        boolean b63 = defaultedMap1.containsValue((java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) "hi!");
        boolean b68 = defaultedMap1.equals((java.lang.Object) defaultedMap65);
        java.lang.String str69 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0d + "'", obj27.equals(10.0d));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 10.0d + "'", obj61.equals(10.0d));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) filterIterator18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate29);
        java.lang.Object obj31 = defaultedMap23.get((java.lang.Object) filterIterator28);
        defaultedMap15.putAll((java.util.Map) defaultedMap23);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) filterIterator38);
        boolean b43 = defaultedMap35.containsValue((java.lang.Object) (byte) 1);
        int i44 = defaultedMap35.size();
        java.util.Collection collection45 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap35);
        java.util.Set set47 = defaultedMap35.entrySet();
        java.util.Set set48 = defaultedMap35.keySet();
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) set48);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0d + "'", obj21.equals(10.0d));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10.0d + "'", obj31.equals(10.0d));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 10.0d + "'", obj49.equals(10.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate20);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) filterIterator19);
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.lang.Object obj27 = defaultedMap12.put((java.lang.Object) defaultedMap16, (java.lang.Object) filterIterator25);
        boolean b28 = defaultedMap12.isEmpty();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator33.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate34);
        boolean b37 = defaultedMap12.containsValue((java.lang.Object) filterIterator30);
        boolean b39 = defaultedMap12.containsValue((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Set set41 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate47);
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) filterIterator46);
        boolean b51 = defaultedMap43.containsValue((java.lang.Object) (byte) 1);
        int i52 = defaultedMap43.size();
        java.util.Collection collection53 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator58 = null;
        collections.Predicate predicate59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        filterIterator60.setPredicate(predicate61);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) filterIterator60);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) '#');
        java.lang.Object obj66 = defaultedMap43.remove((java.lang.Object) defaultedMap55);
        java.util.Set set67 = defaultedMap55.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap55);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0d + "'", obj22.equals(10.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 10.0d + "'", obj49.equals(10.0d));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 10.0d + "'", obj63.equals(10.0d));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) filterIterator22);
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        int i28 = defaultedMap19.size();
        java.util.Collection collection29 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Set set31 = defaultedMap19.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator35 = null;
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) filterIterator37);
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) (byte) 1);
        int i43 = defaultedMap34.size();
        java.util.Collection collection44 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap34);
        defaultedMap45.clear();
        java.util.Set set47 = defaultedMap45.entrySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) set47);
        java.util.Set set49 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10.0d + "'", obj25.equals(10.0d));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 10.0d + "'", obj40.equals(10.0d));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate12);
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate12);
        int i15 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) filterIterator20);
        boolean b25 = defaultedMap17.containsValue((java.lang.Object) (byte) 1);
        int i26 = defaultedMap17.size();
        java.util.Collection collection27 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        java.util.Set set29 = defaultedMap17.entrySet();
        java.util.Set set30 = defaultedMap17.keySet();
        java.lang.String str31 = defaultedMap17.toString();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator41 = null;
        collections.Predicate predicate42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        filterIterator43.setPredicate(predicate44);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) filterIterator43);
        java.util.Set set47 = defaultedMap38.keySet();
        java.lang.Object obj49 = defaultedMap34.put((java.lang.Object) defaultedMap38, (java.lang.Object) 10L);
        boolean b50 = defaultedMap1.containsKey(obj49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate60);
        java.lang.Object obj62 = defaultedMap56.get((java.lang.Object) filterIterator59);
        boolean b64 = defaultedMap56.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        java.lang.Object obj67 = defaultedMap52.put((java.lang.Object) defaultedMap56, (java.lang.Object) filterIterator65);
        java.util.Set set68 = defaultedMap56.entrySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator71 = null;
        collections.Predicate predicate72 = null;
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        filterIterator73.setPredicate(predicate74);
        java.lang.Object obj76 = defaultedMap70.get((java.lang.Object) filterIterator73);
        boolean b78 = defaultedMap70.containsValue((java.lang.Object) (byte) 1);
        int i79 = defaultedMap70.size();
        java.util.Collection collection80 = defaultedMap70.values();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap70);
        java.util.Set set82 = defaultedMap70.entrySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap70);
        defaultedMap1.putAll((java.util.Map) defaultedMap70);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10.0d + "'", obj23.equals(10.0d));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 10.0d + "'", obj46.equals(10.0d));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 10.0d + "'", obj62.equals(10.0d));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 10.0d + "'", obj76.equals(10.0d));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(set82);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap24.keySet();
        java.util.Iterator iterator28 = null;
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator29);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator28, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) filterIterator40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator49 = null;
        collections.Predicate predicate50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate52);
        java.lang.Object obj54 = defaultedMap48.get((java.lang.Object) filterIterator51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate62);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58);
        java.util.Iterator iterator66 = filterIterator58.getIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate67);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate67);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate33, predicate67);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate33);
        boolean b73 = defaultedMap1.containsKey((java.lang.Object) filterIterator72);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10.0d + "'", obj19.equals(10.0d));
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 10.0d + "'", obj43.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 10.0d + "'", obj54.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) filterIterator21);
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        filterIterator27.setPredicate(predicate28);
        filterIterator21.setIterator((java.util.Iterator) filterIterator27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate28);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator3.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate13);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) filterIterator17);
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.lang.Object obj25 = defaultedMap10.put((java.lang.Object) defaultedMap14, (java.lang.Object) filterIterator23);
        boolean b26 = defaultedMap10.isEmpty();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate32);
        boolean b35 = defaultedMap10.containsValue((java.lang.Object) filterIterator28);
        java.util.Iterator iterator36 = filterIterator28.getIterator();
        filterIterator8.setIterator(iterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0d + "'", obj20.equals(10.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(iterator36);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator5 = null;
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator12 = filterIterator4.getIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.lang.String str19 = defaultedMap1.toString();
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator2.setIterator((java.util.Iterator) filterIterator10);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10.0d + "'", obj13.equals(10.0d));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap19.keySet();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        filterIterator24.setPredicate(predicate30);
        boolean b34 = defaultedMap19.containsKey((java.lang.Object) predicate30);
        java.util.Set set35 = defaultedMap19.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap5.containsKey((java.lang.Object) defaultedMap38);
        java.util.Collection collection43 = defaultedMap38.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d + "'", obj41.equals(10.0d));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.util.Collection collection18 = defaultedMap5.values();
        int i19 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        java.lang.Object obj24 = defaultedMap5.remove((java.lang.Object) defaultedMap21);
        java.util.Set set25 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator19 = filterIterator11.getIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        java.util.Iterator iterator23 = filterIterator8.getIterator();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) filterIterator14);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator27);
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.lang.Object obj35 = defaultedMap20.put((java.lang.Object) defaultedMap24, (java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        filterIterator42.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate43);
        filterIterator37.setPredicate(predicate43);
        filterIterator33.setPredicate(predicate43);
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) predicate43);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0d + "'", obj30.equals(10.0d));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) filterIterator9);
        boolean b14 = defaultedMap6.containsValue((java.lang.Object) (byte) 1);
        int i15 = defaultedMap6.size();
        java.util.Collection collection16 = defaultedMap6.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 10.0d + "'", obj12.equals(10.0d));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator17 = null;
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        filterIterator19.setPredicate(predicate20);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) filterIterator19);
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.lang.Object obj27 = defaultedMap12.put((java.lang.Object) defaultedMap16, (java.lang.Object) filterIterator25);
        boolean b28 = defaultedMap12.isEmpty();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator33.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate34);
        boolean b37 = defaultedMap12.containsValue((java.lang.Object) filterIterator30);
        boolean b39 = defaultedMap12.containsValue((java.lang.Object) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Set set41 = defaultedMap12.keySet();
        int i42 = defaultedMap12.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0d + "'", obj22.equals(10.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) filterIterator19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator29 = null;
        collections.Predicate predicate30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) filterIterator31);
        boolean b36 = defaultedMap28.containsValue((java.lang.Object) (byte) 1);
        int i37 = defaultedMap28.size();
        java.util.Collection collection38 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        java.util.Set set40 = defaultedMap39.keySet();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) set40, (java.lang.Object) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 10.0d + "'", obj34.equals(10.0d));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap8.keySet();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate19);
        filterIterator13.setPredicate(predicate19);
        boolean b23 = defaultedMap8.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate36);
        java.lang.Object obj39 = defaultedMap8.get((java.lang.Object) predicate36);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set41 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.Object obj46 = defaultedMap43.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap48.isEmpty();
        boolean b51 = defaultedMap48.equals((java.lang.Object) 100.0d);
        java.util.Set set52 = defaultedMap48.keySet();
        boolean b53 = defaultedMap43.equals((java.lang.Object) defaultedMap48);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10.0d + "'", obj39.equals(10.0d));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 10.0d + "'", obj46.equals(10.0d));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 10.0d + "'", obj54.equals(10.0d));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        java.util.Iterator iterator10 = filterIterator1.getIterator();
        java.util.Iterator iterator11 = filterIterator1.getIterator();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) filterIterator21);
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) defaultedMap18, (java.lang.Object) filterIterator27);
        java.util.Set set30 = defaultedMap18.entrySet();
        java.util.Collection collection31 = defaultedMap18.values();
        int i32 = defaultedMap18.size();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) i32);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10.0d + "'", obj24.equals(10.0d));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10.0d + "'", obj33.equals(10.0d));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator21.setPredicate(predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate22);
        int i25 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) filterIterator30);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) (byte) 1);
        int i36 = defaultedMap27.size();
        java.util.Collection collection37 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        java.util.Set set39 = defaultedMap27.entrySet();
        java.util.Set set40 = defaultedMap27.keySet();
        java.lang.String str41 = defaultedMap27.toString();
        boolean b42 = defaultedMap11.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.lang.String str44 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10.0d + "'", obj33.equals(10.0d));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        try {
            java.lang.Object obj11 = filterIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap12.clear();
        java.util.Set set14 = defaultedMap12.entrySet();
        int i15 = defaultedMap12.size();
        java.util.Set set16 = defaultedMap12.keySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator22 = filterIterator14.getIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate30);
        filterIterator24.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator38 = null;
        collections.Predicate predicate39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj43 = defaultedMap35.get((java.lang.Object) filterIterator40);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate30, predicate44);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 10.0d + "'", obj43.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) filterIterator17);
        boolean b22 = defaultedMap14.containsValue((java.lang.Object) (byte) 1);
        int i23 = defaultedMap14.size();
        java.util.Collection collection24 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        defaultedMap25.clear();
        java.util.Set set27 = defaultedMap25.entrySet();
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) set27);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0d + "'", obj20.equals(10.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate17);
        filterIterator11.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) filterIterator27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 100L);
        java.util.Set set35 = defaultedMap32.keySet();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        filterIterator42.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate43);
        filterIterator37.setPredicate(predicate43);
        boolean b47 = defaultedMap32.containsKey((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        filterIterator54.setPredicate(predicate55);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate60);
        java.lang.Object obj63 = defaultedMap32.get((java.lang.Object) predicate60);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        java.util.Iterator iterator66 = null;
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        filterIterator68.setPredicate(predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate60, predicate69);
        filterIterator11.setPredicate(predicate60);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0d + "'", obj30.equals(10.0d));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 10.0d + "'", obj63.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) filterIterator10);
        java.util.Set set14 = defaultedMap5.keySet();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10L);
        int i17 = defaultedMap5.size();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator27 = filterIterator19.getIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator31 = filterIterator19.getIterator();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator19);
        collections.Predicate predicate33 = filterIterator19.getPredicate();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10.0d + "'", obj13.equals(10.0d));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(predicate33);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) 100);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap12.clear();
        java.util.Set set14 = defaultedMap12.entrySet();
        int i15 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) filterIterator20);
        boolean b25 = defaultedMap17.containsValue((java.lang.Object) (byte) 1);
        int i26 = defaultedMap17.size();
        java.util.Collection collection27 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        defaultedMap28.clear();
        boolean b30 = defaultedMap12.containsKey((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10.0d + "'", obj23.equals(10.0d));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        java.util.Iterator iterator10 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) filterIterator10);
        java.util.Set set14 = defaultedMap5.keySet();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 10L);
        boolean b17 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator20 = null;
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) filterIterator22);
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        int i28 = defaultedMap19.size();
        java.util.Collection collection29 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Collection collection31 = defaultedMap30.values();
        java.util.Set set32 = defaultedMap30.keySet();
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) set32);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap1.equals(obj34);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 10.0d + "'", obj13.equals(10.0d));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10.0d + "'", obj25.equals(10.0d));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) filterIterator14);
        int i16 = defaultedMap1.size();
        java.util.Set set17 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Collection collection12 = defaultedMap1.values();
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate7);
        filterIterator1.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator20 = filterIterator12.getIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.util.Iterator iterator25 = null;
        collections.Predicate predicate26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        filterIterator27.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate28);
        filterIterator22.setPredicate(predicate28);
        filterIterator1.setPredicate(predicate28);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate28);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator2.setPredicate(predicate3);
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator10 = null;
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        filterIterator12.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate13);
        filterIterator7.setPredicate(predicate13);
        filterIterator2.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Collection collection12 = defaultedMap1.values();
        int i13 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator25.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate26);
        boolean b30 = defaultedMap15.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator39);
        boolean b44 = defaultedMap36.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        java.lang.Object obj47 = defaultedMap32.put((java.lang.Object) defaultedMap36, (java.lang.Object) filterIterator45);
        java.util.Set set48 = defaultedMap36.entrySet();
        java.lang.String str49 = defaultedMap36.toString();
        defaultedMap36.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        java.util.Iterator iterator57 = null;
        collections.Predicate predicate58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate60);
        java.lang.Object obj63 = defaultedMap36.put((java.lang.Object) map54, (java.lang.Object) filterIterator56);
        java.lang.Object obj64 = defaultedMap1.put((java.lang.Object) b30, (java.lang.Object) filterIterator56);
        java.util.Collection collection65 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 10.0d + "'", obj42.equals(10.0d));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) 1.0d);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator14 = null;
        collections.Predicate predicate15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) filterIterator16);
        boolean b21 = defaultedMap13.containsValue((java.lang.Object) (byte) 1);
        int i22 = defaultedMap13.size();
        java.util.Collection collection23 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) filterIterator30);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) '#');
        java.lang.Object obj36 = defaultedMap13.remove((java.lang.Object) defaultedMap25);
        java.util.Set set37 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator44 = null;
        collections.Predicate predicate45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate47);
        java.lang.Object obj49 = defaultedMap43.get((java.lang.Object) filterIterator46);
        boolean b51 = defaultedMap43.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        java.lang.Object obj54 = defaultedMap39.put((java.lang.Object) defaultedMap43, (java.lang.Object) filterIterator52);
        boolean b55 = defaultedMap39.isEmpty();
        int i56 = defaultedMap39.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator64 = null;
        collections.Predicate predicate65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator64, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator66.setPredicate(predicate67);
        java.lang.Object obj69 = defaultedMap63.get((java.lang.Object) filterIterator66);
        boolean b71 = defaultedMap63.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        java.lang.Object obj74 = defaultedMap59.put((java.lang.Object) defaultedMap63, (java.lang.Object) filterIterator72);
        java.util.Set set75 = defaultedMap63.entrySet();
        java.lang.String str76 = defaultedMap63.toString();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) (-1.0d));
        java.lang.Object obj79 = defaultedMap25.remove((java.lang.Object) map78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        java.util.Iterator iterator84 = null;
        collections.Predicate predicate85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator84, predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        filterIterator86.setPredicate(predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate87);
        filterIterator81.setPredicate(predicate87);
        boolean b91 = defaultedMap25.containsKey((java.lang.Object) filterIterator81);
        boolean b92 = defaultedMap7.containsValue((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0d + "'", obj10.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10.0d + "'", obj19.equals(10.0d));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10.0d + "'", obj33.equals(10.0d));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 10.0d + "'", obj49.equals(10.0d));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 1);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 10.0d + "'", obj69.equals(10.0d));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) filterIterator18);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '#');
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.util.Set set25 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator34.setPredicate(predicate35);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) filterIterator34);
        boolean b39 = defaultedMap31.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.lang.Object obj42 = defaultedMap27.put((java.lang.Object) defaultedMap31, (java.lang.Object) filterIterator40);
        boolean b43 = defaultedMap27.isEmpty();
        int i44 = defaultedMap27.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator52 = null;
        collections.Predicate predicate53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        filterIterator54.setPredicate(predicate55);
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) filterIterator54);
        boolean b59 = defaultedMap51.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        java.lang.Object obj62 = defaultedMap47.put((java.lang.Object) defaultedMap51, (java.lang.Object) filterIterator60);
        java.util.Set set63 = defaultedMap51.entrySet();
        java.lang.String str64 = defaultedMap51.toString();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1.0d));
        java.lang.Object obj67 = defaultedMap13.remove((java.lang.Object) map66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70);
        java.util.Iterator iterator72 = null;
        collections.Predicate predicate73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator72, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        filterIterator74.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate75);
        filterIterator69.setPredicate(predicate75);
        boolean b79 = defaultedMap13.containsKey((java.lang.Object) filterIterator69);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) filterIterator69);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0d + "'", obj21.equals(10.0d));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 10.0d + "'", obj37.equals(10.0d));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 10.0d + "'", obj57.equals(10.0d));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap8.keySet();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.Predicate predicate17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate19);
        filterIterator13.setPredicate(predicate19);
        boolean b23 = defaultedMap8.containsKey((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator28 = null;
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate36);
        java.lang.Object obj39 = defaultedMap8.get((java.lang.Object) predicate36);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator46 = null;
        collections.Predicate predicate47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate49);
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) filterIterator48);
        boolean b53 = defaultedMap45.containsValue((java.lang.Object) (byte) 1);
        int i54 = defaultedMap45.size();
        java.util.Collection collection55 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap45.put((java.lang.Object) b60, obj61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator69 = null;
        collections.Predicate predicate70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        filterIterator71.setPredicate(predicate72);
        java.lang.Object obj74 = defaultedMap68.get((java.lang.Object) filterIterator71);
        boolean b76 = defaultedMap68.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        java.lang.Object obj79 = defaultedMap64.put((java.lang.Object) defaultedMap68, (java.lang.Object) filterIterator77);
        boolean b80 = defaultedMap64.isEmpty();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        java.util.Iterator iterator83 = null;
        collections.Predicate predicate84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator83, predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        filterIterator85.setPredicate(predicate86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate86);
        boolean b89 = defaultedMap64.containsValue((java.lang.Object) filterIterator82);
        java.lang.Object obj90 = defaultedMap45.get((java.lang.Object) defaultedMap64);
        java.lang.String str91 = defaultedMap45.toString();
        java.lang.Object obj92 = defaultedMap42.get((java.lang.Object) defaultedMap45);
        boolean b93 = defaultedMap8.equals(obj92);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 10.0d + "'", obj39.equals(10.0d));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 10.0d + "'", obj51.equals(10.0d));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 10.0d + "'", obj74.equals(10.0d));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 10.0d + "'", obj90.equals(10.0d));
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{false=null}" + "'", str91.equals("{false=null}"));
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 10 + "'", obj92.equals(10));
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator6 = null;
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) filterIterator8);
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) filterIterator14);
        boolean b17 = defaultedMap1.isEmpty();
        int i18 = defaultedMap1.size();
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) filterIterator21);
        try {
            filterIterator21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0d + "'", obj11.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator4 = null;
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap11.keySet();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator19 = null;
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate22);
        filterIterator16.setPredicate(predicate22);
        boolean b26 = defaultedMap11.containsKey((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator31 = null;
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator33.setPredicate(predicate34);
        java.util.Iterator iterator36 = null;
        collections.Predicate predicate37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate39);
        java.lang.Object obj42 = defaultedMap11.get((java.lang.Object) predicate39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate48);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate39, predicate48);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        java.util.Iterator iterator54 = null;
        collections.Predicate predicate55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        filterIterator56.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        java.util.Iterator iterator61 = filterIterator53.getIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 10.0d + "'", obj42.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        collections.Predicate predicate13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator19 = filterIterator11.getIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate20);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator4);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i10 = defaultedMap1.size();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) 1.0d);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        filterIterator26.setPredicate(predicate27);
        java.lang.Object obj29 = defaultedMap23.get((java.lang.Object) filterIterator26);
        boolean b31 = defaultedMap23.containsValue((java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj34 = defaultedMap19.put((java.lang.Object) defaultedMap23, (java.lang.Object) filterIterator32);
        boolean b35 = defaultedMap19.isEmpty();
        int i36 = defaultedMap19.size();
        java.util.Iterator iterator37 = null;
        collections.Predicate predicate38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator37, predicate38);
        boolean b40 = defaultedMap19.containsValue((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b45 = defaultedMap42.equals((java.lang.Object) 100.0d);
        java.lang.Object obj47 = defaultedMap42.remove((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap19.equals(obj47);
        java.lang.Object obj49 = defaultedMap13.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10);
        java.util.Collection collection52 = defaultedMap51.values();
        java.util.Set set53 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator56 = null;
        collections.Predicate predicate57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        filterIterator58.setPredicate(predicate59);
        java.lang.Object obj61 = defaultedMap55.get((java.lang.Object) filterIterator58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58);
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        boolean b65 = defaultedMap51.containsKey((java.lang.Object) filterIterator64);
        int i66 = defaultedMap51.size();
        java.util.Collection collection67 = defaultedMap51.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap51);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0d + "'", obj7.equals(10.0d));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d + "'", obj16.equals(10.0d));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10.0d + "'", obj17.equals(10.0d));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10.0d + "'", obj29.equals(10.0d));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 10.0d + "'", obj49.equals(10.0d));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 10.0d + "'", obj61.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(collection67);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator2, predicate3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap6.isEmpty();
        boolean b9 = defaultedMap6.equals((java.lang.Object) 100.0d);
        java.util.Set set10 = defaultedMap6.keySet();
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.util.Collection collection12 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Iterator iterator15 = null;
        collections.Predicate predicate16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        java.lang.Object obj26 = defaultedMap6.get((java.lang.Object) filterIterator25);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d + "'", obj4.equals(10.0d));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0d + "'", obj20.equals(10.0d));
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0d + "'", obj26.equals(10.0d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        java.util.Iterator iterator7 = null;
        collections.Predicate predicate8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator6, predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate21);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap25.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        java.util.Iterator iterator33 = null;
        collections.Predicate predicate34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator33, predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate36);
        filterIterator30.setPredicate(predicate36);
        boolean b40 = defaultedMap25.containsKey((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 100L);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator47.setPredicate(predicate48);
        java.util.Iterator iterator50 = null;
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        filterIterator52.setPredicate(predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate53);
        java.lang.Object obj56 = defaultedMap25.get((java.lang.Object) predicate53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        java.util.Iterator iterator59 = null;
        collections.Predicate predicate60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate53, predicate62);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate62);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set69 = defaultedMap68.keySet();
        java.lang.Object obj71 = defaultedMap68.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b74 = defaultedMap73.isEmpty();
        boolean b76 = defaultedMap73.equals((java.lang.Object) 100.0d);
        java.util.Set set77 = defaultedMap73.keySet();
        boolean b78 = defaultedMap68.equals((java.lang.Object) defaultedMap73);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap68);
        java.util.Collection collection80 = defaultedMap68.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10.0d + "'", obj23.equals(10.0d));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 10.0d + "'", obj56.equals(10.0d));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 10.0d + "'", obj71.equals(10.0d));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(collection80);
    }
}

